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

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class modifygame3 extends JDialog implements ActionListener {
	 //��������Ҫ��swing���
	 JLabel jl1,jl2,jl3,jl4;
	 JTextField jf1,jf2,jf3,jf4;
	 JPanel jp1,jp2,jp3;
	 JButton jb1,jb2;
	 //owner���ʸ�����,title�Ǵ��ڵ�����,modalָ����ģʽ����()���߷�ģʽ����
	 public modifygame3(Frame owner,String title, boolean modal){
	 //���ø��෽��
	 super(owner,title,modal);
	  
	    this.setLocationRelativeTo(null);
	    Image image = Toolkit.getDefaultToolkit().getImage("img1/7.png");
		setIconImage(image);
		 jl1 = new JLabel("name");
		 jl2 = new JLabel("text"); 
		 jl3 = new JLabel("price");
		 jl4 = new JLabel("style");
	  
	 jf1 = new JTextField(10);
	 jf2 = new JTextField(10);
	 jf3 = new JTextField(10);
	 jf4 = new JTextField(10);
	

	  
	 jb1 = new JButton("���");
	 jb1.addActionListener(this);
	 jb2 = new JButton("ȡ��");
	  
	 jp1 = new JPanel();
	 jp2 = new JPanel();
	 jp3 = new JPanel();
	  
	 //���ò���
	 jp1.setLayout(new GridLayout(6,1));
	 jp2.setLayout(new GridLayout(6,1));
	  
	 jp3.add(jb1);
	 jp3.add(jb2);
	  
	 jp1.add(jl1);
	 jp1.add(jl2);
	 jp1.add(jl3);
	 jp1.add(jl4);
	
	;
	  
	 jp2.add(jf1);
	 jp2.add(jf2);
	 jp2.add(jf3);
	 jp2.add(jf4);

	  
	 this.add(jp1, BorderLayout.WEST);
	 this.add(jp2, BorderLayout.CENTER);
	 this.add(jp3, BorderLayout.SOUTH);
	  
	 this.setSize(300,200);
	 this.setVisible(true);
		this.setLocationRelativeTo(null);
	 }
	 @Override
	 public void actionPerformed(ActionEvent e) {
	 // TODO Auto-generated method stub
	 if(e.getSource() == jb1){
	 Connection ct = null;
	 PreparedStatement pstmt = null;
	 ResultSet rs = null;
	  
	 try{
	 //1.��������
	 Class.forName("com.mysql.jdbc.Driver");
	 System.out.println("���سɹ�");
	 //2.�������ݿ�
	 //���弸������
	 String url = "jdbc:mysql://127.0.0.1:3306/game";
	 String user = "root";
	 String passwd = "123456";
	 ct = DriverManager.getConnection(url,user,passwd);
	  
	 //�����������
	  
	 String strsql = "insert into allgame values(?,?,?,?)";
	 pstmt = ct.prepareStatement(strsql);
	  
	 //������ֵ
	 pstmt.setString(1,jf1.getText());
	 pstmt.setString(2,jf2.getText());
	 pstmt.setString(3,jf3.getText());
	 pstmt.setString(4,jf4.getText());

	  
	 pstmt.executeUpdate();
	  
	 this.dispose();//�ر�ѧ���Ի���
	  
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


