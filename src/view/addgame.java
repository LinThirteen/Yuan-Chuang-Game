package view;

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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class addgame extends JFrame implements ActionListener {
	 //����һЩ�ؼ�
	 JPanel jp1,jp2;
	 JLabel jl1,jl2;
	 JButton jb1,jb2,jb3,jb4,jb5;
	 JTable jt;
	 JScrollPane jsp;
	 JTextField jtf;
	 addgame2 sm; 
	 //�����������ݿ�ı���
	 Statement stat = null;
	 PreparedStatement ps;
	 Connection ct = null;
	 ResultSet rs = null;

		
	  
	 public static void main(String[] args){
		 addgame addgame = new addgame();
		 
		
	 }
	 //���캯��
	 public addgame(){
	this.setLocationRelativeTo(null);
	 jp1 = new JPanel();
	 jtf = new JTextField(10);
	 jb1 = new JButton("��ѯ");
	 jb1.addActionListener(this);
	 jl1 = new JLabel("���������֣�");
	 
	
	 Image image = Toolkit.getDefaultToolkit().getImage("img1/7.png");
		setIconImage(image);
	 jp1.add(jl1);
	 jp1.add(jtf);
	 jp1.add(jb1);
	  
	 jb2 = new JButton("����");
	 jb2.addActionListener(this);
	 jb3 = new JButton("�޸�");
	 jb3.addActionListener(this);
	 jb4 = new JButton("ɾ��");
	 jb4.addActionListener(this);
	 jb5 = new JButton("����");
	 jb5.addActionListener(this);
	  
	 jp2 = new JPanel();
	 jp2.add(jb2);
	 jp2.add(jb3);
	 jp2.add(jb4);
	 jp2.add(jb5);
	  
	 //����ģ�Ͷ���
	 sm = new addgame2();
	  
	  
	 //��ʼ��
	 jt = new JTable(sm);
	  
	 jsp = new JScrollPane(jt);
	  
	 //��jsp���뵽jframe��
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
	 //�ж����ĸ���ť�����
	 if(arg0.getSource() == jb1){
	 System.out.println("�û�ϣ������ѯ...");
	 //��Ϊ�ѶԱ������ݷ�װ��StuModel�У����ԱȽϼ򵥵���ɲ�ѯ
	 String name = this.jtf.getText().trim();
	 //дһ��sql���
	 String sql = "select * from addcollect where name = '"+name+"' ";
	 //����һ������ģ���࣬������
	 sm = new addgame2(sql);
	 //����jtable
	 jt.setModel(sm);
	  
	 }else if (arg0.getSource() == jb5){
		 new MyHomepage().setVisible(true);
		 this.dispose();
		 
	 }
	  
	 //һ���������ӽ���
	 else if(arg0.getSource() == jb2){
			this.setLocationRelativeTo(null);
	 System.out.println("����...");
	 addgame3 sa = new addgame3(this,"����",true);
	  
	 //�����ٻ���µ�����ģ��,
	 sm = new addgame2();
	 jt.setModel(sm);
	 }else if(arg0.getSource() == jb4){
	 //����ɾ����¼
	 //1.�õ�ѧ����ID
	 int rowNum = this.jt.getSelectedRow();//getSelectedRow�᷵�ظ��û����е���
	 //������û�һ�ж�û��ѡ���ͷ���-1
	 if(rowNum == -1){
	 //��ʾ
	 JOptionPane.showMessageDialog(this, "��ѡ��һ��");
	 return ;
	 }
	 //�õ�ѧ��ID
	 String stuId = (String)sm.getValueAt(rowNum, 0);
	 System.out.println("Id�� "+stuId);
	  
	 //�������ݿ�,���ɾ������
	 try{
	 //1.��������
	 Class.forName("com.mysql.jdbc.Driver"); 
	 //2.�������ݿ�
	 String url = "jdbc:mysql://127.0.0.1:3306/game";
	 String user = "root";
	 String passwd = "123456";
	  
	 ct = DriverManager.getConnection(url, user, passwd);
	 System.out.println("���ӳɹ�");
	 ps = ct.prepareStatement("delete from addcollect where name = ?");
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
	 sm = new addgame2();
	 //����jtable
	 jt.setModel(sm); 
	 }else if(arg0.getSource() == jb3){
	 System.out.println("11111");
	 //�����û�ϣ���޸�
	 int rowNum = this.jt.getSelectedRow();
	 if(rowNum == -1){
	 //��ʾ
	 JOptionPane.showMessageDialog(this, "��ѡ��һ��");
	 return ;
	 }
	 //��ʾ�Ի���
	 System.out.println( "12435");
	 addgame1 su = new addgame1(this, "�޸�", true, sm, rowNum);
	 sm = new addgame2();
	 jt.setModel(sm);
	 } 
	 }
	}

