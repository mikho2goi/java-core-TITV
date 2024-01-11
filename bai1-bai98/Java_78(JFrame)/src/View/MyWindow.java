package View;

import javax.swing.JFrame;

public class MyWindow extends JFrame{
	public MyWindow() {
	}
	
	public void showIt() {
		this.setVisible(true);
	}
	
	public void showIt(String title) {
		this.setTitle(title);
		this.setVisible(true);
	}
	
	public void showIt(String title,int witdh, int height) {
		this.setTitle(title);
		this.setSize(witdh, height);
		this.setVisible(true);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		MyWindow m1 = new MyWindow();
		
		m1.showIt("Gmae", 700, 500);
		
		
	}
	
	
	
	
	
	
}
