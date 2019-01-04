package Server;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;



import model.allgame;
import model.business;
import model.manager;
import model.person;
import model.personal;
import model.user;

public class Client {
	ObjectInputStream ois;
	ObjectOutputStream oos;
	Socket s;
	final int userLogin= 1001;
	final int userBuild = 1002;
	final int businessLogin= 1003;
	final int businessBuild = 1004;
	final int managerLogin = 1005;
	final int viewannouncement = 1006;
	final int chatannouncement = 1007;
	final int comment= 1008;
	final int usercomment= 1009;
	final int businesscomment= 1012;
	final int UPLOAD = 1013;
	final int advertisement = 1015;
	final int manageradvertisement = 1016;



public Client() throws UnknownHostException, IOException{
	 s = new Socket("127.0.0.1",58585);
	oos = new ObjectOutputStream(s.getOutputStream());
	ois = new ObjectInputStream(s.getInputStream());
}

public user userLogin(String name,String pw) throws IOException, ClassNotFoundException{
	oos.writeInt(userLogin);
	oos.flush();
	oos.writeUTF(name);
	oos.flush();
	oos.writeUTF(pw);
	oos.flush();
	
	return (user)ois.readObject();
	
}
public user userBuild(String name,String pw) throws IOException, ClassNotFoundException{
	oos.writeInt(userBuild);
	oos.flush();
	oos.writeUTF(name);
	oos.flush();

	oos.writeUTF(pw);
	oos.flush();
	return (user)ois.readObject();
	
}
public business businessLogin(String name,String pw) throws IOException, ClassNotFoundException{
	oos.writeInt(businessLogin);
	oos.flush();
	oos.writeUTF(name);
	oos.flush();
	oos.writeUTF(pw);
	oos.flush();
	
	return (business)ois.readObject();
	
}
public business businessBuild(String name,String pw) throws IOException, ClassNotFoundException{
	oos.writeInt(businessBuild);
	oos.flush();
	oos.writeUTF(name);
	oos.flush();
	oos.writeUTF(pw);
	oos.flush();
	
	return (business)ois.readObject();
	
}
public manager managerLogin(String name,String pw) throws IOException, ClassNotFoundException{
	oos.writeInt(managerLogin);
	oos.flush();
	oos.writeUTF(name);
	oos.flush();
	oos.writeUTF(pw);
	oos.flush();
	
	return (manager)ois.readObject();
}
public String viewannouncement() throws IOException{
	oos.writeInt(viewannouncement);
	oos.flush();
	return ois.readUTF();
}
public void chatannouncement(manager m,String text) throws IOException{
	oos.writeInt(chatannouncement);
	oos.flush();
	oos.writeObject(m);
	oos.flush();
	oos.writeUTF(text);
	oos.flush();
}

public String comment() throws IOException{
	oos.writeInt(comment);
	oos.flush();
	return ois.readUTF();
	
}

public void usercomment(user u,String text) throws IOException{
	oos.writeInt(usercomment);
	oos.flush();
	oos.writeObject(u);
	oos.flush();
	oos.writeUTF(text);
	oos.flush();
}
public void businesscomment(business b,String text) throws IOException{
	oos.writeInt(businesscomment);
	oos.flush();
	oos.writeObject(b);
	oos.flush();
	oos.writeUTF(text);
	oos.flush();
}
public String advertisement() throws IOException{
	oos.writeInt(advertisement);
	oos.flush();
	return ois.readUTF();
}
public void manageradvertisement(manager m,String text) throws IOException{
	oos.writeInt(manageradvertisement);
	oos.flush();
	oos.writeObject(m);
	oos.flush();
	oos.writeUTF(text);
	oos.flush();
}

public void uploadFile(File f) {
	// TODO Auto-generated method stub
	
}

@SuppressWarnings("unchecked")
public ArrayList<user> viewData() throws IOException, ClassNotFoundException {
	oos.writeInt(1000);
	oos.flush();
	ArrayList<user> user =(ArrayList<user> ) ois.readObject();
    return user;
	
}
@SuppressWarnings("unchecked")
public ArrayList<person> personviewData() throws IOException, ClassNotFoundException {
	oos.writeInt(1010);
	oos.flush();
	ArrayList<person> person =(ArrayList<person> ) ois.readObject();
    return person;
}


@SuppressWarnings("unchecked")
public ArrayList<business> businessviewData() throws IOException, ClassNotFoundException {
	oos.writeInt(1011);
	oos.flush();
	ArrayList<business> business =(ArrayList<business> ) ois.readObject();
    return business;
}
@SuppressWarnings("unchecked")
public ArrayList<allgame> allgameviewData() throws IOException, ClassNotFoundException {
	oos.writeInt(1020);
	oos.flush();
	ArrayList<allgame> allgame =(ArrayList<allgame> ) ois.readObject();
    return allgame;
}


}