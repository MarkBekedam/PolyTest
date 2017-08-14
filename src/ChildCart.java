

public class ChildCart extends Economy {
	
	private String cCartColor;
	
	public ChildCart() {
		super();
	}
	
	public ChildCart(String ccid) {
		super(ccid);
	}
	
	public void setExtColor(String ec) {
		if(ec.equalsIgnoreCase("blue"))
			cCartColor = "sky";
		else if(ec.equalsIgnoreCase("red"))
			cCartColor = "Ribbon";
		else if(ec.equalsIgnoreCase("green"))
			cCartColor = "Spring";
		else if(ec.equalsIgnoreCase("yellow"))
			cCartColor = "Home";
		else if(ec.equalsIgnoreCase("white"))
			cCartColor = "Day";
		else if(ec.equalsIgnoreCase("black"))
			cCartColor = "Night";
		else
			cCartColor = "Day";
	}
	
	public String getExtColor() {
		return cCartColor;
	}
}
