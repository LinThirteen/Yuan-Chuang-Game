/*
 * UserMainInterface.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;

import javax.swing.ImageIcon;

import Server.Client;

import model.user;

/**
 *
 * @author  __USER__
 */
public class UserMainInterface extends javax.swing.JFrame implements Runnable {
	private static user u;

	/** Creates new form UserMainInterface */
	public UserMainInterface() {
		initComponents();
		this.u = u;
		this.setLocationRelativeTo(null);
		this.setTitle("Ôª´´");
		Image image = Toolkit.getDefaultToolkit().getImage("img1/7.png");
		setIconImage(image);
		Thread t = new Thread(this);
		t.start();
		load();
		loads();
	}

	private void loads() {
		try {
			Client c = new Client();
			String s = c.viewannouncement();
			this.jTextField3.setText(s);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void load() {
		try {
			Client c = new Client();
			String s = c.advertisement();
			this.jTextArea6.setText(s);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void lunbo() {
		for (int i = 1; i <= 5; i++) {
			this.jLabel3.setIcon(new ImageIcon("img/" + i + ".jpg"));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (i == 5)
				i = 1;
		}
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jLabel2 = new javax.swing.JLabel();
		jButton6 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTextArea2 = new javax.swing.JTextArea();
		jLabel4 = new javax.swing.JLabel();
		jScrollPane3 = new javax.swing.JScrollPane();
		jTextArea3 = new javax.swing.JTextArea();
		jScrollPane4 = new javax.swing.JScrollPane();
		jTextArea4 = new javax.swing.JTextArea();
		jTextField2 = new javax.swing.JTextField();
		jScrollPane5 = new javax.swing.JScrollPane();
		jTextArea5 = new javax.swing.JTextArea();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jButton7 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jButton8 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jButton10 = new javax.swing.JButton();
		jButton11 = new javax.swing.JButton();
		jButton12 = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jButton13 = new javax.swing.JButton();
		jButton14 = new javax.swing.JButton();
		jButton15 = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jButton16 = new javax.swing.JButton();
		jButton17 = new javax.swing.JButton();
		jButton18 = new javax.swing.JButton();
		jButton19 = new javax.swing.JButton();
		jButton20 = new javax.swing.JButton();
		jScrollPane6 = new javax.swing.JScrollPane();
		jTextArea6 = new javax.swing.JTextArea();

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jTextArea1.setText("\u8f6e\u64ad\u56fe\n");
		jScrollPane1.setViewportView(jTextArea1);

		jButton6.setText("\u6240\u6709\u6e38\u620f");

		jButton4.setText("\u7cbe\u9009");

		jTextArea2.setColumns(20);
		jTextArea2.setRows(5);
		jScrollPane2.setViewportView(jTextArea2);

		jLabel4.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 1, 12));
		jLabel4.setText("\u7cbe\u9009");

		jTextArea3.setColumns(20);
		jTextArea3.setRows(5);
		jTextArea3.setText("\u5e7f\u544a");
		jScrollPane3.setViewportView(jTextArea3);

		jTextArea4.setColumns(20);
		jTextArea4.setRows(5);
		jScrollPane4.setViewportView(jTextArea4);

		jTextField2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jTextField2
				.setText("\u516c\u544a\uff1a\u672c\u5e73\u53f0\u5c06\u4e8e\u660e\u65e5\u66f4\u65b0\uff01");

		jTextArea5.setColumns(20);
		jTextArea5.setFont(new java.awt.Font("Monospaced", 0, 18));
		jTextArea5.setRows(5);
		jScrollPane5.setViewportView(jTextArea5);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(255, 255, 255));

		jButton1.setBackground(new java.awt.Color(204, 204, 204));
		jButton1.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
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

		jButton5.setBackground(new java.awt.Color(204, 204, 204));
		jButton5.setForeground(new java.awt.Color(255, 255, 255));
		jButton5.setText("\u6392\u884c\u699c");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jTextField1.setForeground(new java.awt.Color(204, 204, 204));
		jTextField1.setText("\u641c\u7d22\u6e38\u620f");

		jButton7.setBackground(new java.awt.Color(204, 204, 204));
		jButton7.setForeground(new java.awt.Color(255, 255, 255));
		jButton7.setText("ok");
		jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton7MouseClicked(evt);
			}
		});

		jLabel1.setText("\u70ed\u95e8\u6e38\u620f");

		jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/Ó¢ÐÛÁªÃË.jpg"))); // NOI18N
		jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton8MouseClicked(evt);
			}
		});
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/±¤ÀÝÖ®Ò¹.jpg"))); // NOI18N
		jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton9MouseClicked(evt);
			}
		});

		jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/¾øµØÇóÉú.jpg"))); // NOI18N
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed(evt);
			}
		});

		jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/ÃÎ»ÃÎ÷ÓÎ.jpg"))); // NOI18N
		jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton11MouseClicked(evt);
			}
		});
		jButton11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton11ActionPerformed(evt);
			}
		});

		jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/×ï¶ñ¶¼ÊÐ.jpg"))); // NOI18N
		jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton12MouseClicked(evt);
			}
		});

		jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/ÂÖ²¥Í¼1.jpg"))); // NOI18N

		jButton13.setBackground(new java.awt.Color(204, 204, 204));
		jButton13.setForeground(new java.awt.Color(255, 255, 255));
		jButton13.setText("\u6240\u6709\u6e38\u620f");
		jButton13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton13ActionPerformed(evt);
			}
		});

		jButton14.setBackground(new java.awt.Color(204, 204, 204));
		jButton14.setForeground(new java.awt.Color(255, 255, 255));
		jButton14.setText("\u6ce8\u9500");
		jButton14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton14ActionPerformed(evt);
			}
		});

		jButton15.setBackground(new java.awt.Color(204, 204, 204));
		jButton15.setForeground(new java.awt.Color(255, 255, 255));
		jButton15.setText("\u7cbe\u9009");

		jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/gg1_..jpg"))); // NOI18N

		jTextField3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jTextField3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField3ActionPerformed(evt);
			}
		});

		jButton16.setForeground(new java.awt.Color(255, 255, 255));
		jButton16.setText("\u6536\u85cf");
		jButton16.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton16ActionPerformed(evt);
			}
		});

		jButton17.setForeground(new java.awt.Color(255, 255, 255));
		jButton17.setText("\u6536\u85cf");
		jButton17.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton17ActionPerformed(evt);
			}
		});

		jButton18.setForeground(new java.awt.Color(255, 255, 255));
		jButton18.setText("\u6536\u85cf");
		jButton18.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton18ActionPerformed(evt);
			}
		});

		jButton19.setForeground(new java.awt.Color(255, 255, 255));
		jButton19.setText("\u6536\u85cf");
		jButton19.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton19ActionPerformed(evt);
			}
		});

		jButton20.setForeground(new java.awt.Color(255, 255, 255));
		jButton20.setText("\u6536\u85cf");
		jButton20.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton20ActionPerformed(evt);
			}
		});

		jTextArea6.setColumns(20);
		jTextArea6.setFont(new java.awt.Font("Monospaced", 0, 36));
		jTextArea6.setForeground(new java.awt.Color(255, 51, 255));
		jTextArea6.setRows(5);
		jTextArea6.setText("\u6682\u65e0\u8bb0\u5f55\u3002\n");
		jScrollPane6.setViewportView(jTextArea6);

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
										.addComponent(jButton1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												282, Short.MAX_VALUE)
										.addComponent(jButton2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jButton3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												76,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(254, 254, 254).addComponent(
												jButton14))
						.addGroup(
								layout
										.createSequentialGroup()
										.addComponent(
												jButton15,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												74,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton5)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton13)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												280, Short.MAX_VALUE)
										.addComponent(
												jTextField1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												145,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton7).addGap(73, 73,
												73))
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(99, 99, 99)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton16)
																		.addContainerGap())
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																layout
																		.createSequentialGroup()
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jScrollPane6,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								607,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel5,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								607,
																								Short.MAX_VALUE)
																						.addComponent(
																								jTextField3,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								607,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel3,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								607,
																								Short.MAX_VALUE)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								layout
																										.createSequentialGroup()
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addComponent(
																																jButton17)
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jButton8,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				69,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addGap(
																																				61,
																																				61,
																																				61)
																																		.addComponent(
																																				jButton9,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				68,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)))
																										.addGap(
																												63,
																												63,
																												63)
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel1)
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addGroup(
																																				layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.TRAILING,
																																								false)
																																						.addGroup(
																																								layout
																																										.createSequentialGroup()
																																										.addComponent(
																																												jButton18)
																																										.addPreferredGap(
																																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																												javax.swing.GroupLayout.DEFAULT_SIZE,
																																												Short.MAX_VALUE)
																																										.addComponent(
																																												jButton19))
																																						.addGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING,
																																								layout
																																										.createSequentialGroup()
																																										.addComponent(
																																												jButton10,
																																												javax.swing.GroupLayout.PREFERRED_SIZE,
																																												67,
																																												javax.swing.GroupLayout.PREFERRED_SIZE)
																																										.addGap(
																																												54,
																																												54,
																																												54)
																																										.addComponent(
																																												jButton11,
																																												javax.swing.GroupLayout.PREFERRED_SIZE,
																																												71,
																																												javax.swing.GroupLayout.PREFERRED_SIZE)))
																																		.addGap(
																																				59,
																																				59,
																																				59)
																																		.addGroup(
																																				layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING)
																																						.addComponent(
																																								jButton20)
																																						.addComponent(
																																								jButton12,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								70,
																																								javax.swing.GroupLayout.PREFERRED_SIZE))))))
																		.addGap(
																				114,
																				114,
																				114)))));
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
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton1)
														.addComponent(jButton14)
														.addComponent(jButton2)
														.addComponent(jButton3))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton5)
														.addComponent(jButton13)
														.addComponent(jButton15)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton7))
										.addGap(40, 40, 40)
										.addComponent(jLabel3)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				35,
																				35,
																				35)
																		.addComponent(
																				jButton16)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				98,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				31,
																				31,
																				31))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																layout
																		.createSequentialGroup()
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jButton20))
																						.addGroup(
																								layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																										.addGroup(
																												layout
																														.createSequentialGroup()
																														.addGap(
																																9,
																																9,
																																9)
																														.addComponent(
																																jLabel1)
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE)
																														.addGroup(
																																layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.BASELINE)
																																		.addComponent(
																																				jButton17)
																																		.addComponent(
																																				jButton18)))
																										.addGroup(
																												layout
																														.createSequentialGroup()
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																														.addComponent(
																																jButton19))))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jButton10,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								99,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jButton9,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								99,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																										.addComponent(
																												jButton12,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												98,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												jButton11,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												97,
																												javax.swing.GroupLayout.PREFERRED_SIZE)))
																		.addGap(
																				30,
																				30,
																				30)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jTextField3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(
												jLabel5,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGap(70, 70, 70)
										.addComponent(
												jScrollPane6,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												114,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(47, 47, 47)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

	}

	private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {
		new addgame().setVisible(true);
		this.dispose();
	}

	private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {
		new addgame().setVisible(true);
		this.dispose();
	}

	private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {
		new addgame().setVisible(true);
		this.dispose();
	}

	private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {
		new addgame().setVisible(true);
		this.dispose();
	}

	private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {
		new addgame().setVisible(true);
		this.dispose();
	}

	private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
		new AllGame().setVisible(true);
		this.dispose();

	}

	File f = null;

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {

		new GameIntroduce(u).setVisible(true);

	}

	private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
		new view2().setVisible(true);
		this.dispose();

	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {
		URI uri;
		try {
			uri = new URI("https://dl.pconline.com.cn/download/84973-1.html");
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

	private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {
		URI uri;
		try {
			uri = new URI("https://www.baidu.com/");
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

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		new MyHomepage().setVisible(true);
		this.dispose();
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		new RankingList().setVisible(true);
		this.dispose();
	}

	private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {
		URI uri;
		try {
			uri = new URI(
					"http://xy.skysgame.com/index.htm?fromid=xy306jpchx375");
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

	private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {
		URI uri;
		try {
			uri = new URI("http://fn.qq.com/web201803/main.shtml");
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

	private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {
		URI uri;
		try {
			uri = new URI("https://lol.qq.com/");
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

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UserMainInterface().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton12;
	private javax.swing.JButton jButton13;
	private javax.swing.JButton jButton14;
	private javax.swing.JButton jButton15;
	private javax.swing.JButton jButton16;
	private javax.swing.JButton jButton17;
	private javax.swing.JButton jButton18;
	private javax.swing.JButton jButton19;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton20;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JScrollPane jScrollPane5;
	private javax.swing.JScrollPane jScrollPane6;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextArea jTextArea2;
	private javax.swing.JTextArea jTextArea3;
	private javax.swing.JTextArea jTextArea4;
	private javax.swing.JTextArea jTextArea5;
	private javax.swing.JTextArea jTextArea6;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;

	// End of variables declaration//GEN-END:variables
	@Override
	public void run() {
		// TODO Auto-generated method stub
		lunbo();
	}

}