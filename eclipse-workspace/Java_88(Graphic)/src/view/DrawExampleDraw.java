package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class DrawExampleDraw extends JFrame{
	public DrawExampleDraw() {
		this.setTitle("DrawExample");
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JpanelDraw jpanelDraw = new JpanelDraw();
		
		this.setLayout(new BorderLayout());
		this.add(jpanelDraw);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new DrawExampleDraw();
	}
}
