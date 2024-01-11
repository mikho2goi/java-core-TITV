package test;

import javax.swing.UIManager;

import view.MouseExampleView;

public class test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MouseExampleView();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
