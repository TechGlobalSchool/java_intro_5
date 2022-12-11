package singleton;

public class Driver {

    //Achieve singleton design pattern for the Driver object

    private static Driver driver; // declaration

    private Driver(){}

    public static Driver getDriver(){
        if(driver == null){
            driver = new Driver();
        }
        return driver;
    }

}
