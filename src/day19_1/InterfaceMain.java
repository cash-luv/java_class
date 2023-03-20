package day19_1;

public class InterfaceMain {

	public static void main(String[] args) {
		// 인터페이스 객체 생성 (x)
//		InterfaceEx if1 = new InterfaceEx();
		// 아래와 같은 방식으로는 잘 사용하지 않음 . (인터페이스 쓸 이유 없음)
		ImplClass1 ipc1 = new ImplClass1();
		/**
		 * 메서드, 클래스를 위한 주석
		 * 좌변: 인터페이스 타입의 객체로 선언
		 * 우변: 구현 클래스 생성자 
		 */
		InterfaceEx if1 = new ImplClass1();
		if1.hello();
		
		InterfaceEx if2 = new ImplClass2();
		if2.hello();
		
		InterfaceEx if3 = new ImplClass1();
		if3.hello();
		if3 = new ImplClass2();
		if3.hello();
	}

}
