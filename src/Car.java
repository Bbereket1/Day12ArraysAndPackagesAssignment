public class Car extends Vehicle{

    private int numberOfDoors;
    private int numberOfWheels;
    private boolean isAutomatic;

    public Car(String make, String model, int speed) {
        super(make, model, speed);
    }

    public Car(String make, String model, int speed, int numberOfDoors, int numberOfWheels, boolean isAutomatic) {
        super(make, model, speed);
        this.numberOfDoors = numberOfDoors;
        this.numberOfWheels = numberOfWheels;
        this.isAutomatic = isAutomatic;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }
}
