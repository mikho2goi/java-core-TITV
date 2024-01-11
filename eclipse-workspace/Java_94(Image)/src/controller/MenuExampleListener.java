package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;

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
		}else if(luaChon.equals("Toolbar")) {
			AbstractButton checkBox = (AbstractButton) e.getSource();
			boolean check = checkBox.getModel().isSelected();
			if (check) {
				this.menuExampleView.enableToolBar();
			}else {
				this.menuExampleView.disableToolBar();
			}
		}
		else {
			this.menuExampleView.setText("Bạn đã click "+button);
		}
	}
		
	

}
