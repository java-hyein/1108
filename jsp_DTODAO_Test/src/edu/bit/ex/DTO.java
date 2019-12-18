package edu.bit.ex;

public class DTO {
	private String ename;
	private String hiredate;
	
	public DTO() {}
	
	public DTO(String ename, String hiredate) {
		this.ename = ename;
		this.hiredate = hiredate;
	}

	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
}
