package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MyCalculator extends JFrame{
	public MyCalculator() {
		
		this.setTitle("MyCalculator");
		
		this.setSize(600,400);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField jTextField = new JTextField(50);
		JPanel jPanel_head = new JPanel(); 
		jPanel_head.setLayout(new BorderLayout());
		
		jPanel_head.add(jTextField,BorderLayout.CENTER);
		
		
		
		
		JButton jbutton_0 = new JButton("0");
		JButton jbutton_1 = new JButton("1");
		JButton jbutton_2 = new JButton("2");
		JButton jbutton_3 = new JButton("3");
		JButton jbutton_4 = new JButton("4");
		JButton jbutton_5 = new JButton("5");
		JButton jbutton_6 = new JButton("6");
		JButton jbutton_7 = new JButton("7");
		JButton jbutton_8 = new JButton("8");
		JButton jbutton_9 = new JButton("9");
		JButton jbutton_cong = new JButton("+");
		JButton jbutton_tru = new JButton("-");
		JButton jbutton_nhan = new JButton("x");
		JButton jbutton_chia = new JButton(":");
		JButton jbutton_bang = new JButton("=");
		JPanel jpanels_buttons = new JPanel(); 
		jpanels_buttons.setLayout(new GridLayout(5,3));
		
		jpanels_buttons.add(jbutton_0);
		jpanels_buttons.add(jbutton_1);
		jpanels_buttons.add(jbutton_2);
		jpanels_buttons.add(jbutton_3);
		jpanels_buttons.add(jbutton_4);
		jpanels_buttons.add(jbutton_5);
		jpanels_buttons.add(jbutton_6);
		jpanels_buttons.add(jbutton_7);
		jpanels_buttons.add(jbutton_8);
		jpanels_buttons.add(jbutton_9);
		jpanels_buttons.add(jbutton_cong);
		jpanels_buttons.add(jbutton_tru);
		jpanels_buttons.add(jbutton_nhan);
		jpanels_buttons.add(jbutton_chia);
		jpanels_buttons.add(jbutton_bang);
		
		
		 
		this.setLayout(new BorderLayout());
		this.add(jPanel_head,BorderLayout.NORTH);
		this.add(jpanels_buttons,BorderLayout.CENTER);
		
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		try {
		//		UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
			
		//	UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			
		//	UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MyCalculator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
	
}
