package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MyColorListener;
import model.MyColorModel;

public class MyColorView extends JFrame {
	private	MyColorModel myColorModel;
	private	JLabel jlabel;
	public MyColorView()  {
		this.myColorModel = new MyColorModel();
		this.Init();
	}

	private void Init() {
		this.setTitle("My Color");
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyColorListener lc = new MyColorListener(this);
	
		this.jlabel = new JLabel("TEXT",JLabel.CENTER);
		
		JPanel jpanel = new JPanel();
		jpanel.setLayout(new GridLayout(2,3));
		Font font = new Font("Arial", Font.BOLD, 30);
		
		jlabel.setFont(font);
		JButton jbutton_text_red = new JButton("RED TEXT");
		jbutton_text_red.setFont(font);
		jbutton_text_red.setForeground(Color.RED);
		jbutton_text_red.addActionListener(lc);
		
		
		JButton jbutton_text_yellow = new JButton("YELLOW TEXT");
		jbutton_text_yellow.setFont(font);
		jbutton_text_yellow.setForeground(Color.YELLOW);
		jbutton_text_yellow.addActionListener(lc);
		
		JButton jbutton_text_green = new JButton("GREEN TEXT");
		jbutton_text_green.setFont(font);
		jbutton_text_green.setForeground(Color.GREEN);
		jbutton_text_green.addActionListener(lc);
		
		
		JButton jbutton_backgroud_red = new JButton("RED BACKGROUND");
		jbutton_backgroud_red.setFont(font);
		jbutton_backgroud_red.setBackground(Color.RED);
		jbutton_backgroud_red.setBorderPainted(false);
		jbutton_backgroud_red.addActionListener(lc);
		
		JButton jbutton_backgroud_yellow = new JButton("YELLOW BACKGROUND");
		jbutton_backgroud_yellow.setFont(font);
		jbutton_backgroud_yellow.setBackground(Color.YELLOW);
		jbutton_backgroud_yellow.setBorderPainted(false);
		jbutton_backgroud_yellow.addActionListener(lc);
		
		
		JButton jbutton_backgroud_green = new JButton("GREEN BACKGROUND");
		jbutton_backgroud_green.setFont(font);
		jbutton_backgroud_green.setBackground(Color.GREEN);
		jbutton_backgroud_green.setBorderPainted(false);
		jbutton_backgroud_green.addActionListener(lc);
		
		jpanel.add(jbutton_text_red);
		
		jpanel.add(jbutton_text_green);
		
		jpanel.add(jbutton_text_yellow);
		
		
		jpanel.add(jbutton_backgroud_red);
		
		jpanel.add(jbutton_backgroud_yellow);
		
		jpanel.add(jbutton_backgroud_green);
		
		
		this.setLayout(new BorderLayout());
		this.add(jlabel,BorderLayout.NORTH);
		this.add(jpanel,BorderLayout.CENTER);

		this.setVisible(true);
	}
	
	public void textColor(Color color) {
		this.jlabel.setForeground(color);
	}
	public void backgroundColor(Color color) {
		this.jlabel.setBackground(color);
		this.jlabel.setOpaque(true);

	}
	
	
}
