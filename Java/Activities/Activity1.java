package FST_JAVA_Activity;


public class Activity1 {

    public static void main(String[] args) {
    	ActivityCar toyota = new ActivityCar();
        toyota.make = 2014;
        toyota.color = "Black";
        toyota.transmission = "Manual";
    
        //Using Car class method
        toyota.displayCharacterstics();
        toyota.accelerate();
        toyota.brake();
    }

}