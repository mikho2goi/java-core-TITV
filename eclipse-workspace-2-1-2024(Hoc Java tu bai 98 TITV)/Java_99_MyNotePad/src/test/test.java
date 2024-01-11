package test;

import javax.swing.UIManager;

import view.NotePadView;

public class test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new NotePadView();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
