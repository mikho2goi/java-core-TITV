package test;

import javax.swing.UIManager;

import controller.CounterController;
import model.CounterModel;
import view.CounterView;

public class test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			CounterView ctv = new CounterView();
			new CounterController(ctv);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
