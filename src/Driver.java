import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This application will keep track of rescue animals and their availability.
 *
 * @author Eric Slutz
 */
public class Driver {

    // Declaring a list for dogs.
    private static final ArrayList<Dog> dogList = new ArrayList<>();
    // Declaring a list for monkeys.
    private static final ArrayList<Monkey> monkeyList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userMenuInput;

        initializeDogList();
        initializeMonkeyList();

        // Do While loop to display the option menu and get the user input.
        do {
            // Displays the menu.
            displayMenu();
            // Gets user menu option input.
            userMenuInput = scnr.nextLine();
            // Switch statement to take action based on user input.
            switch (userMenuInput) {
                // 1 - Intake a new dog
                case "1" -> intakeNewDog(scnr);
                // 2 - Intake a new monkey
                case "2" -> intakeNewMonkey(scnr);
                // 3 - Reserve a new animal
                case "3" -> reserveAnimal(scnr);
                // 4 - Print a list of all dogs.
                // 5 - Print a list of all monkeys.
                // 6 - Print a list of all animals that are in service and available.
                // Pass in user input to print the correct option.
                case "4", "5", "6" -> printAnimals(userMenuInput);
                // Any other entry.
                default -> {
                    // Checks invalid menu option selected.
                    if (!userMenuInput.equalsIgnoreCase("q")) {
                        System.out.println("\n\nInvalid menu option. Try again.\n\n");
                    }
                }
            }
            // Loops until the user selects 'q` to quit.
        } while (!userMenuInput.equalsIgnoreCase("q"));
    }

    /**
     * Prints the menu options.
     */
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

    /**
     * Add dogs to a list for testing.
     */
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "Intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "In Service", false, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    /**
     * Add monkeys to a list for testing.
     */
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Spike", "Capuchin", "male", "1", "25.6", "15", "6", "19", "05-12-2019", "United States", "Intake", false, "United States");
        Monkey monkey2 = new Monkey("Pam", "Macaque", "female", "1", "25.6", "15", "6", "19", "05-12-2019", "Canada", "In Service", false, "Canada");
        Monkey monkey3 = new Monkey("Harry", "Capuchin", "male", "1", "25.6", "15", "6", "19", "05-12-2019", "United States", "Intake", false, "United States");

        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
    }

    /**
     * Validates if the dog is not already in the list.
     * Otherwise, add a new dog to the list.
     *
     * @param scanner A scanner to read in user input.
     */
    public static void intakeNewDog(Scanner scanner) {
        // Prompts for and gets the dogs name.
        System.out.println("\n\nWhat is the dog's name?");
        String name = scanner.nextLine();

        // Loops through each dog in list to see if the entered name matches any dog in the list.
        for (Dog dog : dogList) {
            if (dog.getName().equalsIgnoreCase(name)) {
                // Name is not valid so go back to menu.
                System.out.println("\n\nThis dog is already in our system\n\n");
                return;
            }
        }

        // Dog name is valid, so get the rest of the needed information.
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();
        System.out.println("What is the dog's acquisition date?");
        String acquisitionDate = scanner.nextLine();
        System.out.println("What is the dog's acquisition country?");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("What is the dog's training status?");
        String trainingStatus = scanner.nextLine();
        System.out.println("What is the dog's service country?");
        String inServiceCountry = scanner.nextLine();

        // Initialize a new Dog object with the user input.
        Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, false, inServiceCountry);
        // Add new dog to the list of dogs.
        dogList.add(newDog);
    }

    /**
     * Validates if the monkey is not already in the list.
     * Validates the monkey species is valid.
     * Otherwise, add a new monkey to the list.
     *
     * @param scanner A scanner to read in user input.
     */
    public static void intakeNewMonkey(Scanner scanner) {
        // List of valid monkey species to validate user input against.
        ArrayList<String> allowedMonkeySpecies = new ArrayList<>(List.of("capuchin", "guenon", "macaque", "marmoset", "squirrel monkey", "tamarin"));

        // Prompts for and gets the monkeys name.
        System.out.println("\n\nWhat is the monkey's name?");
        String name = scanner.nextLine();

        // Loops through each monkey in list to see if the entered name matches any monkey in the list.
        for (Monkey monkey : monkeyList) {
            if (monkey.getName().equalsIgnoreCase(name)) {
                // Name is not valid so go back to menu.
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return;
            }
        }

        // Monkey name is valid, so get the species information.
        // Prompts for and gets the monkey's species.
        System.out.println("What is the monkey's species?");
        String species = scanner.nextLine();

        // Checks if users input matches one of the valid monkey species.
        if (!allowedMonkeySpecies.contains(species.toLowerCase())) {
            // Species is not valid so go back to menu.
            System.out.println("\n\nThis monkey species is not a valid option\n\n");
            return;
        }

        // Monkey name and species are valid, so get the rest of the needed information.
        System.out.println("What is the monkey's gender?");
        String gender = scanner.nextLine();
        System.out.println("What is the monkey's age?");
        String age = scanner.nextLine();
        System.out.println("What is the monkey's weight?");
        String weight = scanner.nextLine();
        System.out.println("What is the monkey's height?");
        String height = scanner.nextLine();
        System.out.println("What is the monkey's tail length?");
        String tailLength = scanner.nextLine();
        System.out.println("What is the monkey's body length?");
        String bodyLength = scanner.nextLine();
        System.out.println("What is the monkey's acquisition date?");
        String acquisitionDate = scanner.nextLine();
        System.out.println("What is the monkey's acquisition country?");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("What is the monkey's training status?");
        String trainingStatus = scanner.nextLine();
        System.out.println("What is the monkey's service country?");
        String inServiceCountry = scanner.nextLine();

        // Initialize a new Monkey object with the user input.
        Monkey newMonkey = new Monkey(name, species, gender, age, weight, height, tailLength, bodyLength, acquisitionDate, acquisitionCountry, trainingStatus, false, inServiceCountry);
        // Add new monkey to the list of monkeys.
        monkeyList.add(newMonkey);
    }

    /**
     * Finds available animal by animal type and service country.
     *
     * @param scanner A scanner to read in user input.
     */
    public static void reserveAnimal(Scanner scanner) {
        // Gets desired animal type.
        System.out.println("\n\nWhat type of animal do you need?");
        String animalType = scanner.nextLine();
        // Gets desired service country.
        System.out.println("What country do you need an animal in?");
        String animalServiceCountry = scanner.nextLine();

        // Checks is desired animal type is dog.
        if (animalType.equalsIgnoreCase("dog")) {
            // Loops through list of dogs.
            for (Dog dog : dogList) {
                // Checks if dog is in the desired service country and if it is available.
                if (dog.getInServiceLocation().equalsIgnoreCase(animalServiceCountry) && dog.getTrainingStatus().equalsIgnoreCase("in service") && !dog.getReserved()) {
                    // Dog is available and in the correct service country, so set it to reserved.
                    dog.setReserved(true);
                    // Lets the user know a dog has been reserved.
                    System.out.println("\n\nDog reserved\n\n");
                    // Breaks out of method after finding the first available matching dog.
                    return;
                }
            }
            // Lets the user know no dog matching their criteria could be found.
            System.out.println("\n\nNo dog could be found matching your criteria\n\n");
        }
        // Checks is desired animal type is monkey.
        else if (animalType.equalsIgnoreCase("monkey")) {
            // Loops through list of monkeys.
            for (Monkey monkey : monkeyList) {
                // Checks if monkey is in the desired service country and if it is available.
                if (monkey.getInServiceLocation().equalsIgnoreCase(animalServiceCountry) && monkey.getTrainingStatus().equalsIgnoreCase("in service") && !monkey.getReserved()) {
                    // Monkey is available and in the correct service country, so set it to reserved.
                    monkey.setReserved(true);
                    // Lets the user know a monkey has been reserved.
                    System.out.println("\n\nMonkey reserved\n\n");
                    // Breaks out of method after finding the first available matching monkey.
                    return;
                }
            }
            // Lets the user know no monkey matching their criteria could be found.
            System.out.println("\n\nNo monkey could be found matching your criteria\n\n");
        }
        // User did not enter a valid animal type.
        else {
            // Lets the user know they didn't enter a valid animal type.
            System.out.println("\n\nThat is not a valid animal type\n\n");
        }
    }

    /**
     * Prints out the desired list of animals based on what the user selected in the menu.
     *
     * @param userMenuInput A scanner to read in user input.
     */
    public static void printAnimals(String userMenuInput) {
        // Switch statement to print a list based on user input.
        switch (userMenuInput) {
            // Print a list of all dogs.
            case "4" -> {
                System.out.println("\n\nAll dogs:");
                // Loops through each element of the dog list and prints out each one.
                dogList.forEach(System.out::println);
            }
            // Print a list of all monkeys.
            case "5" -> {
                System.out.println("\n\nAll monkeys:");
                // Loops through each element of the monkey list and prints out each one.
                monkeyList.forEach(System.out::println);
            }
            // Print a list of all animals that are not reserved and in service.
            case "6" -> {
                // Declare a list to store the available animals.
                ArrayList<RescueAnimal> availableAnimals = new ArrayList<>();
                // Loops through each element of the dog list and if they are available and in service, adds them to the available animals list.
                dogList.forEach(dog -> {
                    if (!dog.getReserved() && dog.getTrainingStatus().equalsIgnoreCase("in service")) {
                        availableAnimals.add(dog);
                    }
                });
                // Loops through each element of the monkey list and if they are available and in service, adds them to the available animals list.
                monkeyList.forEach(monkey -> {
                    if (!monkey.getReserved() && monkey.getTrainingStatus().equalsIgnoreCase("in service")) {
                        availableAnimals.add(monkey);
                    }
                });
                System.out.println("\n\nAll available animals:");
                // Loops through each element of the available animals list and prints out each animal.
                availableAnimals.forEach(System.out::println);
            }
        }
    }
}
