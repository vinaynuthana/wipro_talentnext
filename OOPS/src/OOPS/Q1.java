package OOPS;
class Box {
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double getVolume() {
        return width * height * depth;
    }
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box myBox = new Box(5.0, 10.0, 3.0);

        double volume = myBox.getVolume();
        System.out.println("The volume of the box is: " + volume);
	}

}
