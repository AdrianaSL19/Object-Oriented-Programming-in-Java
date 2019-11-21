#Adriana Sham Luo
#11/16/2019
#HW4

public class Square implements Enclosure,Comparable<Square> {

	private double size;
		
	public Square(){
	}

	public Square(double size) {
		super();
		this.size = size;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public int compareTo(Square arg0) {
		if(this.size==arg0.size) return 0;
		else if(this.size>arg0.size) return 1;
			else return -1;
	}

	public double perimeter() {
		return 4 * size;
	}

	public double area() {
		return size * size;
	}

}