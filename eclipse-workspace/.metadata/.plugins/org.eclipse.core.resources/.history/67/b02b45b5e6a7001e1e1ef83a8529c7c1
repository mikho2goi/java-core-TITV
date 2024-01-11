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
		if(luaChon.equals("Save")) {
			this.menuExampleView.setText("Save");
		}
		else if(luaChon.equals("New")) {
			this.menuExampleView.setText("New");
		}
		else if(luaChon.equals("Save as")) {
			this.menuExampleView.setText("Save as");
		}
		else if(luaChon.equals("Contact now")) {
			this.menuExampleView.setText("Contact now");
		}
		else if(luaChon.equals("EXIT")) {
			System.exit(0);
		}
		
	}

}
