/*
 * AdministratorInterface4.java
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

import model.business;
import model.manager;
import model.user;

/**
 *
 * @author  __USER__
 */
public class AdministratorInterface4 extends javax.swing.JFrame {
	private static manager m;

	/** Creates new form AdministratorInterface4 */
	public AdministratorInterface4() {
		initComponents();
		this.m = m;
		this.setLocationRelativeTo(null);
		this.setTitle("元创");
		Image image = Toolkit.getDefaultToolkit().getImage("img1/7.png");
		setIconImage(image);
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
		business b = new business();
		ArrayList<business> businesss = b.businessviewData();
		Object title[] = { "用户名", "密码" };
		Object detail[][] = new Object[businesss.size()][2];
		for (int i = 0; i < businesss.size(); i++) {
			detail[i][0] = businesss.get(i).getname();
			detail[i][1] = businesss.get(i).getname();
			//			detail[i][2] = users.get(i).getUid();

		}

		this.jTable1.setModel(new DefaultTableModel(detail, title));

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jButton10 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jButton12 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jList1 = new javax.swing.JList();
		jButton8 = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jButton11 = new javax.swing.JButton();
		jButton13 = new javax.swing.JButton();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();

		jButton10.setText("\u5220\u9664\u5546\u5bb6");

		jButton9.setText("\u6dfb\u52a0\u5546\u5bb6");

		jButton12.setText("\u67e5\u627e\u5546\u5bb6");

		jList1.setModel(new javax.swing.AbstractListModel() {
			String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4",
					"Item 5" };

			public int getSize() {
				return strings.length;
			}

			public Object getElementAt(int i) {
				return strings[i];
			}
		});
		jScrollPane1.setViewportView(jList1);

		jButton8.setBackground(new java.awt.Color(204, 204, 204));
		jButton8.setForeground(new java.awt.Color(255, 255, 255));
		jButton8.setText("\u7ba1\u7406\u5e7f\u544a");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

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

		jButton4.setBackground(new java.awt.Color(204, 204, 204));
		jButton4.setForeground(new java.awt.Color(255, 255, 255));
		jButton4.setText("\u7ba1\u7406\u7528\u6237");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setBackground(new java.awt.Color(204, 204, 204));
		jButton5.setForeground(new java.awt.Color(255, 255, 255));
		jButton5.setText("\u7ba1\u7406\u5546\u5bb6");

		jButton6.setBackground(new java.awt.Color(204, 204, 204));
		jButton6.setForeground(new java.awt.Color(255, 255, 255));
		jButton6.setText("\u7ba1\u7406\u6e38\u620f");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton7.setBackground(new java.awt.Color(204, 204, 204));
		jButton7.setForeground(new java.awt.Color(255, 255, 255));
		jButton7.setText("\u516c\u544a/\u5e7f\u544a");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jButton11.setBackground(new java.awt.Color(204, 204, 204));
		jButton11.setForeground(new java.awt.Color(255, 255, 255));
		jButton11.setText("\u4fee\u6539\u5546\u5bb6\u8d44\u6599");
		jButton11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton11ActionPerformed(evt);
			}
		});

		jButton13.setBackground(new java.awt.Color(204, 204, 204));
		jButton13.setForeground(new java.awt.Color(255, 255, 255));
		jButton13.setText("\u6ce8\u9500");
		jButton13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton13ActionPerformed(evt);
			}
		});

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jTable1.setRowHeight(50);
		jScrollPane2.setViewportView(jTable1);

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
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				89,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton2)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton3)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton4)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton5)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton6)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton7)
																		.addGap(
																				34,
																				34,
																				34))
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																layout
																		.createSequentialGroup()
																		.addGap(
																				74,
																				74,
																				74)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jButton11)
																						.addComponent(
																								jScrollPane2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								673,
																								javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												54, Short.MAX_VALUE)
										.addComponent(jButton13)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addGroup(
						layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton1).addComponent(jButton13)
								.addComponent(jButton2).addComponent(jButton3)
								.addComponent(jButton4).addComponent(jButton5)
								.addComponent(jButton6).addComponent(jButton7))
						.addGap(39, 39, 39).addComponent(jScrollPane2,
								javax.swing.GroupLayout.PREFERRED_SIZE, 414,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								23, 23, 23).addComponent(jButton11)
						.addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		new glymianview().setVisible(true);
		this.dispose();
	}

	private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
		new view2().setVisible(true);
		this.dispose();
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		new glyzy2().setVisible(true);
		this.dispose();
	}

	private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
		new addbusiness().setVisible(true);
		this.dispose();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		new AdministratorInterface3().setVisible(true);
		this.dispose();
	}

	//private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
	// TODO add your handling code here:
	//}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		new AdminitratorInterface5().setVisible(true);
		this.dispose();
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		new AdministratorInterface(m).setVisible(true);
		this.dispose();
	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		new AdministratorInterface2().setVisible(true);
		this.dispose();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AdministratorInterface4().setVisible(true);
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
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JList jList1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTable jTable1;
	// End of variables declaration//GEN-END:variables

}