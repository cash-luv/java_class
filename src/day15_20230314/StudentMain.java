package day15_20230314;

import java.util.HashMap;
import java.util.Map;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDTO s = new StudentDTO();
		Map< Integer , String > map2 = new HashMap<>();
		
		s.setSno(1111);
		s.setName("김자바");
		s.setMajor("컴퓨터공학");
		s.setMobile("010-1111-1111");
		
		map2.put(1, s.toString());
		
		s.setSno(2222);
		s.setName("이자바");
		s.setMajor("경영학");
		s.setMobile("010-2222-2222");
		
		map2.put(2, s.toString());
		
		s.setSno(3333);
		s.setName("박자바");
		s.setMajor("전자공학");
		s.setMobile("010-3333-3333");
		
		map2.put(3, s.toString());
		
		System.out.println("id\t학번\t이름\t학과\t\t핸드폰 번호");
		System.out.println("----------------------------------------------------------------------");
		for(int key : map2.keySet()) {
			System.out.print(key+"\t");
			System.out.println(map2.get(key));
		}
	}

}
