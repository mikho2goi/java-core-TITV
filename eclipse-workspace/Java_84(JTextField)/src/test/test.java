package test;

import javax.swing.UIManager;

import view.MiniCalculatorView;

public class test {
	public static void main(String[] args) {
		try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				new MiniCalculatorView();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
