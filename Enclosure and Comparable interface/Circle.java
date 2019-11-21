#Adriana Sham Luo
#11/16/2019
#HW4


public class Circle implements Enclosure,Comparable<Circle> {

	private double radius;

	public Circle(){
		radius = 0;
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public int compareTo(Circle arg0) {
		if(this.radius == arg0.radius) return 0;
		else if(this.radius>arg0.radius) return 1;
			else return -1;
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	public double area() {
		return Math.PI * radius * radius;
	}

}