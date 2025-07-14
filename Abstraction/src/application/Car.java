package application;
import interfaces.Vehicle;
import interfaces.Fourwheeler;
public class Car implements Vehicle,Fourwheeler{
	public void message() {
		Vehicle.super.message();
		System.out.println("Inside Car");
	}
	public static void main(String[] args) {
		Car car = new Car();
		car.message();
	}
}
