package model;

import java.io.IOException;
import java.io.Serializable;
import java.net.UnknownHostException;
import java.util.ArrayList;

import Server.Client;

public class user implements Serializable{

	private String name;	
	private String pw;
	public user(String name, String pw) {
		super();
		this.name = name;
	
		this.pw = pw;
		
	}
	public String getUu() {
		return name;
	}
	public void setUu(String name) {
		this.name = name;
	}
	
	public String getUpw() {
		return pw;
	}
	public void setUpw(String pw) {
		this.pw = pw;
	}
     public ArrayList<user> viewData()throws IOException, ClassNotFoundException,UnknownHostException{
    	 
    	 Client c = new Client();
    	return  c.viewData();
    	} 
    	 
    	public  user(){
    		
    	}
     
}