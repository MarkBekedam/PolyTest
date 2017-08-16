
public abstract class Car {

	private String exteriorColor;
	private float levelOfFuel;
	private String carType;
	private boolean hoodStatus;
	private float kphSpeed;
	private int wipersSpeed;
	private boolean driverDoorStatus;
	private boolean frontPassengerDoorStatus;
	private String uniqueID;
	
	Car() {
		uniqueID = "0000AA";
	}
	
	Car(String uid) {
		uniqueID = uid;
	}
	
	public abstract void setExtColor(String ec);
		// exteriorColor = ec;
	
	public abstract String getExtColor();
		// return exteriorColor;
	
	
	public String getUID() {
		return uniqueID;
	}
	
	public void setUID(String uid) {
		uniqueID = uid;
	}

	
	public void setLevelOfFuel(float fl) {
		levelOfFuel = fl;
	}
	
	public float getLevelOfFuel() {
		return levelOfFuel;
	}
	
	public void setCarType(String ct) {
		carType = ct;
	}
	
	public String getCarType() {
		return carType;
	}
	
	public void setKphSpeed(float ks) {
		kphSpeed = ks;
	}
	
	public float getKphSpeed() {
		return kphSpeed;
	}
	
	public void setWipersSpeed(int ws) {
		wipersSpeed = ws;
	}
	
	public int getWipersSpeed() {
		return wipersSpeed;
	}
	
	public void setDriverDoorStatus(boolean ds) {
		driverDoorStatus = ds;
	}
	
	public boolean getDriverDoorStatus() {
		return driverDoorStatus;
	}
	
	public void setFrontPassengerDoorStatus(boolean fpds) {
		frontPassengerDoorStatus = fpds;
	}
	
	public boolean getFrontPassengerDoorStatus() {
		return frontPassengerDoorStatus;
	}
	
	public void setHoodStatus(boolean hs) {
		hoodStatus = hs;
	}
	
	public boolean getHoodStatus() {
		return hoodStatus;
	}
}
