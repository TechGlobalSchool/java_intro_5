package practice.loopsPractice;

import utilities.RandomNumberGenerator;

public class WhileLoopsPractice {
    public static void main(String[] args) {

        int random = RandomNumberGenerator.getARandomNumber(1, 20);

        while (true){

            random = RandomNumberGenerator.getARandomNumber(1, 20);
            if (random == 7) {
                break;
            }
            System.out.println("Random number = " + random);

        }

        System.out.println("Congrats you hit the number: " + random);
    }
}
