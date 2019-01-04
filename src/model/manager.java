package model;

import java.io.Serializable;

public class manager implements Serializable {
	private String name;
	
	private String pw;
	public manager(String name, String pw) {
		super();
		this.name = name;
		
		this.pw = pw;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getMpw() {
		return pw;
	}
	public void setMpw(String pw) {
		this.pw =pw;
	}

}
