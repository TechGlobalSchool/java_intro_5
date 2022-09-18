package conditional_statements.nested_if_else_statements;

public class Exercise1_GoldNumber {
    public static void main(String[] args) {
        /*
        Write a program that generates a random number bt -50 and 50
        if number is positive, then we will win 10 points
        if number is more than 25, then we will win extra 10 points
        if number is -7, then we will win extra 10 points
        lastly, if number is 7 (GOLD NUMBER), then will win extra 100 points

        7   -> 100 + 10 -> 110 points
        10  -> 10 points
        43  -> 20 points
        -7  -> 10 points

        Math.random() -> 0.0 (included) to 1.0 (not included)
        (int)(Math.random() * 101) -> 0 to 100 both included
        */

        int randomNumber = (int)(Math.random() * 101) - 50;

        int points = 0;

        if(randomNumber > 0){
            points += 10;
            if(randomNumber > 25){
                points += 10;
            }else if(randomNumber == 7){
                points += 100;
            }
        }
        else{
            if(randomNumber == -7){
                points += 10;
            }
        }

        System.out.println("The random number is = " + randomNumber);
        System.out.println("The points we got is = " + points);
    }
}
