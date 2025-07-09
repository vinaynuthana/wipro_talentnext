package OOPS;
class Fruit{
	String name;
	String taste;
	int size;
	 public Fruit(String name, String taste, int size) {
	        this.name = name;
	        this.taste = taste;
	        this.size = size;
	    }
	void eat() {
        System.out.println("The fruit is: " + name + ", and its taste is: " + taste + ".");
	}
}
class Apple extends Fruit{
	 public Apple(int size) {
	      super("Apple", "sweet", size);
	    } 
	void eat() {
        System.out.println("The fruit is: " + name + ", and its taste is: " + taste + ".");

	}
}
class Orange extends Fruit{
	 public Orange(int size) {
	        super("Orange", "citrus and tangy", size);
	    }
	void eat() {
        System.out.println("The fruit is: " + name + ", and its taste is: " + taste + ".");

	}
}
public class Q5 {
	public static void main(String[] args) {
		Apple apple = new Apple(500);
		Orange orange = new Orange(43);
		apple.eat();
		orange.eat();
	}

}
