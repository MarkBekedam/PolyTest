public class Wagon extends FourDoor {
	
	private boolean rearDoorStatus;
	private int rearDoorWiperSpeed;
	
	public Wagon() {
		super();
	}
	
	public Wagon(String uid) {
		super(uid);
	}
	
	public void setRearDoorStatus(boolean rds) {
		rearDoorStatus = rds;
	}
	
	public boolean getRearDoorStatus() {
		return rearDoorStatus;
	}
	
	public void setRearDoorWiperSpeed(int rws) {
		rearDoorWiperSpeed = rws;
	}
	
	public int getRearDoorWiperSpeed() {
		return rearDoorWiperSpeed;
	}
}
