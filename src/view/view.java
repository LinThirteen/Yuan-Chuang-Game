/*
 * view.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

/**
 *
 * @author  __USER__
 */
public class view extends javax.swing.JFrame {

	/** Creates new form view */
	public view() {
		initComponents();
		this.setLocationRelativeTo(null);
		this.setTitle("Ôª´´");
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jButton1 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jPanel1 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();

		jButton1.setText("jButton1");

		jButton3.setText("jButton3");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton2.setText("X");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jTextField1.setText("\u521b\u5efa\u65b0\u8d26\u53f7");
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		jTextField2.setText("\u767b\u5f55\u5230\u73b0\u6709\u8d26\u53f7");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 384,
				Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 333,
				Short.MAX_VALUE));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel3.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 48));

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/login.png"))); // NOI18N

		jLabel2.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 48));
		jLabel2.setText("\u5143\u521b");

		jButton4.setBackground(new java.awt.Color(204, 204, 204));
		jButton4.setForeground(new java.awt.Color(255, 255, 255));
		jButton4.setText("\u521b\u5efa\u8d26\u53f7");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setBackground(new java.awt.Color(204, 204, 204));
		jButton5.setForeground(new java.awt.Color(255, 255, 255));
		jButton5.setText("\u767b\u5f55\u5230\u73b0\u6709\u8d26\u53f7");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setBackground(new java.awt.Color(204, 204, 204));
		jButton6.setForeground(new java.awt.Color(255, 255, 255));
		jButton6.setText("\u6e38\u5ba2\u767b\u5f55");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
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
																				108,
																				108,
																				108)
																		.addComponent(
																				jLabel1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				105,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				68,
																				68,
																				68))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																layout
																		.createSequentialGroup()
																		.addGap(
																				136,
																				136,
																				136)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jButton4,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								170,
																								Short.MAX_VALUE)
																						.addComponent(
																								jButton5,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								170,
																								Short.MAX_VALUE)
																						.addComponent(
																								jButton6,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								170,
																								Short.MAX_VALUE))
																		.addGap(
																				84,
																				84,
																				84)))
										.addComponent(jLabel3).addGap(65, 65,
												65)));
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
																		.addGap(
																				201,
																				201,
																				201)
																		.addComponent(
																				jLabel3))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				24,
																				24,
																				24)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								96,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addGap(
																												17,
																												17,
																												17)
																										.addComponent(
																												jLabel2)))
																		.addGap(
																				26,
																				26,
																				26)
																		.addComponent(
																				jButton4)
																		.addGap(
																				32,
																				32,
																				32)
																		.addComponent(
																				jButton5)
																		.addGap(
																				36,
																				36,
																				36)
																		.addComponent(
																				jButton6)))
										.addContainerGap(86, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		new view1().setVisible(true);
		this.dispose();
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		new view2().setVisible(true);
		this.dispose();
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		new UserMainInterface().setVisible(true);
		this.dispose();
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	public static void main(String args[]) {
		try {
			//org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new view().setVisible(true);
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
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	// End of variables declaration//GEN-END:variables

}