package model;

public class announcement {
	private String name;
	private String text;

	
	public announcement(String name, String text) {
		super();
		this.text = text;
		this.name = name;		
		
	}
	public String getNname() {
		return name;
	}
	public void setNname(String name) {
		this.name = name;
	}
	public String getNtext() {
		return text;
	}
	public void setNtext(String text) {
		this.text = text;
	}

}
