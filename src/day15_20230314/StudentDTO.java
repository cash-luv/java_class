package day15_20230314;

import java.util.HashMap;
import java.util.Map;

public class StudentDTO {
	Map<Integer , String> Student = new HashMap<>();
	int sno;
	String name;
	String major;
	String mobile;
	
	public StudentDTO() {
		
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String toString() {
		String str = sno+"\t"+name+"\t"+major+"\t\t"+mobile;
		
		return str;
	}
}
