#Adriana Carolina Sham Luo
#HW3

import java.util.ArrayList;

public class ShipSimulation extends Ship {
	public static void main(String[] args){
		ArrayList<Ship> list = new ArrayList<Ship>();
		Ship ship1 = new Ship();
		Ship ship2 = new Ship();
		ship1.setShipName("DAVISON");
		ship2.setShipName("DENEBOLA");
		ship1.setShipYear("1982");
		ship2.setShipYear("1762");
		list.add(ship1);
		list.add(ship2);

		for (Ship entry : list) {
			System.out.printf("Name = %s\tYear = %s\n",
					entry.getShipName(), entry.getShipYear());
		}
	}
}