package model;

import java.awt.Color;

public class MyColorModel {
	private Color foreground,backgroud;
	private boolean opaque;
	
	
	public MyColorModel() {
		this.foreground = Color.BLACK;
		this.backgroud = Color.WHITE;
		this.opaque = true;
	}
	

	public Color getForeground() {
		return foreground;
	}


	public void setForeground(Color foreground) {
		this.foreground = foreground;
	}


	public Color getBackgroud() {
		return backgroud;
	}


	public void setBackgroud(Color backgroud) {
		this.backgroud = backgroud;
	}

	public boolean isOpaque() {
		return opaque;
	}


	public void setOpaque(boolean qpaque) {
		this.opaque = qpaque;
	}
	
	
}
