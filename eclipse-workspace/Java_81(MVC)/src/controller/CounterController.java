package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.CounterModel;
import view.CounterView;

public class CounterController implements ActionListener{
	private CounterController counterController;
	private CounterModel counterModel;
	private CounterView counterView;
	
	public CounterController(CounterView counterView) {
		this.counterView = counterView;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	String action = e.getActionCommand();
	System.out.println("Ban da nhan nut "+action);
		if (action.equals("UP")) {
			this.counterView.increment();
		}else if(action.equals("DOWN")) {
			this.counterView.decrement();
		}else {
			this.counterView.reset();
		}
		
	}
	
}
