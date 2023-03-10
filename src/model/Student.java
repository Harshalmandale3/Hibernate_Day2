package model;

public class Student {
	
	private int sroll;
	private String sname;
	private String smarks;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Student(String sname, String smarks) {
		super();
		this.sname = sname;
		this.smarks = smarks;
	}



	public Student(int sroll, String sname, String smarks) {
		super();
		this.sroll = sroll;
		this.sname = sname;
		this.smarks = smarks;
	}
	
	public int getSroll() {
		return sroll;
	}
	public void setSroll(int sroll) {
		this.sroll = sroll;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSmarks() {
		return smarks;
	}
	public void setSmarks(String smarks) {
		this.smarks = smarks;
	}
	
	

}
