package view;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class modifygame extends JFrame implements ActionListener {
	 //定义一些控件
	 JPanel jp1,jp2;
	 JLabel jl1,jl2;
	 JButton jb1,jb2,jb3,jb4,jb5;
	 JTable jt;
	 JScrollPane jsp;
	 JTextField jtf;
	 modifygame2 sm; 
	 //定义连接数据库的变量
	 Statement stat = null;
	 PreparedStatement ps;
	 Connection ct = null;
	 ResultSet rs = null;

		
	  
	 public static void main(String[] args){
		 modifygame modifygame = new modifygame();
		
	 }
	 //构造函数
	 public modifygame(){
	 jp1 = new JPanel();
	 jtf = new JTextField(10);
	 jb1 = new JButton("查询");
	 jb1.addActionListener(this);
	 jl1 = new JLabel("请输入名字：");
	 
	 this.setLocationRelativeTo(null);
	 this.setTitle("元创");
	 Image image = Toolkit.getDefaultToolkit().getImage("img1/7.png");
		setIconImage(image);
	  
	 jp1.add(jl1);
	 jp1.add(jtf);
	 jp1.add(jb1);
	  
	 jb2 = new JButton("添加");
	 jb2.addActionListener(this);
	 jb3 = new JButton("修改");
	 jb3.addActionListener(this);
	 jb4 = new JButton("删除");
	 jb4.addActionListener(this);
	 jb5 = new JButton("返回");
	 jb5.addActionListener(this);
	  
	 jp2 = new JPanel();
	 jp2.add(jb2);
	 jp2.add(jb3);
	 jp2.add(jb4);
	 jp2.add(jb5);
	  
	 //创建模型对象
	 sm = new modifygame2();
	  
	  
	 //初始化
	 jt = new JTable(sm);
	  
	 jsp = new JScrollPane(jt);
	  
	 //将jsp放入到jframe中
	 this.add(jsp);
	 this.add(jp1,"North");
	 this.add(jp2,"South");
	 this.setSize(600, 400);
	 //this.setLocation(300, 200);
	 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	 this.setVisible(true);
		this.setLocationRelativeTo(null);
	  
	 }
	 public void actionPerformed(ActionEvent arg0) {
	 //判断是哪个按钮被点击
	 if(arg0.getSource() == jb1){
	 System.out.println("用户希望被查询...");
	 //因为把对表的数据封装到StuModel中，可以比较简单的完成查询
	 String name = this.jtf.getText().trim();
	 //写一个sql语句
	 String sql = "select * from allgame where name = '"+name+"'";
	 //构建一个数据模型类，并更新
	 sm = new modifygame2(sql);
	 //更新jtable
	 jt.setModel(sm);
	  
	 }else if (arg0.getSource() == jb5){
		 
		 new AdminitratorInterface5().setVisible(true);
		 this.dispose();
	 }
	  
	 //一、弹出添加界面
	 else if(arg0.getSource() == jb2){
	 System.out.println("添加...");
	 modifygame3 sa = new modifygame3(this,"添加学生",true);

	  
	 //重新再获得新的数据模型,
	 sm = new modifygame2();
	 jt.setModel(sm);
	 }else if(arg0.getSource() == jb4){
	 //二、删除记录
	 //1.得到学生的ID
	 int rowNum = this.jt.getSelectedRow();//getSelectedRow会返回给用户点中的行
	 //如果该用户一行都没有选，就返回-1
	 if(rowNum == -1){
	 //提示
	 JOptionPane.showMessageDialog(this, "请选中一行");
		this.setLocationRelativeTo(null);
	 return ;
	 }
	 //得到学术ID
	 String stuId = (String)sm.getValueAt(rowNum, 0);
	 System.out.println("Id： "+stuId);
	  
	 //连接数据库,完成删除任务
	 try{
	 //1.加载驱动
	 Class.forName("com.mysql.jdbc.Driver"); 
	 //2.连接数据库
	 String url = "jdbc:mysql://127.0.0.1:3306/game";
	 String user = "root";
	 String passwd = "123456";
	  
	 ct = DriverManager.getConnection(url, user, passwd);
	 System.out.println("连接成功");
	 ps = ct.prepareStatement("delete from allgame where name = ?");
	 ps.setString(1,stuId);
	 ps.executeUpdate();
	   
	 }catch(Exception e){
	 e.printStackTrace();
	 }finally{
	 try{
	 if(rs!= null){
	 rs.close();
	 rs = null;
	   
	 }
	 if(ps!= null){
	 ps.close();
	 ps = null;
	 }
	 if(ct != null){
	 ct.close();
	 ct = null;
	 }
	 } catch(Exception e){
	 e.printStackTrace();
	 }
	 }
	 sm = new modifygame2();
	 //更新jtable
	 jt.setModel(sm); 
	 }else if(arg0.getSource() == jb3){
		 this.dispose();
	 System.out.println("11111");
	 //三、用户希望修改
	 int rowNum = this.jt.getSelectedRow();
	 if(rowNum == -1){
	 	this.setLocationRelativeTo(null);
	 JOptionPane.showMessageDialog(this, "请选择一行");
	 return ;
	 }
	 //显示对话框
	 System.out.println( "12435");
	 modifygame1 su = new modifygame1(this, "修改游戏", true, sm, rowNum);
	 sm = new modifygame2();
	 
	 jt.setModel(sm);
	 } 
	 }
	}


