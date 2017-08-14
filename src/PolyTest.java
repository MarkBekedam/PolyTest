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
		System.out.println("\n\nA. Polymorphic Array: \n");
		for(int i = 0; i < ecoColors.length; i++) {
			System.out.print("\n  ");
			for(int n = 0; n < ecoCars.length; n++) {
				ecoCars[i].setExtColor(ecoColors[n]);
				System.out.println(ecoCars[i].getExtColor() + "  ");
			}
		}
	}
}
