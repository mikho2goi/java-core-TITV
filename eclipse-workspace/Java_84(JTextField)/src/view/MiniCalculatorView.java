package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.MiniCalculatorListener;
import model.MiniCalculatorModel;

public class MiniCalculatorView extends JFrame {
	private	MiniCalculatorModel miniCalculatorModel;
	private JTextField jtextfield_firstValue;
	private JTextField jtextfield_secondValue;
	private JTextField jtextfield_answer;

	public MiniCalculatorView() throws HeadlessException {
		this.miniCalculatorModel = new MiniCalculatorModel();
		this.init();
		this.setVisible(true);
	}

	private void init() {
		this.setTitle("Calculator");
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		
		Font font = new Font("Arial",Font.BOLD,30);
		
		MiniCalculatorListener ml = new MiniCalculatorListener(this);
		
		JLabel jlabel_FirstValue = new JLabel("First Value");
		jlabel_FirstValue.setFont(font);
		JLabel jLabel_SeconValue = new JLabel("Second Value");
		jLabel_SeconValue.setFont(font);
		JLabel jLabel_Answer = new JLabel("Answer");
		jLabel_Answer.setFont(font);
		
		jtextfield_firstValue = new JTextField(50);
		jtextfield_firstValue.setFont(font);
		
		jtextfield_secondValue = new JTextField(50);
		jtextfield_secondValue.setFont(font);
		
		jtextfield_answer = new JTextField(50);
		jtextfield_answer.setFont(font);
		
		JPanel jpanel_IO = new JPanel();
		jpanel_IO.setLayout(new GridLayout(3,2,20,20));
		
		jpanel_IO.add(jlabel_FirstValue);
		jpanel_IO.add(jtextfield_firstValue);

		jpanel_IO.add(jLabel_SeconValue);
		jpanel_IO.add(jtextfield_secondValue);
		
		jpanel_IO.add(jLabel_Answer);
		jpanel_IO.add(jtextfield_answer);
		
		
		JButton jbutton_plus = new JButton("+");
		jbutton_plus.setFont(font);
		jbutton_plus.addActionListener(ml);
		
		JButton jbutton_minus = new JButton("-");
		jbutton_minus.addActionListener(ml);
		jbutton_minus.setFont(font);

		JButton jbutton_multiply = new JButton("*");
		jbutton_multiply.addActionListener(ml);
		jbutton_multiply.setFont(font);

		JButton jbutton_devide = new JButton("/");
		jbutton_devide.setFont(font);
		jbutton_devide.addActionListener(ml);

		JButton jbutton_pow = new JButton("^");
		jbutton_pow.setFont(font);
		jbutton_pow.addActionListener(ml);
		
		JButton jbutton_mod = new JButton("%");
		jbutton_mod.setFont(font);
		jbutton_mod.addActionListener(ml);
		
		JPanel jpanel_button = new JPanel();
		jpanel_button.setLayout(new GridLayout(2,3));
		jpanel_button.add(jbutton_plus);
		jpanel_button.add(jbutton_minus);
		jpanel_button.add(jbutton_multiply);
		jpanel_button.add(jbutton_devide);
		jpanel_button.add(jbutton_pow);
		jpanel_button.add(jbutton_mod);
		
		
		
		this.setLayout(new BorderLayout());
		this.add(jpanel_IO,BorderLayout.CENTER);
		this.add(jpanel_button,BorderLayout.SOUTH);
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	public void plus() {
		double firstValue = Double.valueOf(jtextfield_firstValue.getText());
		double secondValue = Double.valueOf(jtextfield_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.plus();
		this.jtextfield_answer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
	public void minus() {
		double firstValue = Double.valueOf(jtextfield_firstValue.getText());
		double secondValue = Double.valueOf(jtextfield_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.minus();
		this.jtextfield_answer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
	public void multiply() {
		double firstValue = Double.valueOf(jtextfield_firstValue.getText());
		double secondValue = Double.valueOf(jtextfield_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.multiply();
		this.jtextfield_answer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
	public void devide() {
		double firstValue = Double.valueOf(jtextfield_firstValue.getText());
		double secondValue = Double.valueOf(jtextfield_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.devide();
		this.jtextfield_answer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
	public void pow() {
		double firstValue = Double.valueOf(jtextfield_firstValue.getText());
		double secondValue = Double.valueOf(jtextfield_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.pow();
		this.jtextfield_answer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
	public void mod() {
		double firstValue = Double.valueOf(jtextfield_firstValue.getText());
		double secondValue = Double.valueOf(jtextfield_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.mod();
		this.jtextfield_answer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
	
	
	
	
	
	
	
	
}
