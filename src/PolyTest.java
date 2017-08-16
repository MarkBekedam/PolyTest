/*
 *  This program is an exercise in demonstrating Polymorphism in a variety of ways
 *  other than the obvious of type casting one object to another.
 */

import java.util.Vector;

public class PolyTest {

	static Vector<Economy> ecoCars = new Vector<Economy>();
	static String[] ecoColors = {"Blue", "Red", "Green", 
								"Yellow", "White", "Black"};
	
	public static void main(String[] args) {

		ChildCart ccObject = new ChildCart("CC0001");
		DieselElectric deObject = new DieselElectric("DE0001");
		GasElectric geObject = new GasElectric("GE0001");
		
		// assign colors to the three concrete objects
		ccObject.setExtColor(ecoColors[0]);
		deObject.setExtColor(ecoColors[1]);
		geObject.setExtColor(ecoColors[2]);
		
		// make a pointer to a reference variable of economy type
		Economy ref;
		
		// add the objects to the vector container
		ecoCars.add(ccObject);
		ecoCars.add(deObject);
		ecoCars.add(geObject);
		
		// Polymorphic calls to the getExtColor method
		System.out.println("\n\n  A. Polymorphic Presentation:  ");
		
		for (int i = 0; i < ecoCars.size(); i++) {
			// cast the objects to the abstract super class type and store them in a reference.
			ref = (Economy)ecoCars.get(i);
			System.out.println("  " + ref.getExtColor());
		}
		
		// Polymorphic argument definition for printCar()
		System.out.println("\n\n  B. Polymorphic arguments:  ");
		printCar(ccObject);
		printCar(deObject);
		printCar(geObject);
		
		// Polymorphic return type for findCar
		System.out.print("\n\n  C. Polymorphic return values:  \n");
		ccObject.setExtColor("Black");
		System.out.println("  Find CC0001 color :\t " + findCar("CC0001").getExtColor());
		geObject.setExtColor("Green");
		System.out.println("  Find GE0001 color :\t " + findCar("GE0001").getExtColor());
		deObject.setExtColor("Red");
		System.out.println("  Find DE0001 color :\t " + findCar("DE0001").getExtColor());
	}
	
	// takes as an argument any object of a class derived from the EConomy class
	public static void printCar(Economy ecoOb) {
		System.out.print("\n  " 	+ ecoOb.toString() 	+ " 	\t" 
									+ ecoOb.getUID() 	+ " 	\t"
									+ ecoOb.getExtColor());
	}
	
	// returns any ojbect of a class derived from the Economy class
	public static Economy findCar(String carUID) {
		
		// create a reference and cast it
		Economy tempCar = null;
		for(int i = 0; i < ecoCars.size(); i++) {
			// cast it after it is retrieved from the container and put it in the vector
			tempCar = (Economy)ecoCars.get(i);
			if(carUID.equalsIgnoreCase(tempCar.getUID())) {
				tempCar = (Economy)ecoCars.get(i);
				break;
			}
		}
		return tempCar;
	}
}
