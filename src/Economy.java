
public abstract class Economy extends Car {

	private boolean rearDoorStatus;
	
	public Economy() {
		super();
	}
	
	public Economy(String uid) {
		super(uid);
	}
	
	public void setRearDoorStatus(boolean rds) {
		rearDoorStatus = rds;
	}
	
	public boolean getRearDoorStatus() {
		return rearDoorStatus;
	}
}
