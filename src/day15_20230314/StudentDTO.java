package day15_20230314;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class StudentDTO {
	private Long id; // 관리번호
	private String sno; //학번
	private String name; //이름
	private String major; //전공
	private String mobile; //전화번호
	
	public StudentDTO() {
		
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno ;
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
	

//	public String toString() {
//		return "StudentDTO [id=" + id + ", sno=" + sno + ", name=" + name + ", major=" + major + ", mobile=" + mobile
//				+ "]";
//	}

	
	@Override
	public int hashCode() {
		return Objects.hash(id, major, mobile, name, sno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentDTO other = (StudentDTO) obj;
		return Objects.equals(id, other.id) && Objects.equals(major, other.major)
				&& Objects.equals(mobile, other.mobile) && Objects.equals(name, other.name)
				&& Objects.equals(sno, other.sno);
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
