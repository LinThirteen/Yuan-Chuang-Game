/*
 * GameIntroduce.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.Button;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import model.user;

import Server.Client;

/**
 *
 * @author  __USER__
 */
public class GameIntroduce extends javax.swing.JFrame {
	private static user u;

	/** Creates new form GameIntroduce */
	public GameIntroduce(user u) {
		initComponents();
		this.setLocationRelativeTo(null);
		this.setTitle("元创");
		Image image = Toolkit.getDefaultToolkit().getImage("img1/7.png");
		setIconImage(image);
		this.u = u;
		load();

	}

	private void load() {
		try {
			Client c = new Client();
			String s = c.comment();
			this.jTextArea4.setText(s);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void Run(String filePath) {
		Runtime r = Runtime.getRuntime();
		try {
			r.exec("cmd /c start " + filePath);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jButton4 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTextArea2 = new javax.swing.JTextArea();
		jLabel2 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jRadioButton1 = new javax.swing.JRadioButton();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jScrollPane3 = new javax.swing.JScrollPane();
		jTextArea3 = new javax.swing.JTextArea();
		jScrollPane4 = new javax.swing.JScrollPane();
		jTextArea4 = new javax.swing.JTextArea();
		jTextField5 = new javax.swing.JTextField();
		jButton5 = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jButton6 = new javax.swing.JButton();
		jLabel8 = new javax.swing.JLabel();
		jButton7 = new javax.swing.JButton();
		jTextField6 = new javax.swing.JTextField();
		jButton8 = new javax.swing.JButton();

		jButton4.setText("jButton4");

		jTextField1.setText("\u6e38\u620f\u56fe\u7247");

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		jTextArea2.setColumns(20);
		jTextArea2.setRows(5);
		jTextArea2.setText("\u6e38\u620f\u89c6\u9891\u4ecb\u7ecd\n");
		jScrollPane2.setViewportView(jTextArea2);

		jLabel2.setText("\u751f\u4ea7\u65e5\u671f");

		jLabel4.setText("\u6e38\u620f\u7c7b\u578b");

		jLabel3.setText("\u5f00\u53d1\u5546");

		jRadioButton1.setText("\u6536\u85cf\u6e38\u620f");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jButton1.setBackground(new java.awt.Color(204, 204, 204));
		jButton1.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("<");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setBackground(new java.awt.Color(204, 204, 204));
		jButton2.setForeground(new java.awt.Color(255, 255, 255));
		jButton2.setText("\u6211\u7684\u4e3b\u9875");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setBackground(new java.awt.Color(204, 204, 204));
		jButton3.setForeground(new java.awt.Color(255, 255, 255));
		jButton3.setText("\u5546\u5e97");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jLabel1.setText("\u6e38\u620f\u8be6\u60c5");

		jTextArea3.setColumns(20);
		jTextArea3.setRows(5);
		jTextArea3
				.setText("\u7edd\u4e16\u6c42\u751f\uff1a\n\u300a\u7edd\u5730\u6c42\u751f\u300b\u662f\u5927\u9003\u6740\u7c7b\u591a\u4eba\u5c04\u51fb\u6e38\u620f\u300aPLAYERUNKNOWN");
		jScrollPane3.setViewportView(jTextArea3);

		jTextArea4.setColumns(20);
		jTextArea4.setRows(5);
		jScrollPane4.setViewportView(jTextArea4);

		jTextField5.setText("98");
		jTextField5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField5ActionPerformed(evt);
			}
		});

		jButton5.setBackground(new java.awt.Color(204, 204, 204));
		jButton5.setForeground(new java.awt.Color(255, 255, 255));
		jButton5.setText("\u7acb\u5373\u8d2d\u4e70");
		jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton5MouseClicked(evt);
			}
		});
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/绝地求生.jpg"))); // NOI18N

		jLabel7.setText("\u4ef7\u683c\uff1a");

		jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/捕获.jpg"))); // NOI18N
		jButton6.setText("\u6e38\u620f\u89c6\u9891\u4ecb\u7ecd");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jLabel8.setText("\u7edd\u5730\u6c42\u751f");

		jButton7.setText("\u53d1\u9001");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jTextField6.setText("[\u7edd\u5730\u6c42\u751f]");
		jTextField6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField6ActionPerformed(evt);
			}
		});

		jButton8.setBackground(new java.awt.Color(204, 204, 204));
		jButton8.setForeground(new java.awt.Color(255, 255, 255));
		jButton8.setText("\u6ce8\u9500");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				29,
																				29,
																				29)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel5)
																						.addComponent(
																								jLabel6)
																						.addComponent(
																								jLabel8))
																		.addGap(
																				36,
																				36,
																				36)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel1)
																										.addGap(
																												378,
																												378,
																												378))
																						.addGroup(
																								layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING,
																												false)
																										.addComponent(
																												jTextField6)
																										.addComponent(
																												jScrollPane4,
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addComponent(
																												jScrollPane3,
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addComponent(
																												jButton6,
																												javax.swing.GroupLayout.Alignment.LEADING,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												491,
																												Short.MAX_VALUE)))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jButton7)
																						.addGroup(
																								layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING,
																												false)
																										.addGroup(
																												javax.swing.GroupLayout.Alignment.LEADING,
																												layout
																														.createSequentialGroup()
																														.addComponent(
																																jLabel7)
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																														.addComponent(
																																jTextField5))
																										.addComponent(
																												jButton5,
																												javax.swing.GroupLayout.Alignment.LEADING,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												111,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												jButton8)))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton1)
																		.addGap(
																				254,
																				254,
																				254)
																		.addComponent(
																				jButton2)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				81,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jButton1)
																						.addComponent(
																								jButton2)
																						.addComponent(
																								jButton3)
																						.addComponent(
																								jButton8))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel1)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												jButton6,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												169,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addGap(
																												48,
																												48,
																												48)
																										.addComponent(
																												jLabel5)
																										.addGap(
																												38,
																												38,
																												38)
																										.addComponent(
																												jLabel6)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												jLabel8)))
																		.addGap(
																				23,
																				23,
																				23)
																		.addComponent(
																				jScrollPane3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				57,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																layout
																		.createSequentialGroup()
																		.addContainerGap(
																				293,
																				Short.MAX_VALUE)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel7)
																						.addComponent(
																								jTextField5,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGap(
																				28,
																				28,
																				28)))
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPane4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton5))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField6,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton7))
										.addContainerGap(50, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		new view2().setVisible(true);
		this.dispose();
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		new UserMainInterface().setVisible(true);
		this.dispose();
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		new MyHomepage().setVisible(true);
		this.dispose();
	}

	private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		Client c;
		try {
			c = new Client();
			c.usercomment(u, this.jTextField6.getText());
			load();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		this.setLocationRelativeTo(null);
		VideoPlayDemo.Run("C:\\Users\\林十三\\Desktop\\60bOOOPIC60.mp4");
	}

	private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {
		this.jButton5.setVisible(false);
		this.jTextField5.setVisible(false);
		this.jLabel7.setVisible(false);
		JOptionPane.showMessageDialog(null, "购买成功");
	
		URI uri;
		try {
			uri = new URI(
					"http://guanjia.qq.com/act/sem/201711ak/?ADTAG=360_sem_jdqs");
			Desktop dtp = Desktop.getDesktop();
			if (Desktop.isDesktopSupported()
					&& dtp.isSupported(Desktop.Action.BROWSE)) {
				try {

					dtp.browse(uri);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		} catch (URISyntaxException e1) {

			e1.printStackTrace();
		}
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		this.jButton5.setVisible(false);
		this.jTextField5.setVisible(false);
		this.jLabel7.setVisible(false);
		Icon img = new ImageIcon("D:\\30.jpg");
		JOptionPane.showMessageDialog(null, "", "请扫码支付", 0, img);
		URI uri;
		try {
			uri = new URI(
					"http://guanjia.qq.com/act/sem/201711ak/?ADTAG=360_sem_jdqs");
			Desktop dtp = Desktop.getDesktop();
			if (Desktop.isDesktopSupported()
					&& dtp.isSupported(Desktop.Action.BROWSE)) {
				try {

					dtp.browse(uri);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		} catch (URISyntaxException e1) {

			e1.printStackTrace();
		}

	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GameIntroduce(u).setVisible(true);

			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JRadioButton jRadioButton1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextArea jTextArea2;
	private javax.swing.JTextArea jTextArea3;
	private javax.swing.JTextArea jTextArea4;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	// End of variables declaration//GEN-END:variables

}