public class Sedan extends FourDoor {

	private boolean trunkDoorStatus;
	private int sedanDriverDoorStatus;
	
	public Sedan() {
		super();
	}
	
	public Sedan(String uid) {
		super(uid);
	}
	
	public void setTrunkDoorStatus(boolean tds) {
		trunkDoorStatus = tds;
	}
	
	public boolean getTrunkDoorStatus() {
		return trunkDoorStatus;
	}
	
	// method over-ride
	public void setDriverDoorStatus(boolean sdds) {
		if(sdds == true)
			sedanDriverDoorStatus = 10;
		else
			sedanDriverDoorStatus = 15;
	}
	
	// method over-ride
	public boolean getDriverDoorStatus() {
		
		boolean t;
		
		if (sedanDriverDoorStatus == 10)
			t = true;
		else
			t = false;
		
		return t;
	}
	
	public int getSedanDriverDoorStatus() {
		return sedanDriverDoorStatus;
	}
}
