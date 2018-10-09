package org.demo.po;

import java.io.Serializable;

public class UserInfo implements Serializable{
	private int id;
	private String intro;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	
	
}
