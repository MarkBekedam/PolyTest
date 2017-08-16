public abstract class FourDoor extends Car {

	private boolean leftBackPassengerDoorStatus;
	private boolean rightBackPassengerDoorStatus;
	
	public FourDoor() {
		super();
	}
	
	public FourDoor(String ufdid) {
		super(ufdid);
	}
	
	public void setLeftBackPassengerDoorStatus(boolean lbpds) {
		leftBackPassengerDoorStatus = lbpds;
	}
	
	public boolean getLeftBackPassengerDoorStatus() {
		return leftBackPassengerDoorStatus;
	}
	
	public void setRightBackPassengerDoorStatus(boolean rbpds) {
		rightBackPassengerDoorStatus = rbpds;
	}
	
	public boolean getRightBackPassengerDoorStatus() {
		return rightBackPassengerDoorStatus;
	}
}
