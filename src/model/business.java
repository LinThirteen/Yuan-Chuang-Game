package model;

import java.io.IOException;
import java.io.Serializable;
import java.net.UnknownHostException;
import java.util.ArrayList;

import Server.Client;

public class business implements Serializable {
	private String name;
	
	private String pw;
	public business(String name, String pw) {
		super();
		this.name = name;
		
		this.pw = pw;
		
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}

	public String getpw() {
		return pw;
	}
	public void setpw(String pw) {
		this.pw =pw;
	}
 public ArrayList<business> businessviewData()throws IOException, ClassNotFoundException,UnknownHostException{
    	 
    	 Client c = new Client();
    	return  c.businessviewData();
    	} 
    	 
    	public  business(){
    		
    	}

}