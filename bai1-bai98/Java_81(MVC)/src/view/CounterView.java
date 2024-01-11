package view;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterController;
import model.CounterModel;

public class CounterView extends JFrame{
	CounterModel counterModel;
	private JButton jbutton_Up,jbutton_Down,jbutton_Reset;
	private JLabel jlable_Value;
	public CounterView() {
		this.counterModel = new CounterModel();
		this.init();
		this.setVisible(true);
	}
	
	public void init() {
		this.setSize(500,500);
		this.setTitle("Counter");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CounterController ac = new CounterController(this);
		
		jbutton_Up = new JButton("UP");
		jbutton_Up.addActionListener(ac);
		
		jbutton_Down = new JButton("DOWN");
		jbutton_Down.addActionListener(ac);
		
		jbutton_Reset = new JButton("RESET");
		jbutton_Reset.addActionListener(ac);
		
		jlable_Value = new JLabel(this.counterModel.getValue()+"",JLabel.CENTER);

		JPanel jpanel = new JPanel();
		jpanel.setLayout(new BorderLayout());
		jpanel.add(jbutton_Up,BorderLayout.WEST);
		jpanel.add(jlable_Value,BorderLayout.CENTER);
		jpanel.add(jbutton_Down,BorderLayout.EAST);
		jpanel.add(jbutton_Reset,BorderLayout.SOUTH);
		
		this.setLayout(new BorderLayout());
		this.add(jpanel,BorderLayout.CENTER);
		
	}
	public void increment() {
		this.counterModel.inCreaseMent();
		this.jlable_Value.setText(counterModel.getValue()+"");
	}
	public void decrement() {
		this.counterModel.deCreaseMent();
		this.jlable_Value.setText(counterModel.getValue()+"");
	}
	public void reset() {
		this.counterModel.reset();
		this.jlable_Value.setText(counterModel.getValue()+"");
	}
	
}
