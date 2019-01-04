package model;

public class advertisement {
	private String name;
	private String text;
	private String time;
	
	public advertisement( String name, String text, String time) {
		super();
		
		this.name = name;
		this.text = text;
		this.time = time;
		
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String gettext() {
		return text;
	}
	public void setContent(String text) {
		this.text = text;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
	
}



