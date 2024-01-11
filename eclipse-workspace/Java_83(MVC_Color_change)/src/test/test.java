package test;

import javax.swing.UIManager;

import view.MyColorView;

public class test {
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MyColorView();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
