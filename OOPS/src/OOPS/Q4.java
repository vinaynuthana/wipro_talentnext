package OOPS;
class Animal{
	static void eat() {
		System.out.println("The animal is eating.");
	}
	static void sleep() {
		System.out.println("The animal is sleeping.");
	}
}
class Bird extends Animal{
	static void eat() {
		System.out.println("The bird is pecking at its food.");
	}
	static void sleep() {
		System.out.println("The bird is sleeping in its nest.");
	}
	void fly() {
        System.out.println("The bird is flying high in the sky.");
	}
}
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();
		Bird bird = new Bird();
		bird.eat();
		bird.sleep();
		bird.fly();
	}

}
