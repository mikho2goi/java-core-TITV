package model;

public class NotePadModel {
	private String fileName;
	private String conTent;
	
	public NotePadModel() {
		this.fileName  = "";
		this.conTent  = "";
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getConTent() {
		return conTent;
	}

	public void setConTent(String conTent) {
		this.conTent = conTent;
	}
	
}
