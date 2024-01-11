package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.LastButtonView;

public class LastButtonListener implements ActionListener {
	private LastButtonView lasbuttonView;
	
	
	public LastButtonListener(LastButtonView lastbuttonView) {
			this.lasbuttonView = lastbuttonView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		if (action.equals("1")) {
			lasbuttonView.setLabe_l();
		} else if(action.equals("2")){
			lasbuttonView.setLabe_2();
		}else if(action.equals("3")){
			lasbuttonView.setLabe_3();

		}
		else if(action.equals("4")){
			lasbuttonView.setLabe_4();

		}	
	}
	
}
