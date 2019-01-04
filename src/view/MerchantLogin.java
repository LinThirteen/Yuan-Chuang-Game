/*
 * MerchantLogin.java
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

import Server.Client;
import model.business;

/**
 *
 * @author  __USER__
 */
public class MerchantLogin extends javax.swing.JFrame {

	/** Creates new form MerchantLogin */
	public MerchantLogin() {
		initComponents();
		this.jPasswordField3.setEchoChar('\0');
		this.jPasswordField3.setText("密码");
		this.setLocationRelativeTo(null);
		Image image = Toolkit.getDefaultToolkit().getImage("img1/7.png");
		setIconImage(image);
		this.记住密码();
	}

	private void 记住密码() {

		File f = new File("business.txt");
		System.out.println(f.exists());
		if (f.exists()) {
			try {
				Scanner sc = new Scanner(f);
				String name = sc.nextLine();
				String pw = sc.nextLine();
				this.jTextField5.setText(name);
				this.jPasswordField3.setText(pw);
				this.jCheckBox3.setSelected(true);

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
		File f = new File("business.txt");
		PrintWriter pw;
		try {
			pw = new PrintWriter(f);
			pw.println(this.jTextField5.getText());
			pw.println((this.jPasswordField3.getText()));
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
		jCheckBox1 = new javax.swing.JCheckBox();
		jTextField3 = new javax.swing.JTextField();
		jPasswordField1 = new javax.swing.JPasswordField();
		jButton1 = new javax.swing.JButton();
		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jPanel3 = new javax.swing.JPanel();
		jPanel4 = new javax.swing.JPanel();
		jCheckBox2 = new javax.swing.JCheckBox();
		jButton2 = new javax.swing.JButton();
		jPasswordField2 = new javax.swing.JPasswordField();
		jTextField4 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jPanel5 = new javax.swing.JPanel();
		jPanel6 = new javax.swing.JPanel();
		jPanel7 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jPanel8 = new javax.swing.JPanel();
		jCheckBox3 = new javax.swing.JCheckBox();
		jButton3 = new javax.swing.JButton();
		jPasswordField3 = new javax.swing.JPasswordField();
		jTextField5 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jButton4 = new javax.swing.JButton();

		jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 48));
		jLabel1.setText("\u5143\u521b");

		jCheckBox1.setText("\u4fdd\u5b58\u5bc6\u7801");

		jTextField3.setForeground(new java.awt.Color(204, 204, 204));
		jTextField3.setText("\u5546\u5bb6\u8d26\u53f7");
		jTextField3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				jTextField3KeyTyped(evt);
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

		jButton1.setBackground(new java.awt.Color(204, 204, 204));
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("\u767b\u5f55");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 473,
				Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 400,
				Short.MAX_VALUE));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 431,
				Short.MAX_VALUE));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 535,
				Short.MAX_VALUE));

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 402,
				Short.MAX_VALUE));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 119,
				Short.MAX_VALUE));

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 426,
				Short.MAX_VALUE));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 374,
				Short.MAX_VALUE));

		jCheckBox2.setText("\u4fdd\u5b58\u5bc6\u7801");

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
		jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				jPasswordField2KeyTyped(evt);
			}
		});

		jTextField4.setForeground(new java.awt.Color(204, 204, 204));
		jTextField4.setText("\u5546\u5bb6\u8d26\u53f7");
		jTextField4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				jTextField4KeyTyped(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("微软雅黑", 0, 48));
		jLabel3.setForeground(new java.awt.Color(255, 255, 255));
		jLabel3.setText("\u5143\u521b");

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 383,
				Short.MAX_VALUE));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 360,
				Short.MAX_VALUE));

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(
				jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 383,
				Short.MAX_VALUE));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 301,
				Short.MAX_VALUE));

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(
				jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 100,
				Short.MAX_VALUE));
		jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 100,
				Short.MAX_VALUE));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel8.setBackground(new java.awt.Color(0, 0, 0));

		jCheckBox3.setText("\u4fdd\u5b58\u5bc6\u7801");
		jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCheckBox3ActionPerformed(evt);
			}
		});

		jButton3.setBackground(new java.awt.Color(204, 204, 204));
		jButton3.setForeground(new java.awt.Color(255, 255, 255));
		jButton3.setText("\u767b\u5f55");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jPasswordField3.setForeground(new java.awt.Color(204, 204, 204));
		jPasswordField3.setBorder(javax.swing.BorderFactory
				.createEtchedBorder());
		jPasswordField3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jPasswordField3ActionPerformed(evt);
			}
		});
		jPasswordField3.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				jPasswordField3KeyTyped(evt);
			}
		});

		jTextField5.setForeground(new java.awt.Color(204, 204, 204));
		jTextField5.setText("\u5546\u5bb6\u8d26\u53f7");
		jTextField5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				jTextField5KeyTyped(evt);
			}
		});

		jLabel4.setFont(new java.awt.Font("微软雅黑", 0, 48));
		jLabel4.setForeground(new java.awt.Color(255, 255, 255));
		jLabel4.setText("\u5143\u521b");

		jButton4.setBackground(new java.awt.Color(204, 204, 204));
		jButton4.setForeground(new java.awt.Color(255, 255, 255));
		jButton4.setText("\u6ce8\u518c");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(
				jPanel8);
		jPanel8.setLayout(jPanel8Layout);
		jPanel8Layout
				.setHorizontalGroup(jPanel8Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel8Layout.createSequentialGroup()
										.addContainerGap(261, Short.MAX_VALUE)
										.addComponent(jLabel4).addGap(120, 120,
												120))
						.addGroup(
								jPanel8Layout
										.createSequentialGroup()
										.addGap(148, 148, 148)
										.addGroup(
												jPanel8Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addComponent(
																jButton4,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jButton3,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																149,
																Short.MAX_VALUE)
														.addComponent(
																jCheckBox3,
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jTextField5,
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jPasswordField3,
																javax.swing.GroupLayout.Alignment.LEADING))
										.addContainerGap(180, Short.MAX_VALUE)));
		jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel8Layout.createSequentialGroup().addGap(61, 61, 61)
						.addComponent(jLabel4).addGap(33, 33, 33).addComponent(
								jTextField5,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								27, 27, 27).addComponent(jPasswordField3,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								30, 30, 30).addComponent(jCheckBox3).addGap(18,
								18, 18).addComponent(jButton3).addGap(18, 18,
								18).addComponent(jButton4).addContainerGap(44,
								Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap().addComponent(
						jLabel2).addContainerGap(462, Short.MAX_VALUE))
				.addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout
				.setVerticalGroup(layout.createParallelGroup(
						javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						layout.createSequentialGroup().addComponent(jLabel2)
								.addGap(1, 1, 1).addComponent(jPanel8,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		new BuildMerchant().setVisible(true);
		this.dispose();
	}

	private void jPasswordField3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {
		if (this.jTextField5.getText().equals("商家账号"))

			this.jTextField5.setText("");
	}

	private void jPasswordField3KeyTyped(java.awt.event.KeyEvent evt) {
		if (this.jPasswordField3.getText().equals("密码")) {
			this.jPasswordField3.setText("");
			this.jPasswordField3.setEchoChar('*');
		}
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		if (this.jCheckBox3.isSelected())
			add记住();
		else {
			File f = new File("C:\\Users\\林十三\\Desktop\\游戏平台\\business.txt");
			System.out.println(f.exists());
			f.delete();
		}
		try {
			Client c = new Client();
			business b = c.businessLogin(this.jTextField5.getText(),
					this.jPasswordField3.getText());
			if (b == null)
				JOptionPane.showMessageDialog(this, "登录失败");
			else {
				new sjzy(b).setVisible(true);
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

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jPasswordField2KeyTyped(java.awt.event.KeyEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		if (this.jCheckBox1.isSelected())
			add记住();
		else {
			File f = new File("C:\\Users\\林十三\\Desktop\\游戏平台\\business.txt");
			System.out.println(f.exists());
			f.delete();
		}
		try {
			Client c = new Client();
			business b = c.businessLogin(this.jTextField5.getText(),
					this.jPasswordField3.getText());
			if (b == null)
				JOptionPane.showMessageDialog(this, "登录失败");
			else {
				new sjzy(b).setVisible(true);
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

	private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {
		if (this.jTextField3.getText().equals("商家账号"))

			this.jTextField3.setText("");
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MerchantLogin().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JCheckBox jCheckBox1;
	private javax.swing.JCheckBox jCheckBox2;
	private javax.swing.JCheckBox jCheckBox3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JPasswordField jPasswordField2;
	private javax.swing.JPasswordField jPasswordField3;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	// End of variables declaration//GEN-END:variables

}