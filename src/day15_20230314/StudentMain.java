package day15_20230314;

import java.util.HashMap;
import java.util.Map;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 학생정보를 관리할 Map
		
		Map< Long , StudentDTO > studentMap = new HashMap<>();
		StudentDTO s = new StudentDTO();
		s.setId(1L);
		s.setSno("1111");
		s.setName("김자바");
		s.setMajor("컴퓨터공학");
		s.setMobile("010-1111-1111");
		
		studentMap.put(s.getId(),s);
		
		StudentDTO s2 = new StudentDTO();
		s2.setId(1L);
		s2.setSno("1111");
		s2.setName("김자바");
		s2.setMajor("컴퓨터공학");
		s2.setMobile("010-1111-1111");
		//두개의 객체를 비교를 할 때 DTO에서 해쉬코드 equals 를 작성해줘야함
		//두 객체의 필드값이 모두 일치하는지 판단하려면 hashCode(), equals() 메서드를 재정의
		System.out.println(s.equals(s2));
		System.out.println(s.getId().equals(s2.getId()));
		
		
		s2.setId(2L);
		s2.setSno("2222");
		s2.setName("이자바");
		s2.setMajor("경영학");
		s2.setMobile("010-2222-2222");
		studentMap.put(s2.getId(),s2);
		
		StudentDTO s3 = new StudentDTO();
		s3.setId(3L);
		s3.setSno("3333");
		s3.setName("박자바");
		s3.setMajor("전자공학");
		s3.setMobile("010-3333-3333");
		
		studentMap.put(s3.getId(),s3);
		//반복문으로 출력
		System.out.println("id\t학번\t이름\t학과\t\t핸드폰 번호");
		System.out.println("----------------------------------------------------------------------");
		for(Long id : studentMap.keySet()) {
			System.out.print(id+"\t");
			System.out.println(studentMap.get(id)); //student 객체
		}
	}

}
