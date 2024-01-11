package Test;

import javax.swing.UIManager;

import View.LastButtonView;

public class test {

	public static void main(String[] args) {
		try {
			
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new LastButtonView();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
