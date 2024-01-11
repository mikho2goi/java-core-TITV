package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MenuExampleView;

public class MenuExampleListener implements ActionListener{
	MenuExampleView menuExampleView;
	public MenuExampleListener(MenuExampleView menuExampleView) {
		this.menuExampleView = menuExampleView;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	String luaChon = e.getActionCommand();
	String button = e.getActionCommand();
		if(luaChon.equals("EXIT")) {
			System.exit(0);
		}
		else {
			this.menuExampleView.setText("Bạn đã click "+button);
		}
	}
		
	

}
