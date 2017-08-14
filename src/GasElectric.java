public class GasElectric extends Economy {
	
	private String gasEleColor;
	
	public GasElectric() {
		super();
	}
	
	public GasElectric(String geid) {
		super(geid);
	}
	
	public void setExtColor(String ec) {
		if(ec.equalsIgnoreCase("blue"))
			gasEleColor = "Sky Blue";
		else if(ec.equalsIgnoreCase("red"))
			gasEleColor = "Red";
		else if(ec.equalsIgnoreCase("green"))
			gasEleColor = "Lime Green";
		else if(ec.equalsIgnoreCase("yellow"))
			gasEleColor = "Yellow";
		else if(ec.equalsIgnoreCase("white"))
			gasEleColor = "White";
		else if(ec.equalsIgnoreCase("black"))
			gasEleColor = "Black";
		else 
			gasEleColor = "White";
	}
	
	public String getExtColor() {
		return gasEleColor;
	}
}
