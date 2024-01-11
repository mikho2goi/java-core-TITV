package model;

public class CounterModel {
	private int value;
	public CounterModel() {
		this.value = 0;
	}
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	
	public void inCreaseMent() {
		this.value++;
	}
	public void deCreaseMent() {
		this.value--;
	}
	public void reset() {
		this.value = 0;
	}
	
	
}
