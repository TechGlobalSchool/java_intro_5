package practice.methods;

public class VoidMethodPractices {
    public static void main(String[] args) {
        VoidMethodPractices.flavorPicker("chocolate");
        VoidMethodPractices.flavorPicker("Chocolate");
        VoidMethodPractices.flavorPicker("strawberry");
    }

    /*
    Create a public static method which will take an ice cream flavor and prints the message about your ice cream

    examples:
    chocolate -> You have a great taste
    vanilla -> Not bad
    strawberry -> Enjoy it!
    everything else -> Give me a valid flavor!
     */

    public static void flavorPicker(String flavor) {
//        if (flavor.equals("chocolate")) {
//            System.out.println("You have a great taste");
//        } else if (flavor.equals("vanilla")) {
//            System.out.println("Not bad");
//        } else if (flavor.equals("strawberry")) {
//            System.out.println("Enjoy it!");
//        } else {
//            System.out.println("Give me a valid flavor!");
//        }
        switch (flavor){
            case "chocolate":
                System.out.println("You have a great taste");
                break;
            case "vanilla":
                System.out.println("Not bad!");
                break;
            case "strawberry":
                System.out.println("Enjoy it!");
                break;
            default:
                System.out.println("Give me a valid flavor!");
                break;
        }
    }
}
