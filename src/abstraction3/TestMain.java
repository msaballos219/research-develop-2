package abstraction3;

public class TestMain {

    public static void main(String[] args) {
        Utility utility = new Utility();
        boolean exit = false;

        while (!exit) {
            System.out.println("ANIMAL'S PROPERTIES");

            String lionName = utility.checkForName("Lion");
            Lion lion = utility.getLionObject(lionName);
            lion.displayAll();
            System.out.println("------------\n");

            String giraffeName = utility.checkForName("Giraffe");
            Giraffe giraffe = utility.getGiraffeObject(giraffeName);
            giraffe.displayAll();
            System.out.println("------------\n");

            String bearName = utility.checkForName("Bear");
            Bear bear = utility.getBearObject(bearName);
            bear.displayAll();
            System.out.println("=========================\n");

            // After checking for all animals, prompts the user to exit or continue
            exit = utility.promptToExit();
            if (!exit) {
                System.out.println("Let's go through the animals again.\n");
            }
        }
        
        System.out.println("Exiting the program. Goodbye!");
    }
}
