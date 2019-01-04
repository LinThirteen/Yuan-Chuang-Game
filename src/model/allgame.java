package model;

import java.io.IOException;
import java.io.Serializable;
import java.net.UnknownHostException;
import java.util.ArrayList;

import Server.Client;

public class allgame implements Serializable {
	private String name;
	private String text;
	private String price;	
	private String style;
	public allgame(String name,String text,String price,String style) {
		super();
		this.name = name;
		this.text = text;
		this.price = price;
		this.style = style;
		
		
		
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
	public void settext(String text ) {
		this.text = text;
	}
    public String getprice() {
	return price;
	}
	public void setprice(String price) {
		this.price = price;
	}

    public String getstyle() {
		return style;
	}
	public void setstyle(String style) {
		this.style = style;
	}
 public ArrayList<allgame> allgameviewData()throws IOException, ClassNotFoundException,UnknownHostException{
    	 
    	 Client c = new Client();
    	return  c.allgameviewData();
    	} 
    	 
    	public  allgame(){
    		
    	}
}