#Adriana Carolina Sham Luo
#HW3

public class CruiseShip extends Ship {

	public int maxPasangers;
	
	public CruiseShip(){
		maxPasangers = 0;
	}

	public CruiseShip (int x, String y, String z){
		super(y,z);
		maxPasangers = x;
	}

	public int getMaxPasangers() {
		return maxPasangers;
	}

	public void setMaxPasangers(int maxPasangers) {
		this.maxPasangers = maxPasangers;
	}

	public String toString(){
		return "The ship's name is: " + getShipName() + " and the ship's max pasangers is: " + getMaxPasangers() + " and the ship's year is: " + getShipYear();
	}

}