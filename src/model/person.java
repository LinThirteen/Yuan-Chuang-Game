package model;

import java.io.IOException;
import java.io.Serializable;
import java.net.UnknownHostException;
import java.util.ArrayList;

import Server.Client;

public class person implements Serializable {
	private String name;
	private String resume;
	private String sexuality;
	private String region;	
	private String birthday;
	public person(String name,String resume,String sexuality,String region,String birthday) {
		super();
		this.name = name;
		this.resume = resume;
		this.sexuality = sexuality;
		this.region = region;
		this.birthday = birthday;
		
		
		
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getresume() {
		return resume;
	}
	public void setresume(String resume) {
		this.resume = resume;
	}

	public String getsexuality() {
		return sexuality;
	}
	public void setsexuality(String sexuality ) {
		this.sexuality = sexuality;
	}
    public String getregion() {
	return region;
	}
	public void setprice(String region) {
		this.region = region;
	}

    public String getbirthday() {
		return birthday;
	}
	public void setstyle(String birthday) {
		this.birthday = birthday;
	}
 public ArrayList<person> personviewData()throws IOException, ClassNotFoundException,UnknownHostException{
    	 
    	 Client c = new Client();
    	return  c.personviewData();
    	} 
    	 
    	public  person(){
    		
    	}
}
