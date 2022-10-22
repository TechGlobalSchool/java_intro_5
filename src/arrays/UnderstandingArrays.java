package arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {
        String name = "James"; // that holds a single name

        String[] names = {"Beyza", "Andrii", "Vlad", "Samir", "Olena"}; // holding a collection of names


        //Retrieving an element from an array - using index
        System.out.println(names[2]); // Vlad
        System.out.println(names[4]); // Olena

        //ArrayIndexOutOfBoundsException 0-4
        //System.out.println(names[5]);
        //System.out.println(names[-1]);

        int age = 25;

        int[] ages = {21, 23, 25};
        System.out.println(ages[2]); // 25


    }
}
