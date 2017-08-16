public class Wagon extends FourDoor {
	
	private boolean rearDoorStatus;
	private int rearDoorWiperSpeed;
	
	public Wagon() {
		super();
	}
	
	public Wagon(String uid) {
		super(uid);
	}
	
	public void setExtColor(String ec) {
	}
	
	public String getExtColor() {
		return new String();
	}
	public void setRearDoorStatus(boolean rds) {
		rearDoorStatus = rds;
	}
	
	public final boolean getRearDoorStatus() {
		return rearDoorStatus;
	}
	
	public final void setRearDoorWiperSpeed(int rws) {
		rearDoorWiperSpeed = rws;
	}
	
	public final int getRearDoorWiperSpeed() {
		return rearDoorWiperSpeed;
	}
}
