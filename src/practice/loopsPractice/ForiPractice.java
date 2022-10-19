package practice.loopsPractice;

public class ForiPractice {
    public static void main(String[] args) {

        System.out.println("\nHard coded print statements:\n");

        System.out.println("Congrats!!!");
        System.out.println("Congrats!!!");
        System.out.println("Congrats!!!");

        System.out.println("\nFori loop print statements v1:\n");
        // I want to print my message 3 times
        for(int i = 0; i < 3; i++){
            System.out.println("Congrats!!!");
            System.out.println("i = " + i);
        }

        System.out.println("\nFori loop print statements v2:\n");
        for(int i = 1; i <= 3; i++){
            System.out.println("Congrats!!!");
            System.out.println("i = " + i);
        }

        System.out.println("\nFori loop print statements v3:\n");
        for(int i = 3; i > 0; i--){
            System.out.println("Congrats!!!");
            System.out.println("i = " + i);
        }

        System.out.println("\nFori loop print statements v4:\n");
        for(int i = 100; i > 97; i--){ // i = 100, 99, 98
            System.out.println("Congrats!!!");
            System.out.println("i = " + i);
        }

    }
}
