package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_FlowLayOut extends JFrame{
	public ViDu_FlowLayOut() {
		this.setTitle("ViDuFlowLayOut");
		this.setSize(700,500);
		//Căn Giữa
		this.setLocationRelativeTo(null);
		
		//Set layout
		FlowLayout flowLayout = new FlowLayout();
		FlowLayout flowLayout_1 = new FlowLayout(FlowLayout.RIGHT);
		FlowLayout flowLayout_2 = new FlowLayout(FlowLayout.CENTER,60,60);
		
		this.setLayout(flowLayout_2);
		
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		
		//add thành phần
		this.add(button1);
		this.add(button2);
		this.add(button3);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ViDu_FlowLayOut();
		
	}
	
	
	
}
