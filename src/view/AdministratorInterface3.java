/*
 * AdministratorInterface3.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;

import javax.swing.DefaultBoundedRangeModel;
import javax.swing.table.DefaultTableModel;

import model.user;

/**
 *
 * @author  __USER__
 */
public class AdministratorInterface3 extends javax.swing.JFrame {

	/** Creates new form AdministratorInterface3 */
	public AdministratorInterface3() {
		initComponents();
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
		user u = new user();
		ArrayList<user> users = u.viewData();
		Object title[] = { "用户名", "密码" };
		Object detail[][] = new Object[users.size()][2];
		for (int i = 0; i < users.size(); i++) {
			detail[i][0] = users.get(i).getUu();
			detail[i][1] = users.get(i).getUpw();
			//			detail[i][2] = users.get(i).getUid();

		}

		this.jTable3.setModel(new DefaultTableModel(detail, title));

	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jScrollPane3 = new javax.swing.JScrollPane();
		jList1 = new javax.swing.JList();
		jScrollPane4 = new javax.swing.JScrollPane();
		jButton10 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jButton12 = new javax.swing.JButton();
		jScrollPane5 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
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
		jScrollPane6 = new javax.swing.JScrollPane();
		jTable3 = new javax.swing.JTable();

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane2.setViewportView(jTable1);

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
		jScrollPane3.setViewportView(jList1);

		jButton10.setText("\u5220\u9664\u7528\u6237");

		jButton9.setText("\u6dfb\u52a0\u7528\u6237");

		jButton12.setText("\u67e5\u627e\u7528\u6237");

		jTable2.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jTable2.setRowHeight(40);
		jTable2.setRowMargin(10);
		jScrollPane5.setViewportView(jTable2);

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
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

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
		jButton11.setText("\u4fee\u6539\u7528\u6237\u8d44\u6599");
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

		jTable3.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jTable3.setRowHeight(50);
		jScrollPane6.setViewportView(jTable3);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
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
																		.addContainerGap()
																		.addComponent(
																				jButton11))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jScrollPane6,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								735,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								layout
																										.createSequentialGroup()
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
																												jButton7)))))
										.addGap(62, 62, 62).addComponent(
												jButton13)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addGroup(
						layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton1).addComponent(jButton13)
								.addComponent(jButton3).addComponent(jButton4)
								.addComponent(jButton5).addComponent(jButton6)
								.addComponent(jButton2).addComponent(jButton7))
						.addGap(40, 40, 40).addComponent(jScrollPane6,
								javax.swing.GroupLayout.PREFERRED_SIZE, 268,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								41, 41, 41).addComponent(jButton11).addGap(31,
								31, 31)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		new glymianview().setVisible(true);
		this.dispose();
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		new glyzy2().setVisible(true);
		this.dispose();
	}

	private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
		new view2().setVisible(true);
		this.dispose();
	}

	private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
		new adduser().setVisible(true);
		this.dispose();

	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

		this.dispose();
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		new AdministratorInterface4().setVisible(true);
		this.dispose();
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		new AdminitratorInterface5().setVisible(true);
		this.dispose();
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		//new AdministratorInterface().setVisible(true);
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
				new AdministratorInterface3().setVisible(true);
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
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JScrollPane jScrollPane5;
	private javax.swing.JScrollPane jScrollPane6;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable2;
	private javax.swing.JTable jTable3;
	private javax.swing.JTextArea jTextArea1;
	// End of variables declaration//GEN-END:variables

}