package abstraction3;

import java.util.Scanner;

public class Utility {
    private Scanner scanner;

    public Utility() {
        this.scanner = new Scanner(System.in);
    }

    public String checkForName(String animalType) {
        System.out.println("Do you have a name for " + animalType + "? (Y/N)");
        String input = scanner.nextLine().trim();
        if ("Y".equalsIgnoreCase(input)) {
            System.out.println("Enter the name for " + animalType + ":");
            return scanner.nextLine().trim();
        }
        return null;
    }

    public Lion getLionObject(String lionName) {
        return (lionName != null) ? new Lion(lionName) : new Lion();
    }

    public Giraffe getGiraffeObject(String giraffeName) {
        return (giraffeName != null) ? new Giraffe(giraffeName) : new Giraffe();
    }

    public Bear getBearObject(String bearName) {
        return (bearName != null) ? new Bear(bearName) : new Bear();
    }

    public boolean promptToExit() {
        System.out.println("Would you like to exit? (Y/N)");
        String input = scanner.nextLine().trim();
        return "Y".equalsIgnoreCase(input);
    }
}
