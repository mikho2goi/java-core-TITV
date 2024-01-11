package main;

public class Student {
	private String name;
	private int tuoi;
	public Student(String name, int tuoi) {
		this.name = name;
		this.tuoi = tuoi;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the tuoi
	 */
	public int getTuoi() {
		return tuoi;
	}
	/**
	 * @param tuoi the tuoi to set
	 */
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", tuoi=" + tuoi + "]";
	}
	
}
