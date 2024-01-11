package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_BorderLayOut extends JFrame{
	public ViDu_BorderLayOut() {
		this.setTitle("ViDuBorderLayOut");
		this.setSize(700,500);
		//Căn Giữa
		this.setLocationRelativeTo(null);
		
		//Set layout
		BorderLayout borderLayout_1 = new BorderLayout();
		BorderLayout borderLayout_2 = new BorderLayout(25,25);
		
		this.setLayout(borderLayout_1);
		
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		
		//add thành phần
		this.add(button1,BorderLayout.NORTH);
		this.add(button2,BorderLayout.WEST);
		this.add(button3,BorderLayout.SOUTH);
		this.add(button4,BorderLayout.CENTER);
		this.add(button5,BorderLayout.EAST);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ViDu_BorderLayOut();
		
	}
	
	
	
}
