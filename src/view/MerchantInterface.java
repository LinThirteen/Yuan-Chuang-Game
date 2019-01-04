/*
 * MerchantInterface.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import model.allgame;
import model.business;

/**
 *
 * @author  __USER__
 */
public class MerchantInterface extends javax.swing.JFrame {
	private business b;

	/** Creates new form MerchantInterface */
	public MerchantInterface() {
		initComponents();
		this.setLocationRelativeTo(null);
		Image image = Toolkit.getDefaultToolkit().getImage("img1/7.png");
		setIconImage(image);
		this.setTitle("Ôª´´");
		this.b = b;
		try {
			loadTable();
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

	void loadTable() throws IOException, ClassNotFoundException,
			UnknownHostException {
		allgame a = new allgame();
		ArrayList<allgame> allgames = a.allgameviewData();
		Object title[] = { "Ãû×Ö", "ËµÃ÷", "¼Û¸ñ", "·ç¸ñ" };
		Object detail[][] = new Object[allgames.size()][4];
		for (int i = 0; i < allgames.size(); i++) {
			detail[i][0] = allgames.get(i).getname();
			detail[i][1] = allgames.get(i).gettext();
			detail[i][2] = allgames.get(i).getprice();
			detail[i][3] = allgames.get(i).getstyle();

		}

		this.jTable1.setModel(new DefaultTableModel(detail, title));

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jButton5 = new javax.swing.JButton();
		jTextField4 = new javax.swing.JTextField();
		jButton9 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jButton10 = new javax.swing.JButton();
		jTextField2 = new javax.swing.JTextField();
		jButton6 = new javax.swing.JButton();
		jTextField5 = new javax.swing.JTextField();
		jButton7 = new javax.swing.JButton();
		jTextField3 = new javax.swing.JTextField();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jTabbedPane2 = new javax.swing.JTabbedPane();
		jTabbedPane3 = new javax.swing.JTabbedPane();
		jTabbedPane4 = new javax.swing.JTabbedPane();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jButton11 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jButton12 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();

		jButton5.setText("\u6e38\u620f\u56fe\u7247");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jTextField4.setText("\u6dfb\u52a0\u6e38\u620f");

		jButton9.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 48));
		jButton9.setText("+");

		jTextField1.setText("\u7edd\u5730\u6c42\u751f");

		jButton10.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 48));
		jButton10.setText("-");

		jTextField2.setText("\u82f1\u96c4\u8054\u76df");

		jButton6.setText("\u6e38\u620f\u56fe\u7247");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jTextField5.setText("\u5220\u9664\u6e38\u620f");

		jButton7.setText("\u6e38\u620f\u56fe\u7247");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jTextField3.setText("\u68a6\u5e7b\u897f\u6e38");
		jTextField3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField3ActionPerformed(evt);
			}
		});

		jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
		jTabbedPane1.addTab("\u589e\u52a0\u6e38\u620f", jTabbedPane2);
		jTabbedPane1.addTab("\u5220\u9664\u6e38\u620f", jTabbedPane3);
		jTabbedPane1.addTab("\u4fee\u6539\u6e38\u620f", jTabbedPane4);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setBackground(new java.awt.Color(204, 204, 204));
		jButton4.setForeground(new java.awt.Color(255, 255, 255));
		jButton4.setText("\u7ba1\u7406\u6e38\u620f");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton8.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 48));
		jButton8.setText("-");

		jButton11.setBackground(new java.awt.Color(204, 204, 204));
		jButton11.setForeground(new java.awt.Color(255, 255, 255));
		jButton11.setText("\u6ce8\u9500");
		jButton11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton11ActionPerformed(evt);
			}
		});

		jLabel1.setText("\u6e38\u620f\u7ba1\u7406");

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jTable1.setMinimumSize(new java.awt.Dimension(120, 200));
		jTable1.setPreferredSize(new java.awt.Dimension(700, 600));
		jTable1.setRowHeight(80);
		jScrollPane1.setViewportView(jTable1);

		jButton12.setBackground(new java.awt.Color(204, 204, 204));
		jButton12.setForeground(new java.awt.Color(255, 255, 255));
		jButton12.setText("\u4fee\u6539\u6e38\u620f");
		jButton12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton12ActionPerformed(evt);
			}
		});

		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/±³¾°.jpg"))); // NOI18N
		jLabel2.setText("jLabel2");

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
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton1)
																		.addGap(
																				145,
																				145,
																				145)
																		.addComponent(
																				jButton2)
																		.addGap(
																				12,
																				12,
																				12)
																		.addComponent(
																				jButton3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				77,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				jButton4))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				0,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				93,
																				93,
																				93)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												71, Short.MAX_VALUE)
										.addComponent(jButton11))
						.addGroup(
								layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel1)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				39,
																				39,
																				39)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jButton12)
																						.addComponent(
																								jLabel2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								452,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jScrollPane1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								452,
																								javax.swing.GroupLayout.PREFERRED_SIZE))))));
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
														.addComponent(jButton2)
														.addComponent(jButton3)
														.addComponent(jButton4)
														.addComponent(jButton11))
										.addGap(1, 1, 1)
										.addComponent(jLabel1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												351,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton12)
										.addGap(18, 18, 18)
										.addComponent(jLabel2)
										.addGap(27, 27, 27)
										.addComponent(
												jButton8,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												117,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
		new businessgame().setVisible(true);
		this.dispose();
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		new sjzy(b).setVisible(true);
		this.dispose();
	}

	private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
		new view2().setVisible(true);
		this.dispose();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		new MerchantInterface2().setVisible(true);
		this.dispose();
	}

	private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		new sjsd().setVisible(true);
		this.dispose();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MerchantInterface().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton12;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTabbedPane jTabbedPane2;
	private javax.swing.JTabbedPane jTabbedPane3;
	private javax.swing.JTabbedPane jTabbedPane4;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	// End of variables declaration//GEN-END:variables

}