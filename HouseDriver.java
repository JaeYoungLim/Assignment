/**
 * @author jl23868
 * Name: Jae Young Lim
 * Date: 9 April 2015
 * Purpose: OOP (Object Oriented Programming)
 * 2 types of classes
 * 1. Create a class to use in another class. i.e Class House (use in another class)
 * 2. Drive class (has a main method)
 */

import java.util.Scanner;

public class HouseDriver {
	public static void main(String [] args) {
		
		House house = new House(); //The First Room
		System.out.println(house.toString());

		House secondHouse = new House(); //The Second Room
		secondHouse.setColor("purple");
		secondHouse.setFloor("tiled floors");
		secondHouse.setWindow(0);
		System.out.println("\nThe second house: ");
		System.out.println(secondHouse.toString());
		
		House thirdHouse = new House(); //The Third Room
		thirdHouse.setColor("white");
		thirdHouse.setFloor("carpeted flooring");
		thirdHouse.setWindow(3);
		System.out.println("\nThe third house: ");
		System.out.println(thirdHouse.toString());
		
		
		//keyboard is an instance variable
		Scanner keyboard = new Scanner(System.in); //instantiation
				
		House ownHouse = new House();
		
		System.out.println("\nPlease provide a color you want to paint on the room: ");
		String color = keyboard.next();
		ownHouse.setColor(color);

		System.out.println("Please provide a floor type you want to have on the room: ");
		String floor = keyboard.next();
		ownHouse.setFloor(floor);

		System.out.println("Please provide the number of window(s) you want to have in the room: ");
		int window  = keyboard.nextInt();
		ownHouse.setWindow(window);

		System.out.println(ownHouse.toString());
		
		keyboard.close();
		
	}

}
