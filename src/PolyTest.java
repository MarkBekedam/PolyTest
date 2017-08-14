/*
 *  This program is an exercise in demonstrating Polymorphism in a variety of ways
 *  other than the obvious of type casting one object to another.
 */

public class PolyTest {

	static Economy[] ecoCars = new Economy[3];
	static String[] ecoColors = {"Blue", "Red", "Green", 
								"Yellow", "White", "Black"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildCart ccObject = new ChildCart("CC0001");
		DieselElectric deObject = new DieselElectric("DE0001");
		GasElectric geObject = new GasElectric("GE0001");
		
		ecoCars[0] = ccObject;
		ecoCars[1] = deObject;
		ecoCars[2] = geObject;
		
		// Polymorphic calls to setExtColor method
		System.out.println("\n\nA. Polymorphic Array: ");
		for(int i = 0; i < ecoCars.length; i++) {
			System.out.print("\n");
			for(int n = 0; n < ecoColors.length; n++) {
				ecoCars[i].setExtColor(ecoColors[n]);
				System.out.println(ecoCars[i].getExtColor() + "  ");
			}
		}
		
		// Polymorphic argument definition for printCar()
		System.out.println("\n\n  B. Polymorphic arguments:  ");
		printCar(ccObject);
		printCar(deObject);
		printCar(geObject);
		
		// Polymorphic return type for findCar
		System.out.print("\n\n  C. Polymorphic return values:  \n\n");
		ccObject.setExtColor("Black");
		System.out.println("  Find CC0001 color :\t " + findCar("CC0001").getExtColor());
		geObject.setExtColor("Green");
		System.out.println("  Find GE0001 color :\t " + findCar("GE0001").getExtColor());
		deObject.setExtColor("Red");
		System.out.println("  Find DE0001 color :\t" + findCar("DE0001").getExtColor());
	}
	
	// takes as an argument any object of a class derived from the EConomy class
	public static void printCar(Economy ecoOb) {
		System.out.print("\n  " 	+ ecoOb.toString() 	+ " 	\t" 
									+ ecoOb.getUID() 	+ " 	\t"
									+ ecoOb.getExtColor());
	}
	
	// returns any ojbect of a class derived from the Economy class
	public static Economy findCar(String carUID) {
		Economy tempCar = new Economy();
		for(int i = 0; i < ecoCars.length; i++) {
			if(ecoCars[i].getUID().equalsIgnoreCase(carUID)) {
				tempCar = ecoCars[i];
				break;
			}
		}
		return tempCar;
	}
}
