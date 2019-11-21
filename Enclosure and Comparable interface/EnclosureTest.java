#Adriana Sham Luo
#11/16/2019
#HW4

public class EnclosureTest {
	public static void main(String args[]){

		Circle c1 = new Circle(10);

		System.out.println("Area of fist circle " + c1.area());
		System.out.println("Perimeter of fist circle " + c1.perimeter());

		Circle c2 = new Circle(20);

		System.out.println("Area of fist second circle" + c2.area());
		System.out.println("Perimeter of second circle " + c2.perimeter());
		System.out.println("Are two cirles equal?" + c1.compareTo(c2));

		Square s1 = new Square(10);

		System.out.println("Area of fist Square " + s1.area());
		System.out.println("Perimeter of fist Square " + s1.perimeter());

		Square s2 = new Square(20);

		System.out.println("Area of fist second Square " + s2.area());
		System.out.println("Perimeter of second Square " + s2.perimeter());
		System.out.println("Are two square equal?" + s1.compareTo(s2));
	}
}