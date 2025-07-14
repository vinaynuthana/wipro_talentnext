package Compartment;
abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    public String notice() {
        return "This is First Class Compartment."; 
    }
}

class Ladies extends Compartment {
    public String notice() {
        return "This is Ladies Compartment.";
    }
}

class General extends Compartment {
    public String notice() {
        return "This is General Compartment.";
    }
}

class Luggage extends Compartment {
    public String notice() {
        return "This is Luggage Compartment.";
    }
}

public class Ab1 {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];

        for (int i = 0; i < compartments.length; i++) {
            int random = 1 + (int)(Math.random() * 4);

            if (random == 1) {
                compartments[i] = new FirstClass();
            } else if (random == 2) {
                compartments[i] = new Ladies();
            } else if (random == 3) {
                compartments[i] = new General();
            } else {
                compartments[i] = new Luggage();
            }
        }

        for (int i = 0; i < compartments.length; i++) {
            System.out.println(compartments[i].notice());
        }
    }
}
