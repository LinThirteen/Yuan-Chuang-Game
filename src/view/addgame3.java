package view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
 
public class addgame3 extends JDialog implements ActionListener {
	 //定义我需要的swing组件
	 JLabel jl1,jl2,jl3;
	 JTextField jf1,jf2,jf3;
	 JPanel jp1,jp2,jp3;
	 JButton jb1,jb2;
	 //owner代笔父窗口,title是窗口的名字,modal指定是模式窗口()或者非模式窗口
	 public addgame3(Frame owner,String title, boolean modal){
	 //调用父类方法
	 super(owner,title,modal);
	  
	    this.setLocationRelativeTo(null);
	    Image image = Toolkit.getDefaultToolkit().getImage("img1/7.png");
		setIconImage(image);
	 jl1 = new JLabel("游戏名");
	 jl2 = new JLabel("id");
	 

	  
	 jf1 = new JTextField(10);
	 jf2 = new JTextField(10);
	

	  
	 jb1 = new JButton("添加");
	 jb1.addActionListener(this);
	 jb2 = new JButton("取消");
	  
	 jp1 = new JPanel();
	 jp2 = new JPanel();
	 jp3 = new JPanel();
	  
	 //设置布局
	 jp1.setLayout(new GridLayout(6,1));
	 jp2.setLayout(new GridLayout(6,1));
	  
	 jp3.add(jb1);
	 jp3.add(jb2);
	  
	 jp1.add(jl1);
	 jp1.add(jl2);

	;
	  
	 jp2.add(jf1);
	 jp2.add(jf2);
	

	  
	 this.add(jp1, BorderLayout.WEST);
	 this.add(jp2, BorderLayout.CENTER);
	 this.add(jp3, BorderLayout.SOUTH);
	  
	 this.setSize(300,200);
	 this.setVisible(true);
	 }
	 @Override
	 public void actionPerformed(ActionEvent e) {
	 // TODO Auto-generated method stub
	 if(e.getSource() == jb1){
	 Connection ct = null;
	 PreparedStatement pstmt = null;
	 ResultSet rs = null;
	  
	 try{
	 //1.加载驱动
	 Class.forName("com.mysql.jdbc.Driver");
	 System.out.println("加载成功");
	 //2.连接数据库
	 //定义几个常量
	 String url = "jdbc:mysql://127.0.0.1:3306/game";
	 String user = "root";
	 String passwd = "123456";
	 ct = DriverManager.getConnection(url,user,passwd);
	  
	 //与编译语句对象
	  
	 String strsql = "insert into addcollect values(?,?)";
	 pstmt = ct.prepareStatement(strsql);
	  
	 //给对象赋值
	 pstmt.setString(1,jf1.getText());
	 pstmt.setString(2,jf2.getText());
	 

	  
	 pstmt.executeUpdate();
	  
	 this.dispose();//关闭学生对话框
	  
	 }catch(Exception arg1){
	 arg1.printStackTrace();
	 }finally{
	 try{
	 if(rs!=null){
	 rs.close();
	 rs = null;
	  }
	 if(pstmt != null){
	 pstmt.close();
	 pstmt = null;
	  }
	 if(ct != null){
	 ct.close();
	 ct = null;
	  } 
	 }catch(Exception arg2){
	  arg2.printStackTrace();
	 }
	 }
	  
	 }
	  
	 }
	  
	  
	}

