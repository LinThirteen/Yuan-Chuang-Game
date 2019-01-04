package Server;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import Server.Server;



import model.allgame;
import model.business;
import model.manager;
import model.person;
import model.personal;
import model.user;
import Server.DataConnect;

public class Server {
	ObjectInputStream ois;//对象输入流
	ObjectOutputStream oos;//对象输出流
	Socket s;
	final int userLogin= 1001;
	final int userBuild = 1002;
	final int businessLogin= 1003;
	final int businessBuild = 1004;
	final int managerLogin = 1005;
	final int viewannouncement = 1006;
	final int chatannouncement = 1007;
	final int comment = 1008;
	final int usercomment= 1009;
	final int businesscomment= 1012;
	final int UPLOAD = 1013;
	final int advertisement = 1015;
	final int manageradvertisement = 1016;

	
	

public Server() throws IOException, ClassNotFoundException, SQLException {
	ServerSocket ss = new ServerSocket(58585);

	
	while (true) {
		s = ss.accept();
		ois = new ObjectInputStream(s.getInputStream());
		oos = new ObjectOutputStream(s.getOutputStream());
		int command = ois.readInt();
		if (command == 1000) {
			String sql = "select * from  user";
			ResultSet rs = DataConnect.getStatement().executeQuery(sql);
			ArrayList<user> users = new ArrayList<user>();
			while(rs.next()){
				users.add(new user(rs.getString(1),rs.getString(2)));
			}
			oos.writeObject(users);//写入对象
			oos.flush();//冲马桶
			
			
		}if (command == 1010) {
			String sql = "select * from  person";
			ResultSet rs = DataConnect.getStatement().executeQuery(sql);
			ArrayList<person> persons = new ArrayList<person>();
			while(rs.next()){
				persons.add(new person(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));		
				}
			oos.writeObject(persons);
			oos.flush();
		}
		
		if (command == 1011) {
			String sql = "select * from  business";
			ResultSet rs = DataConnect.getStatement().executeQuery(sql);
			ArrayList<business> businesss = new ArrayList<business>();
			while(rs.next()){
				businesss.add(new business(rs.getString(1),rs.getString(2)));		
				}
			oos.writeObject(businesss);
			oos.flush();
		}if (command == 1020) {
			String sql = "select * from  allgame";
			ResultSet rs = DataConnect.getStatement().executeQuery(sql);
			ArrayList<allgame> allgames = new ArrayList<allgame>();
			while(rs.next()){
				allgames.add(new allgame(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));		
				}
			oos.writeObject(allgames);
			oos.flush();
		}
		if (command == userLogin) {
			userLogin();
		}
		if (command ==userBuild) {
			userBuild();
		}
		if (command == businessLogin) {
			businessLogin();

		}
		if (command == businessBuild) {
			businessBuild();
		}
		if (command == managerLogin) {
			managerLogin();
		}
		if (command == viewannouncement) {
			viewannouncement();

		}
		if (command == chatannouncement) {
			chatannouncement();
		}
		if (command == comment) {
			comment();

		}
		if (command == usercomment) {
			usercomment();
		}
		if (command == businesscomment) {
			businesscomment();
		}
		if (command == advertisement) {
			advertisement();

		}
		if (command == manageradvertisement) {
			manageradvertisement();
		}
		
	}
}

//用户
public void userLogin() throws IOException, ClassNotFoundException, SQLException{
	user u = null;
	String name =ois.readUTF();
	String pw = ois.readUTF();
	String sql = "select * from user where name='"+name+"' and pw ='"+pw+"'";
	ResultSet rs = DataConnect.getStatement().executeQuery(sql);
	if(rs.next())
		u = new user(rs.getString(1),rs.getString(2));
	oos.writeObject(u);
	oos.flush();
	
}
public void userBuild() throws IOException, ClassNotFoundException{
	user u = null;
	String name =ois.readUTF();
	String pw = ois.readUTF();

	String sql = "insert into user values('"+name+"','"+pw+"')";
	try {
		DataConnect.getStatement().executeUpdate(sql);
		oos.writeObject(new user(name,pw));
		oos.flush();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		oos.writeObject(null);
		oos.flush();
	}
}
//商家
public void businessLogin() throws IOException, ClassNotFoundException, SQLException{
	business b = null;
	String name =ois.readUTF();
	String pw = ois.readUTF();
	String sql = "select * from business where name='"+name+"' and pw ='"+pw+"'";
	ResultSet rs = DataConnect.getStatement().executeQuery(sql);
	if(rs.next())
		b = new business(rs.getString(1),rs.getString(2));
	oos.writeObject(b);
	oos.flush();
	
}
public void businessBuild() throws IOException, ClassNotFoundException{
	business b = null;
	String name =ois.readUTF();
	String pw = ois.readUTF();

	String sql = "insert into business values('"+name+"','"+pw+"')";
	try {
		DataConnect.getStatement().executeUpdate(sql);
		oos.writeObject(new business(name,pw));
		oos.flush();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		oos.writeObject(null);
		oos.flush();
	}
}
public void managerLogin() throws IOException, ClassNotFoundException, SQLException{
	manager m = null;
	String name =ois.readUTF();
	String pw = ois.readUTF();
	String sql = "select * from manager where name='"+name+"' and pw ='"+pw+"'";
	ResultSet rs = DataConnect.getStatement().executeQuery(sql);
	if(rs.next())
		m = new manager(rs.getString(1),rs.getString(2));
	oos.writeObject(m);
	oos.flush();
	
}
public void viewannouncement() throws IOException, SQLException, ClassNotFoundException{
	String sql = "select * from announcement";
	ResultSet rs = DataConnect.getStatement().executeQuery(sql);
	String string="";
	while(rs.next()){
		string+="["+rs.getString("name")+"]"+"      "+"("+rs.getString("text")+")";
		string+="\n";
	}
	oos.writeUTF(string);//写入器
	oos.flush();
	
	
}

public void chatannouncement() throws IOException, ClassNotFoundException, SQLException{
	manager m =  (manager) ois.readObject();
	String text = ois.readUTF();
	String sql = "insert into announcement values('"+m.getName()+"','"+text+"')";	
		DataConnect.getStatement().executeUpdate(sql);
	
	}
public void deletereason() throws IOException, ClassNotFoundException, SQLException{
	manager m =  (manager) ois.readObject();
	String text = ois.readUTF();
	String sql = "insert into delete values('"+m.getName()+"','"+text+"')";	
		DataConnect.getStatement().executeUpdate(sql);
	
	}
public void comment() throws IOException, SQLException, ClassNotFoundException{
	String sql = "select * from comment";
	ResultSet rs = DataConnect.getStatement().executeQuery(sql);
	String string="";
	while(rs.next()){
		string+="["+rs.getString("name")+"]"+"      "+"("+rs.getString("text")+")"+"/"+rs.getString("time");
		string+="\n";
	}
	oos.writeUTF(string);//写入器
	oos.flush();
	
}

public void usercomment() throws IOException, ClassNotFoundException, SQLException{
	user u =  (user) ois.readObject();
	String text = ois.readUTF();
	String sql = "insert into comment values('"+u.getUu()+"','"+text+"','"+new Date()+"')";	
		DataConnect.getStatement().executeUpdate(sql);
	
	}
public void businesscomment() throws IOException, ClassNotFoundException, SQLException{
	business b =  (business) ois.readObject();
	String text = ois.readUTF();
	String sql = "insert into comment values('"+b.getname()+"','"+text+"','"+new Date()+"')";	
		DataConnect.getStatement().executeUpdate(sql);
	
	}
public void advertisement() throws IOException, SQLException, ClassNotFoundException{
	String sql = "select * from advertisement";
	ResultSet rs = DataConnect.getStatement().executeQuery(sql);
	String string="";
	while(rs.next()){
		string+="      "+"("+rs.getString("text")+")";
		string+="\n";
	}
	oos.writeUTF(string);//写入器
	oos.flush();
	
}

public void manageradvertisement() throws IOException, ClassNotFoundException, SQLException{
	manager m =  (manager) ois.readObject();//读取对象
	String text = ois.readUTF();
	String sql = "insert into advertisement values('"+m.getName()+"','"+text+"','"+new Date()+"')";	
		DataConnect.getStatement().executeUpdate(sql);
	
	}


public static void main(String[] args) {
	try {
		new Server();
} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
	//	// TODO Auto-generated catch block
		//e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}

