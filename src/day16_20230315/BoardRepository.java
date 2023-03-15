package day16_20230315;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class BoardRepository {

	Map< String , BoardDTO > boardMap = new HashMap<>();
	
	
	public BoardDTO save(BoardDTO boardDTO ) {
		BoardDTO b = boardMap.put(boardDTO.getBno(), boardDTO);
		return b;
	}
	public Map<String , BoardDTO> findAll() {
		return boardMap;
	}
	public BoardDTO  findById(String bno) {
		for( String b : boardMap.keySet()) {
			if(b.equals(bno)) {
				BoardDTO a = boardMap.get(b);
				return a;
						
			}
		}
		return null;
	}
	public boolean update(BoardDTO boardDTO, String bno) {
		for(String b : boardMap.keySet()) {
			if(boardMap.get(b).getBno().equals(bno)) {
				boardMap.get(b).setTitle(boardDTO.getTitle());
				boardMap.get(b).setWriter(boardDTO.getWriter());
				return true;
			}
		}
		return false;
	}

	public boolean delete(String bno) {
		for (String b : boardMap.keySet()) {
			if (boardMap.get(b).getBno().equals(bno)) {
				boardMap.remove(b);
				return true;
			}
		}
		return false;
	}
//	public List<BoardDTO> searchByWriter(String writer) {
//	    List<BoardDTO> result = new ArrayList<>();
//
//	    for (BoardDTO board : boardMap.values()) {
//	        if (board.getWriter().equals(writer)) {
//	            result.add(board);
//	        }
//	    }
//
//	    return result;
//	}
	public BoardDTO searchByWriter(String writer) {
		List<BoardDTO> list = new ArrayList<>();
		for(BoardDTO b: list) {
			if(b.getBno().equals(writer)) {
				return b;
			}
		}
		return null;
	}
}
