package escape_sequences;

public class Concatenation {
    public static void main(String[] args) {
        System.out.println("Hello World"); //Hello World
        System.out.println("Hello " + "World"); //Hello World
        System.out.println("Hello" + " World"); //Hello World
        System.out.println("Hello" + " " + "World"); //Hello World

        System.out.println(); //This is going to add one empty line to the console

        System.out.println("Today" + " " + "is" + " " + "Sunday");
    }
}
