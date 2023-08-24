/**
 * Defines a dog and extends the RescueAnimal class.
 */
public class Dog extends RescueAnimal {

    // Instance variable

    private String breed;

    // Constructors

    /**
     * Default constructor for a dog that doesn't take in any values.
     */
    public Dog() {
        setName("");
        setBreed("");
        setGender("");
        setAge("");
        setWeight("");
        setAcquisitionDate("");
        setAcquisitionLocation("");
        setTrainingStatus("intake");
        setReserved(false);
        setInServiceCountry("");
    }

    /**
     * Constructor that takes in all the values for a dog.
     *
     * @param name               A string representing the dog's name.
     * @param breed              A string representing the dog breed.
     * @param gender             A string representing the dog's gender.
     * @param age                A string representing the dog's age.
     * @param weight             A string representing the dog's weight.
     * @param acquisitionDate    A string representing the dog's acquisition date.
     * @param acquisitionCountry A string representing the dog's acquisition country.
     * @param trainingStatus     A string representing the dog's current training status.
     * @param reserved           A boolean value representing the dog's reserved status.
     * @param inServiceCountry   A string representing the dog the animal is in service at.
     */
    public Dog(String name, String breed, String gender, String age,
               String weight, String acquisitionDate, String acquisitionCountry,
               String trainingStatus, boolean reserved, String inServiceCountry) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
    }

    // Accessor & Mutator Methods

    /**
     * Gets the dog's breed.
     *
     * @return A string of the dog's breed.
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Sets the dog's breed.
     *
     * @param dogBreed A string representing the dog's breed.
     */
    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }

    /**
     * Override of the toString() method to customize the output.
     *
     * @return A string containing information about a dog.
     */
    @Override
    public String toString() {
        // Returns the rescue animal string and the dog specific info.
        return super.toString() + String.format(" | Breed: %-20s", this.getBreed());
    }

}
