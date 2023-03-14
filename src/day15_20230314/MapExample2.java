package day15_20230314;

import java.util.*;

public class MapExample2 {

	public static void main(String[] args) {
		Map<String, String > map2 = new HashMap<>();
		map2.put("첫번째", "java");
		map2.put("두번째", "mysql");
		map2.put("세번째", "String");
		
		System.out.println(map2.get("두번째"));
		//map 은 키로 접근을 해야 한다 
		map2.remove("세번째");
		//map 반복문으로 접근 
		//키로 이루어진 데이터 덩어리(keySet)
		for(String key: map2.keySet()) {
			System.out.println(key); // key 값 확인
			System.out.println(map2.get(key)); //value 값 확인
		}
	}

}
