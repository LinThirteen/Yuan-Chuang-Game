/*
 * gLogin.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import model.manager;
import model.user;
import Server.Client;

/**
 *
 * @author  __USER__
 */
public class gLogin extends javax.swing.JFrame {

	/** Creates new form gLogin */
	public gLogin() {
		initComponents();
		this.jPasswordField2.setEchoChar('\0');
		this.jPasswordField2.setText("密码");
		this.setLocationRelativeTo(null);
		this.setTitle("元创");
		Image image = Toolkit.getDefaultToolkit().getImage("img1/7.png");
		setIconImage(image);
		this.记住密码();
	}

	private void 记住密码() {

		File f = new File("manager.txt");
		System.out.println(f.exists());
		if (f.exists()) {
			try {
				Scanner sc = new Scanner(f);
				String name = sc.nextLine();
				String pw = sc.nextLine();
				this.jTextField2.setText(name);
				this.jPasswordField2.setText(pw);
				this.jCheckBox2.setSelected(true);

			} catch (FileNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}
	}

	private String encry(String info) {
		char[] c = info.toCharArray();
		String out = "";
		for (int i = 0; i < c.length; i++) {
			out += (c[i] + 5);
		}
		return out;
	}

	private void add记住() {
		File f = new File("manager.txt");
		PrintWriter pw;
		try {
			pw = new PrintWriter(f);
			pw.println(this.jTextField2.getText());
			pw.println((this.jPasswordField2.getText()));
			pw.flush();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jPasswordField1 = new javax.swing.JPasswordField();
		jTextField1 = new javax.swing.JTextField();
		jCheckBox1 = new javax.swing.JCheckBox();
		jPanel1 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		jPasswordField2 = new javax.swing.JPasswordField();
		jTextField2 = new javax.swing.JTextField();
		jCheckBox2 = new javax.swing.JCheckBox();

		jLabel1.setText("jLabel1");

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 48));
		jLabel2.setText("\u5143\u521b");

		jButton1.setBackground(new java.awt.Color(204, 204, 204));
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("\u767b\u5f55");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jPasswordField1.setForeground(new java.awt.Color(204, 204, 204));
		jPasswordField1.setBorder(javax.swing.BorderFactory
				.createEtchedBorder());
		jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				jPasswordField1KeyTyped(evt);
			}
		});

		jTextField1.setForeground(new java.awt.Color(204, 204, 204));
		jTextField1.setText("\u7ba1\u7406\u5458\u8d26\u53f7");
		jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				jTextField1KeyTyped(evt);
			}
		});

		jCheckBox1.setText("\u4fdd\u5b58\u5bc6\u7801");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(0, 0, 0));

		jLabel3.setText("jLabel1");

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 48));
		jLabel4.setForeground(new java.awt.Color(255, 255, 255));
		jLabel4.setText("\u5143\u521b");

		jButton2.setBackground(new java.awt.Color(204, 204, 204));
		jButton2.setForeground(new java.awt.Color(255, 255, 255));
		jButton2.setText("\u767b\u5f55");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jPasswordField2.setForeground(new java.awt.Color(204, 204, 204));
		jPasswordField2.setBorder(javax.swing.BorderFactory
				.createEtchedBorder());
		jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jPasswordField2ActionPerformed(evt);
			}
		});
		jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				jPasswordField2KeyTyped(evt);
			}
		});

		jTextField2.setForeground(new java.awt.Color(204, 204, 204));
		jTextField2.setText("\u7ba1\u7406\u5458\u8d26\u53f7");
		jTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				jTextField2KeyTyped(evt);
			}
		});

		jCheckBox2.setText("\u4fdd\u5b58\u5bc6\u7801");
		jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCheckBox2ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout.createSequentialGroup()
										.addContainerGap(118, Short.MAX_VALUE)
										.addComponent(jLabel3).addGap(40, 40,
												40).addComponent(jLabel4)
										.addGap(94, 94, 94))
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(141, 141, 141)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jCheckBox2)
																		.addContainerGap(
																				170,
																				Short.MAX_VALUE))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jTextField2,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								129,
																								Short.MAX_VALUE)
																						.addComponent(
																								jPasswordField2,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								129,
																								Short.MAX_VALUE)
																						.addComponent(
																								jButton2,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								129,
																								Short.MAX_VALUE))
																		.addGap(
																				130,
																				130,
																				130)))));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap(90, Short.MAX_VALUE)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel4)
																		.addGap(
																				34,
																				34,
																				34))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel3)
																		.addGap(
																				52,
																				52,
																				52)))
										.addComponent(
												jTextField2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPasswordField2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(9, 9, 9)
										.addComponent(jCheckBox2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jButton2).addGap(98, 98,
												98)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {
		if (this.jTextField2.getText().equals("管理员账号"))

			this.jTextField2.setText("");
	}

	private void jPasswordField2KeyTyped(java.awt.event.KeyEvent evt) {
		if (this.jPasswordField2.getText().equals("密码")) {
			this.jPasswordField2.setText("");
			this.jPasswordField2.setEchoChar('*');
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		if (this.jCheckBox2.isSelected())
			add记住();
		else {
			File f = new File("C:\\Users\\林十三\\Desktop\\游戏平台\\manager.txt");
			System.out.println(f.exists());
			f.delete();
		}
		try {
			Client c = new Client();
			manager m = c.managerLogin(this.jTextField2.getText(),
					this.jPasswordField2.getText());
			if (m == null)
				JOptionPane.showMessageDialog(this, "登录失败");
			else {
				new AdministratorInterface(m).setVisible(true);
				this.dispose();
			}

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		if (this.jCheckBox2.isSelected())
			add记住();
		else {
			File f = new File("C:\\Users\\林十三\\Desktop\\游戏平台\\manager.txt");
			System.out.println(f.exists());
			f.delete();
		}
		try {
			Client c = new Client();
			manager m = c.managerLogin(this.jTextField1.getText(),
					this.jPasswordField1.getText());
			if (m == null)
				JOptionPane.showMessageDialog(this, "登录失败");
			else {
				new AdministratorInterface(m).setVisible(true);
				this.dispose();
			}

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void jPasswordField1KeyTyped(java.awt.event.KeyEvent evt) {

		if (this.jPasswordField1.getText().equals("密码")) {
			this.jPasswordField1.setText("");
			this.jPasswordField1.setEchoChar('*');
		}
	}

	private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {
		if (this.jTextField1.getText().equals("管理员账号"))

			this.jTextField1.setText("");
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new gLogin().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JCheckBox jCheckBox1;
	private javax.swing.JCheckBox jCheckBox2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JPasswordField jPasswordField2;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	// End of variables declaration//GEN-END:variables

}