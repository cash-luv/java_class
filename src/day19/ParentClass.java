package day19;

public class ParentClass {
	//필드
	public String name;
	
	//생성자
	public ParentClass() {
		System.out.println("부모 기본 생성자");
	}
	
	//메서드
	public void hello() {
		System.out.println("부모 Hello");
	}
	
	private void hi() {
		System.out.println("부모 hi");
	}
}
