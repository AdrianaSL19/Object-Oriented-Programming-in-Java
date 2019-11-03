#Adriana Carolina Sham Luo
#HW3

public class Ship {

public String shipName;
public String shipYear;

	public Ship(){
		shipName = "";
		shipYear = "";
	}

	public Ship (String x, String y){
		shipName = x;
		shipYear = y;
	}

	public String getShipName(){
		return shipName;
	}

	public void setShipName(String shipName){
		this.shipName = shipName;
	}

	public String getShipYear(){
		return shipYear;
	}

	public void setShipYear(String shipYear){
		this.shipYear = shipYear;
	}

	public String toString(){
		return "The ship's name is: " + getShipName() + " and the ship's year is: " + getShipYear();
	}

}