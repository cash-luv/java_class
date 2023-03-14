package day15_20230314;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		// Map 이라는 인터페이스에 	 HashMap 이라는 클래스의 생성자를 사용
		// Map 을 사용할때는 어떤타입의 키를 쓸건지와 어떤 타입의 벨류를 쓸건지 정해줘야함
		// Map 이라는 인터페이스의 주요 메서드는 get() , put() , remove() 가 있다
		Map<Integer, String> map1 = new HashMap<>();
		
		// List이라는 인터페이스에 	ArrayList 라는 클래스의 생성자를 사용
		List<String> list1 = new ArrayList<>();
		
		map1.put(1, "안녕하세요");
		System.out.println(map1.put(2, "Hello"));
		String val1 = map1.get(2);
		System.out.println(val1);
		
		map1.remove(2);
		
		for(int key: map1.keySet()) {
			System.out.println(key); // key 값 확인
			System.out.println(map1.get(key)); //value 값 확인
	}
	}

}
