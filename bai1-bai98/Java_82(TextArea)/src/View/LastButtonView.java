package View;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controller.LastButtonListener;
import Model.LastButtonModel;

public class LastButtonView extends JFrame{
	private LastButtonModel lastButtonModel;
	private JLabel jlabel;

	
	
	public LastButtonView()  {
		this.lastButtonModel = new LastButtonModel();
		this.init();
		this.setVisible(true);
	}



	private void init() {
		this.setTitle("Last button ");
		this.setSize(600,500);
		this.setLocationRelativeTo(null);
		
		JPanel jpanelCenter = new JPanel();
		jpanelCenter.setLayout(new GridLayout(2,2));
		
		Font font = new Font("Arial",Font.BOLD,30);
		LastButtonListener listener = new LastButtonListener(this);
		
		JButton jbutton_1 = new JButton("1");
		jbutton_1.setFont(font);
		jbutton_1.addActionListener(listener);
		
		JButton jbutton_2 = new JButton("2");
		jbutton_2.addActionListener(listener);
		jbutton_2.setFont(font);
		
		JButton jbutton_3 = new JButton("3");
		jbutton_3.addActionListener(listener);
		jbutton_3.setFont(font);
		
		JButton jbutton_4 = new JButton("4");
		jbutton_4.addActionListener(listener);
		jbutton_4.setFont(font);
		
		jpanelCenter.add(jbutton_1);
		jpanelCenter.add(jbutton_2);
		jpanelCenter.add(jbutton_3);
		jpanelCenter.add(jbutton_4);
		
		jlabel = new JLabel("123");
		jlabel.setFont(font);
		JPanel jpanelFooter = new JPanel();
		jpanelFooter.add(jlabel);
		
		
		
		
		this.setLayout(new BorderLayout());
		this.add(jpanelFooter,BorderLayout.SOUTH);
		this.add(jpanelCenter,BorderLayout.CENTER);
		
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
		public void setLabe_l() {
			this.lastButtonModel.setValue_to_1();
			jlabel.setText("Last Button: "+this.lastButtonModel.getValue());
		}
		public void setLabe_2() {
			this.lastButtonModel.setValue_to_2();
			jlabel.setText("Last Button: "+this.lastButtonModel.getValue());
		}
		public void setLabe_3() {
			this.lastButtonModel.setValue_to_3();
			jlabel.setText("Last Button: "+this.lastButtonModel.getValue());
		}
		public void setLabe_4() {
			this.lastButtonModel.setValue_to_4();
			jlabel.setText("Last Button: "+this.lastButtonModel.getValue());
		}
	
	
	
}
