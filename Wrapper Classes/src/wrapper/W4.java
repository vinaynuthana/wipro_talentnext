package wrapper;
class Employee implements Cloneable{
	int id;
	String name;
	Employee(int id,String name){
		this.id = id;
		this.name = name;
	}
	public Employee clone() {
		try {
			return (Employee) super.clone();
		}
		catch(CloneNotSupportedException e) {
			return null;
		}
	}
	public void display() {
		System.out.println("Id : "+id+" ," +"Name : "+name);
	}
}

public class W4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(111,"Vinay");
		Employee emp2 = emp1.clone();
		System.out.println("Before Modification: ");
		System.out.print("Original= ");
		emp1.display();
		System.out.print("Clone= ");
		emp2.display();
		
		emp1.name="Sukumar";
		emp1.id = 21;
		System.out.print("\nAfter Modification: ");
		System.out.print("\nOriginal= ");
		emp1.display();
		System.out.print("Clone= ");
		emp2.display();
	}

}
