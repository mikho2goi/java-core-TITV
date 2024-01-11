package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JpanelDraw extends JPanel{
	public JpanelDraw() {
		this.setBackground(Color.WHITE);
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.drawLine(15, 15, 50, 50);
		
		g.setColor(Color.RED);
		g.drawOval(255, 255, 50, 60);
		
		g.setColor(Color.GREEN);
		g.fill3DRect(400, 400, 60, 60, getFocusTraversalKeysEnabled());
		
		g.setColor(Color.PINK);
		g.drawRoundRect(80, 80, 70, 70, 100, 100);
	
		g.setColor(Color.BLACK);
		g.drawString("Viet Nam", 120, 250);
		
	}


}
