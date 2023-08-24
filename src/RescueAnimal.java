import java.lang.String;

/**
 * Defines a Rescue Animal.
 */
public class RescueAnimal {

    // Instance variables

    private String name;
    private String animalType;
    private String gender;
    private String age;
    private String weight;
    private String acquisitionDate;
    private String acquisitionCountry;
    private String trainingStatus;
    private boolean reserved;
    private String inServiceCountry;

    // Constructor

    /**
     * Default constructor creates an empty rescue animal instance.
     */
    public RescueAnimal() {
    }

    // Accessor & Mutator Methods

    /**
     * Gets the animal's name.
     *
     * @return A string of the animal's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the animal's name.
     *
     * @param name A string representing the animals name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the animal type.
     *
     * @return A string of the animal type.
     */
    public String getAnimalType() {
        return animalType;
    }

    /**
     * Sets the animal type.
     *
     * @param animalType A string representing the animal type.
     */
    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    /**
     * Gets the animal's gender.
     *
     * @return A string of the animal's gender.
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the animal's gender.
     *
     * @param gender A string representing the animal's gender.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets the animal's age.
     *
     * @return A string of the animal's age.
     */
    public String getAge() {
        return age;
    }

    /**
     * Sets the animal's age.
     *
     * @param age A string representing the animals age.
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * Gets the animal's weight.
     *
     * @return A string of the animals' weight.
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Sets the animal's weight.
     *
     * @param weight A string representing the animals weight.
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * Gets the animal's acquisition date.
     *
     * @return A string of the animal's acquisition date.
     */
    public String getAcquisitionDate() {
        return acquisitionDate;
    }

    /**
     * Sets the animal's acquisition date.
     *
     * @param acquisitionDate A string representing the animal's acquisition date.
     */
    public void setAcquisitionDate(String acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    /**
     * Gets the animal's acquisition country.
     *
     * @return A string of the animal's acquisition country.
     */
    public String getAcquisitionLocation() {
        return acquisitionCountry;
    }

    /**
     * Sets the animal's acquisition country.
     *
     * @param acquisitionCountry A string representing the animal's acquisition country.
     */
    public void setAcquisitionLocation(String acquisitionCountry) {
        this.acquisitionCountry = acquisitionCountry;
    }

    /**
     * Gets the current phase of the animal's training.
     *
     * @return A string of the animal's training phase.
     */
    public String getTrainingStatus() {
        return trainingStatus;
    }

    /**
     * Sets the animal's training status.
     *
     * @param trainingStatus A string representing the animal's current training phase.
     */
    public void setTrainingStatus(String trainingStatus) {
        this.trainingStatus = trainingStatus;
    }

    /**
     * Gets the animal's reservation status.
     *
     * @return A boolean value of the animal's reservation status (true = reserved, false = available).
     */
    public boolean getReserved() {
        return reserved;
    }

    /**
     * Sets the animal's reserved status.
     *
     * @param reserved A boolean representing the reserved status of an animal.
     */
    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    /**
     * Gets the country the animal is in service at.
     *
     * @return A string of the animal's service country.
     */
    public String getInServiceLocation() {
        return inServiceCountry;
    }

    /**
     * Sets the animal's service country.
     *
     * @param inServiceCountry A string representing the country an animal is in service at.
     */
    public void setInServiceCountry(String inServiceCountry) {
        this.inServiceCountry = inServiceCountry;
    }

    /**
     * Override of the toString() method to customize the output.
     *
     * @return A string containing information about the rescue animal.
     */
    @Override
    public String toString() {
        // Converts the boolean reserved field to easier to understand string values (true = Reserved, false = Available).
        String reservedStatus = this.getReserved() ? "Reserved" : "Available";
        // Returns animal name, status, acquisition country and if the animal is reserved
        return String.format("Name: %-10s | Status: %-12s | Acquisition Country: %-18s | Reserved: %-12s", this.getName(), this.getTrainingStatus(), this.getAcquisitionLocation(), reservedStatus);
    }

}
