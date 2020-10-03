public class Boat extends Vehicle {
    private boolean hasSonarGPS;
    private int numberOfMotors;

    public Boat(String make, String model, int speed) {
        super(make, model, speed);
        
    }

    public void Boat() {
        this.hasSonarGPS = true;
        this.numberOfMotors = 4;
    }

    public boolean isHasSonarGPS() {
        return hasSonarGPS;
    }
}







