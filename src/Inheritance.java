import java.util.ArrayList;

public class Inheritance {

    /*

    In Java, inheritance allows us to create classes that inherit all the methods and variables from another class.



    Create a class called Vehicle with fields to represent the following data:

        vehicle make
        vehicle model
        integer to show top speed
        Give this class a constructor and getters/setters.



    Create a Car class that inherits from Vehicle. Give the Car class the following fields:

    numberOfDoors
    numberOfWheels
    a boolean for isAutomatic
    Create a constructor that uses the super class. Also add getters/setters.



    Create a Boat class that inherits from Vehicle. Give Boat the following fields:

    boolean for hasSonarGPS
    integer to represent number of motors.


    Create two Car objects and two Boat objects.

     */
    public static void main(String[] args) {
        Car sudan = new Car("Honda" , "Insight", 48, 2, 4, true);
        Car suv = new Car("Toyota", "RAV4", 43, 4, 4, true);

        System.out.println(sudan.getNumberOfDoors());
        System.out.println(suv.isAutomatic());

        Boat fishing = new Boat("Guide", "V-16", 3);
        Boat touring = new Boat("Yacht", "Tahoe", 6);

        System.out.println(fishing.isHasSonarGPS());



        
    }
}
