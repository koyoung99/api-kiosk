package com.javaex.vo;

public class UserVo {
	
	private String hp;
	private int no;
	private int point;
	
	
	public UserVo() {
	}

	public UserVo(String hp, int no, int point) {
		super();
		this.hp = hp;
		this.no = no;
		this.point = point;
	}
	

	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}

	
	@Override
	public String toString() {
		return "UserVo [hp=" + hp + ", no=" + no + ", point=" + point + "]";
	}
	
	
	
}
