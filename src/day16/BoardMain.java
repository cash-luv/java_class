package day16;

import java.util.*;

public class BoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BoardService service = new BoardService(); 
		
		while(true) {
			System.out.println("====게시판====");
			System.out.println("1.게시글등록 2.리스트 3.읽기 4.수정 5.삭제 6.테스트데이터입력 7.검색 0.종료");
			System.out.print("선택 >");
			int menu = sc.nextInt();
			
			if(menu==1) {
				service.save();
			}else if (menu ==2) {
				service.findAll();
			}else if (menu ==3) {
				service.findById();
			}else if (menu ==4) {
				service.update();
			}else if (menu ==5) {
				service.delete();
			}else if(menu == 6) {
				service.test();
			}else if(menu ==7) {
				service.search();
			}else if (menu ==0) {
				System.out.println("종료합니다");
				break;
			}else {
				System.out.println("없는 메뉴입니다");
			}
		}
	}
}