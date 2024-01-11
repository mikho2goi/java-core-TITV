package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MiniCalculatorView;

public class MiniCalculatorListener implements ActionListener {
	private MiniCalculatorView miniCalculatorView;

	public MiniCalculatorListener(MiniCalculatorView miniCalculatorView) {
		this.miniCalculatorView = miniCalculatorView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		if(action.equals("+")) {
			this.miniCalculatorView.plus();
		}
			else if(action.equals("-")) {
				this.miniCalculatorView.minus();
			
		}	else if(action.equals("*")) {
			this.miniCalculatorView.multiply();
			
		}	else if(action.equals("/")) {
			this.miniCalculatorView.devide();
			
		}	else if(action.equals("^")) {
			this.miniCalculatorView.pow();
			
		}	else if(action.equals("%")) {
			this.miniCalculatorView.mod();
			
		
		}
	}
	
}
