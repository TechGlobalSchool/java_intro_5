package practice.methods;

public class VoidMethodPractices {
    public static void main(String[] args) {
//        VoidMethodPractices.flavorPicker("chocolate");
//        VoidMethodPractices.flavorPicker("Chocolate");
//        VoidMethodPractices.flavorPicker("strawberry");
//
//        VoidMethodPractices.checkAge(19);
//        VoidMethodPractices.checkAge(20);
//        VoidMethodPractices.checkAge(25);
//        VoidMethodPractices.checkAge(-25);

        VoidMethodPractices.checkCreditScore(99.34);
        VoidMethodPractices.checkCreditScore(1099.34);
        VoidMethodPractices.checkCreditScore(2099.34);
        VoidMethodPractices.checkCreditScore(5099.34);
        VoidMethodPractices.checkCreditScore(-5099.34);
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

    /*
    Create a public static method named as "checkAge", it is going to take an age as parameter
    then prints according to following:
    -> 0 - 19 -> You are a teenager
    -> 20 - 21 -> You can drive
    -> more than 21 -> You can drink coke
     */

    public static void checkAge(int age){
        if (age >= 0 && age <= 19){
            System.out.println("You are a teenager");
        }else if (age == 20 || age == 21) {// age >= 20 && age <= 21
            System.out.println("You can drive");
        } else if (age > 21){
            System.out.println("You can drink coke");
        }else {
            System.out.println("Give me a valid age!");
        }
    }

    /*
    Create a public static method named as "checkCreditScore", it is going to take a balance as parameter
    then it will print according to following:

    balance:
    0.00 - 999.99 -> Low credit score
    1000.00 - 1999.99 -> Medium credit score
    2000.00 - 2999.99 -> Good credit score
    else -> No valid credit score!
     */

    public static void checkCreditScore(double balance){
        if (balance >= 0.00 && balance < 1000.00){
            System.out.println("Low credit score");
        } else if (balance >= 1000.00 && balance < 2000.00){
            System.out.println("Medium credit score");
        } else if (balance >= 2000.00 && balance < 3000.00){
            System.out.println("Good credit score");
        } else {
            System.out.println("No valid credit score!");
        }
    }
}
