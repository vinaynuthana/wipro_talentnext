package streamAPI;

public class Stream3b {
	int roll;
	String name;
	int marks;

	public Stream3b(int roll, String name, int marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public String toString()
	{
		return roll + "-" + name + "-" + marks;
	}

}