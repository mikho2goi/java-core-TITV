package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_GridLayOut extends JFrame{
	public ViDu_GridLayOut() {
		this.setTitle("ViDuGridLayOut");
		this.setSize(700,500);
		//Căn Giữa
		this.setLocationRelativeTo(null);
		
		//Set layout
		GridLayout gridLayout = new GridLayout();
		GridLayout gridLayout_1 = new GridLayout(4,4);
		GridLayout gridLayout_2 = new GridLayout(4, 4, 25, 25);
		
		this.setLayout(gridLayout_2);
		
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		//add thành phần
		for (int i = 0; i < 16; i++) {
			JButton jbutton = new JButton(i+"");
			this.add(jbutton);
		}

		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ViDu_GridLayOut();
		
	}
	
	
	
}
