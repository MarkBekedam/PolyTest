public class DieselElectric extends Economy {
	
	private String diesEleColor;
	
	public DieselElectric() {
		super();
	}
	
	public DieselElectric(String deid) {
		super(deid);
	}
	
	public void setExtColor(String ec) {
		if(ec.equalsIgnoreCase("blue"))
			diesEleColor = "0000FF-Be";
		else if(ec.equalsIgnoreCase("red"))
			diesEleColor = "FF0033-Rd";
		else if(ec.equalsIgnoreCase("green"))
			diesEleColor = "00FF00-Gn";
		else if(ec.equalsIgnoreCase("yellow"))
			diesEleColor = "FFFF00-Yw";
		else if(ec.equalsIgnoreCase("white"))
			diesEleColor = "FFFFFF-We";
		else if(ec.equalsIgnoreCase("black"))
			diesEleColor = "000000-bk";
		else 
			diesEleColor = "FFFFFF-We";
	}
	
	public String getExtColor() {
		return diesEleColor;
	}
}
