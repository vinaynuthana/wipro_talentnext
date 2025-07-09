package OOPS;
class shape{
	void draw() {
		System.out.println("Drawing Shape");
	}
	void erase() {
		System.out.println("Erasing Shape");
	}
}
class Circle extends shape{
	void draw() {
		System.out.println("Drawing Shape");
	}
	void erase() {
		System.out.println("Erasing Shape");
	}
}
class Square extends shape{
	void draw() {
		System.out.println("Drawing Shape");
	}
	void erase() {
		System.out.println("Erasing Shape");
	}
}
class Triangle extends shape{
	void draw() {
		System.out.println("Drawing Shape");
	}
	void erase() {
		System.out.println("Erasing Shape");
	}
}
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape c = new Circle();
		shape t = new Triangle();
		shape s = new Square();
		c.draw();
		c.erase();
		System.out.println();
		t.draw();
		t.erase();
		System.out.println();
		s.draw();
		s.erase();
	}

}
