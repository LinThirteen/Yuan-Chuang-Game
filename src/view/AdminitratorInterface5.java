/*
 * AdminitratorInterface5.java
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
import model.manager;
import model.business;

/**
 *
 * @author  __USER__
 */
public class AdminitratorInterface5 extends javax.swing.JFrame {
	private static manager m;

	/** Creates new form AdminitratorInterface5 */
	public AdminitratorInterface5() {
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
		allgame a = new allgame();
		ArrayList<allgame> allgames = a.allgameviewData();
		Object title[] = { "名字", "说明", "价格", "风格" };
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

		jButton9 = new javax.swing.JButton();
		jButton10 = new javax.swing.JButton();
		jButton11 = new javax.swing.JButton();
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
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jButton13 = new javax.swing.JButton();
		jButton14 = new javax.swing.JButton();

		jButton9.setText("\u6dfb\u52a0\u6e38\u620f");

		jButton10.setText("\u5220\u9664\u6e38\u620f");

		jButton11.setText("\u4fee\u6539\u6e38\u620f\u8d44\u6599");

		jButton12.setText("\u67e5\u627e\u6e38\u620f");

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
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setBackground(new java.awt.Color(204, 204, 204));
		jButton6.setForeground(new java.awt.Color(255, 255, 255));
		jButton6.setText("\u7ba1\u7406\u6e38\u620f");

		jButton7.setBackground(new java.awt.Color(204, 204, 204));
		jButton7.setForeground(new java.awt.Color(255, 255, 255));
		jButton7.setText("\u516c\u544a/\u5e7f\u544a");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jTable1.setRowHeight(60);
		jScrollPane2.setViewportView(jTable1);

		jButton13.setBackground(new java.awt.Color(204, 204, 204));
		jButton13.setForeground(new java.awt.Color(255, 255, 255));
		jButton13.setText("\u4fee\u6539\u6e38\u620f");
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
																				jButton13,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				137,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				16,
																				Short.MAX_VALUE)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addComponent(
																								jScrollPane2,
																								javax.swing.GroupLayout.Alignment.LEADING)
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
																												jButton6,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												93,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(
																												18,
																												18,
																												18)
																										.addComponent(
																												jButton7)
																										.addGap(
																												93,
																												93,
																												93)))))
										.addGap(51, 51, 51).addComponent(
												jButton14)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addGroup(
						layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton1).addComponent(jButton14)
								.addComponent(jButton2).addComponent(jButton3)
								.addComponent(jButton4).addComponent(jButton5)
								.addComponent(jButton6).addComponent(jButton7))
						.addGap(49, 49, 49).addComponent(jScrollPane2,
								javax.swing.GroupLayout.PREFERRED_SIZE, 282,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								18, 18, 18).addComponent(jButton13)
						.addContainerGap(55, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		new glymianview().setVisible(true);
		this.dispose();
	}

	private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
		new modifygame().setVisible(true);
		this.dispose();

	}

	private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
		new view2().setVisible(true);
		this.dispose();
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		new glyzy2().setVisible(true);
		this.dispose();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

		this.dispose();
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		new AdministratorInterface3().setVisible(true);
		this.dispose();
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		new AdministratorInterface4().setVisible(true);
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
				new AdminitratorInterface5().setVisible(true);
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