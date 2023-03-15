package day16_20230315;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import day15_20230314.StudentDTO;

public class BoardService {
	// 데이터를 가공하는 역할
	BoardRepository br = new BoardRepository();
	Scanner sc = new Scanner(System.in);

	public void save() {
		BoardDTO boardDTO = new BoardDTO();
		System.out.print("제목>> ");
		boardDTO.setTitle(sc.nextLine());
		System.out.print("작성자>>");
		boardDTO.setWriter(sc.next());
		sc.nextLine();
		BoardDTO success = br.save(boardDTO) ;
		if (success == null) {
			System.out.println("게시물 등록완료!");
		} else {
			System.out.println("게시물 등록실패~");
		}

	}

	public void findAll() {
		Map<String , BoardDTO> boardMap = br.findAll();
		System.out.println("글번호\t제목\t작성자\t조회수\t게시일\t");
		System.out.println("||---------------------------------------------||");
		
		for (String bno : boardMap.keySet()) {
			boardMap.get(bno).print();
		}
	}

	public void findById() {
		System.out.print("읽을 글번호>>>");
		String bno = sc.next();
		BoardDTO boardMap = br.findById(bno);
		if (boardMap == null) {
			System.out.println("찾을 수 없는 글입니다");
		} else {
			boardMap.increaseCnt();
			System.out.println("글번호\t제목\t\t작성자\t조회수\t게시일\t");
			System.out.println("||---------------------------------------------||");
			boardMap.print();
		}
	}

	public void update() {
		System.out.print("수정할 글번호>> ");
		String bno = sc.next();sc.nextLine();
		BoardDTO b = br.findById(bno);
		if (b == null) {
			System.out.println("조회할 수 없는 글 번호 입니다");
		} else {
			BoardDTO boardDTO = new BoardDTO();
			System.out.print("수정할 제목>> ");
			boardDTO.setTitle(sc.nextLine());
			System.out.print("수정할 작성자>> ");
			boardDTO.setWriter(sc.next());
			sc.nextLine();
			if (br.update(boardDTO, bno)) {
				System.out.println("업데이트 완료^^!!");
			} else {
				System.out.println("업데이트 실패 ㅋㅋ");
			}
		}
	}

	public void delete() {

		System.out.print("수정할 글번호>> ");
		String bno = sc.next();
		sc.nextLine();
		if (br.delete(bno)) {
			System.out.println("삭제성공");
		} else {
			System.out.println("삭제실패");
		}
	}

	public void testdata() {
		for(int i = 1 ; i <= 5 ; i++) {
			BoardDTO boardDTO = new BoardDTO();
			boardDTO.setTitle("title"+i);
			boardDTO.setWriter("write"+i);
			br.save(boardDTO);
		}
		
	}

//	public void searchByWriter() {
//		System.out.print("읽을 글번호>>>");
//		String num = sc.next();
//		List<BoardDTO> boardList = br.searchByWriter(num);
//		System.out.println("글번호\t제목\t\t작성자\t조회수\t게시일\t");
//		System.out.println("||---------------------------------------------||");
//			for(BoardDTO b : boardList) {
//				if(boardList.equals(num)) {
//					b.print();
//				}
//			}
	@SuppressWarnings("null")
	public void searchByWriter(){
		System.out.print("읽을 게시글>>>");
		String writer = sc.next();
		BoardDTO boardDTO = br.findById(writer);
		if (boardDTO != null) {
			System.out.println("찾을 수 없는 글입니다");
		} else {
			boardDTO.increaseCnt();
			System.out.println("글번호\t제목\t\t작성자\t조회수\t게시일\t");
			System.out.println("||---------------------------------------------||");
			boardDTO.print();
		}
		}
	}


    

	
