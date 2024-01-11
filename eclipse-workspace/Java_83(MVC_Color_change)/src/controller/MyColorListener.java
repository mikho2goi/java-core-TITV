package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MyColorView;

public class MyColorListener implements ActionListener {
	private MyColorView myColorView;

	public MyColorListener(MyColorView myColorView) {
		this.myColorView = myColorView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String suKien = e.getActionCommand();

		if (suKien.equals("RED TEXT")) {
			this.myColorView.textColor(Color.RED);
		} else if(suKien.equals("GREEN TEXT")) {
			this.myColorView.textColor(Color.GREEN);
	}
		else if(suKien.equals("YELLOW TEXT")) {
			this.myColorView.textColor(Color.YELLOW);
	}
		else if(suKien.equals("RED BACKGROUND")) {
			this.myColorView.backgroundColor(Color.RED);
	}
		else if(suKien.equals("GREEN BACKGROUND")) {
			this.myColorView.backgroundColor(Color.GREEN);
	}

		else if(suKien.equals("YELLOW BACKGROUND")) {
			this.myColorView.backgroundColor(Color.YELLOW);
	}

	

}
}