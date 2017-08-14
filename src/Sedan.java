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
	
}
