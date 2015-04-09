/**
 * @author jl23868
 * Name: Jae Young Lim
 * Date: 9 April 2015
 * Purpose: OOP (Object Oriented Programming)
 * 2 types of classes
 * 1. Create a class to use in another class. i.e Class House (use in another class)
 * 2. Drive class (has a main method)
 */

public class House {
	//characteristics (attributes) or adj./object variables
	//encapsulate the attributes by adding private modifiers
	private String color;
	private String floor;
	private int window;
	
	//constructor: is a method that initialize the value of the attributes
	public House() { 
		this.color = "yellow";
		this.floor = "hard wooden flooring";
		this.window = 1;
		
	}
	
	public House(String color, String floor, int window) {
		this.color = color;
		this.floor = floor;
		this.window = window;
	}
	//behaviors or verbs/ method
	public String room() {
		return "room";
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;	
	}
	
	public String getFloor() {
		return this.floor;
	}
	
	public void setFloor(String floor) {
		this.floor = floor;
	}
	
	public int getWindow() {
		return this.window;
	}
	
	public void setWindow(int window) {
		this.window = window;
	}
	
	public String toString() {
		return "The room in a house is painted " + this.color 
				+ " with " + this.floor 
				+ ", and has " + this.window + " window(s).";
	}
}
