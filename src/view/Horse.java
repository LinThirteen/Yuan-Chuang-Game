package view;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;



public class Horse extends Thread{
	
	private JProgressBar bar;
	
	private String hname;
	

	public Horse(JProgressBar bar, String hname) {
		super();
		this.bar = bar;
		this.hname = hname;
	}


	public void run(){
		this.bar.setMaximum(100000);
		for(int i=0;i<=100000;i+=10){
			bar.setValue(i);
			try {
				
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		JOptionPane.showMessageDialog(null, hname+"更新完了，游戏愉快");
	}

}

