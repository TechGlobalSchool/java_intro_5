package primitives;

public class ObjectTypes {
    public static void main(String[] args) {
        /*
        Any data that cannot be stored with primitives should be handled using objects
        Objects = reference types = non-primitives
         */

        String name = "John";
        String lName = "Doe";
        String DOB = "Sep 4, 2022";
        String SSN = "000-00-0000";
        String phoneNumber = "(312) 123-1212";

        System.out.println("The phone number is = " + phoneNumber); //The phone number is = (312) 123-1212
    }
}
