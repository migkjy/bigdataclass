package org.zerock.domain;

public class userDto {

	private String uid    ;
	private String upw    ;
	private String uname  ;
	private int    upoint ;

	public userDto() {
		super();
	}

	@Override
	public String toString() {
		return "userDto [uid=" + uid + ", upw=" + upw + ", uname=" + uname + ", uponit=" + upoint + "]";
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUpw() {
		return upw;
	}

	public void setUpw(String upw) {
		this.upw = upw;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getUponit() {
		return upoint;
	}

	public void setUponit(int upoint) {
		this.upoint = upoint;
	}
	
}
