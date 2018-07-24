package com.sp.springbasic;

public class student {
	
private int sid;

private String sname;

public student(int sid, String sname) {
	
	this.sid = sid;
	this.sname = sname;
}

public int getSid() {
	return sid;
}

public String getSname() {
	return sname;
}


public void d(){
	System.out.println(getSid()+"first program spring"+getSname());
}


}
