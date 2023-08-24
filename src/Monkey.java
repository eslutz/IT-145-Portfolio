/**
 * Defines a monkey and extends the RescueAnimal class.
 */
public class Monkey extends RescueAnimal {

    // Instance variable

    private String species;
    private String height;
    private String tailLength;
    private String bodyLength;

    // Constructors

    /**
     * Default constructor for a monkey that doesn't take in any values.
     */
    public Monkey() {
        setName("");
        setSpecies("");
        setGender("");
        setAge("");
        setWeight("");
        setHeight("");
        setTailLength("");
        setBodyLength("");
        setAcquisitionDate("");
        setAcquisitionLocation("");
        setTrainingStatus("intake");
        setReserved(false);
        setInServiceCountry("");
    }

    /**
     * Constructor that takes in all the values for a monkey.
     *
     * @param name               A string representing the monkey's name.
     * @param gender             A string representing the monkey's gender.
     * @param age                A string representing the monkey's age.
     * @param weight             A string representing the monkey's weight.
     * @param height             A string representing the monkey's height.
     * @param tailLength         A string representing the monkey's tail length.
     * @param bodyLength         A string representing the monkey's body length.
     * @param acquisitionDate    A string representing the monkey's acquisition date.
     * @param acquisitionCountry A string representing the monkey's acquisition country.
     * @param trainingStatus     A string representing the monkey's current training status.
     * @param reserved           A boolean value representing the monkey's reserved status.
     * @param inServiceCountry   A string representing the monkey the animal is in service at.
     */
    public Monkey(String name, String species, String gender, String age,
                  String weight, String height, String tailLength, String bodyLength,
                  String acquisitionDate, String acquisitionCountry,
                  String trainingStatus, boolean reserved, String inServiceCountry) {
        setName(name);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setHeight(height);
        setTailLength(tailLength);
        setBodyLength(bodyLength);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
    }

    // Accessor & Mutator Methods

    /**
     * Gets the monkey's species.
     *
     * @return A string of the monkey's species.
     */
    public String getSpecies() {
        return species;
    }

    /**
     * Sets the monkey's species.
     *
     * @param monkeySpecies A string representing the monkey's species.
     */
    public void setSpecies(String monkeySpecies) {
        species = monkeySpecies;
    }

    /**
     * Gets the monkey's height.
     *
     * @return A string of the monkey's height.
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the monkey's height.
     *
     * @param monkeyHeight A string representing the monkey's height.
     */
    public void setHeight(String monkeyHeight) {
        height = monkeyHeight;
    }

    /**
     * Gets the monkey's tail length.
     *
     * @return A string of the monkey's tail length.
     */
    public String getTailLength() {
        return tailLength;
    }

    /**
     * Sets the monkey's tail length.
     *
     * @param monkeyTailLength A string representing the monkey's tail length.
     */
    public void setTailLength(String monkeyTailLength) {
        tailLength = monkeyTailLength;
    }

    /**
     * Gets the monkey's body length.
     *
     * @return A string of the monkey's body length.
     */
    public String getBodyLength() {
        return bodyLength;
    }

    /**
     * Sets the monkey's body length.
     *
     * @param monkeyBodyLength A string representing the monkey's body length.
     */
    public void setBodyLength(String monkeyBodyLength) {
        bodyLength = monkeyBodyLength;
    }

    /**
     * Override of the toString() method to customize the output.
     *
     * @return A string containing information about a monkey.
     */
    @Override
    public String toString() {
        // Returns the rescue animal string and the dog specific info.
        return super.toString() + String.format(" | Species: %-20s | Height: %-10s | Tail Length: %-10s | Body Length %-10s", this.getSpecies(), this.getHeight(), this.getTailLength(), this.getBodyLength());
    }

}
