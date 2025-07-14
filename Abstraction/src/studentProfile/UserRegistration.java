package studentProfile;
import java.util.Scanner;
import studentProfile.InvalidCountryException;

public class UserRegistration {
    void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException("User Outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserRegistration ur = new UserRegistration();

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Country: ");
        String country = sc.nextLine();

        try {
            ur.registerUser(username, country);
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }

    }
}

	