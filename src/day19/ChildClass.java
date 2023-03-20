package day19;

public class ChildClass extends ParentClass{
	public ChildClass() {
		System.out.println("자식 클래스 생성자");
	}
	
	//Hello 재정의
	@Override //자바 컴파일러에게 재정의 할 것이다 라고 알려주는 것
	public void hello() {
		System.out.println("자식 Hello");
	}
	
	//hi 재정의
	@Override
	public void hi() {
		System.out.println("자식 hi");
	}
}	
