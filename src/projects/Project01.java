package projects;

import java.util.Scanner;

public class Project01 {
    public static void main (String[] args) {
        /*
        TASK-1
        -Store your name in a String variable called name
        -Print the variable with a proper message
        -EX/ My name is = name
        NOTE: Uppercases, lowercases and spaces are important
         */
        String name = "Jonathan Ochoa";

        System.out.println("***** Task 1 *****");
        System.out.println("My name is = " + name);

        /*
        Task 2
        -Create different char variables for each of your name letter and store them in separate variables as nameCharacter1, nameCharacter2 and so on.
        -Print variables with proper messages
        -EX/Name letter 1 is = nameCharacter1
        Name letter 2 is = nameCharacter2
         */

        char nameCharacter1 = 'J';
        char nameCharacter2 = 'o';
        char nameCharacter3 = 'h';
        char nameCharacter4 = 'n';

        System.out.println("\n***** Task 2 *****");
        System.out.println("Name letter 1 is = " + nameCharacter1);
        System.out.println("Name letter 2 is = " + nameCharacter2);
        System.out.println("Name letter 3 is = " + nameCharacter3);
        System.out.println("Name letter 4 is = " + nameCharacter4);

        /*
        TASK-3
        -Create different String variables to store info like myFavMovie, myFavSong, myFavCity, myFavActivity, myFavSnack.
        -Print variables with proper messages
        -EX/My favorite movie is = myFavMovie
         */

        String myFavMovie = "Interstellar";
        String myFavSong = "Turn The Page by Bob Seger";
        String myFavCity = "Chicago";
        String myFavActivity = "Gaming";
        String myFavSnack = "Popcorn";

        System.out.println("\n***** Task 3 *****");
        System.out.println("My favorite movie is = " + myFavMovie);
        System.out.println("My favorite song is = " + myFavSong);
        System.out.println("My favorite city is = " + myFavCity);
        System.out.println("My favorite activity is = " + myFavActivity);
        System.out.println("My favorite snack is = " + myFavSnack);

        /*
        TASK-4
        -Create different int variables to store info like myFavNumber, numberOfStatesIVisited, numberOfCountriesIVisited.
        -Print variables with proper messages
        -EX/My favorite number is = myFavNumber
         */

        int myFavNumber = 1337;
        int numberOfStatesIVisited = 9;
        int numberOfCountriesIVisited = 2;

        System.out.println("\n***** Task 4 *****");
        System.out.println("My favorite number is = " + myFavNumber);
        System.out.println("The number of states I've visited is = " + numberOfStatesIVisited);
        System.out.println("The number of countries I've visited is = " + numberOfCountriesIVisited);

        /*
        TASK-5
        -Create a boolean called amIAtSchoolToday
        -Assign true to this variable if you are at campus today
        -Assign false to this variable if you are joining online today
        -Print variable value with a proper message using println() method
        EX/ I am at school today = amIAtSchoolToday
         */

        boolean amIAtSchoolToday = true;

        System.out.println("\n***** Task 5 *****");
        System.out.println("I am at school today = " + amIAtSchoolToday);

        /*
        TASK-6
        -Create a boolean called isWeatherNiceToday
        -Assign true to this variable if it is above 60F today
        -Assign false to this variable if it is below or equal to 60F today
        -Print variable value with a proper message using println() method
        -EX/ Weather is nice today = isWeatherNiceToday
         */

        boolean isWeatherNiceToday = true;

        System.out.println("\n***** Task 6 *****");
        System.out.println("Is weather is nice today? = " + isWeatherNiceToday);

        // Bonus
        System.out.println("\n***** BONUS *****");

        Scanner input = new Scanner(System.in);

        System.out.println("Do you like Interstellar?");

        // Input: Yes I like it (\n)
        String ans1 = input.nextLine();

        System.out.println("Answer to first question = " + ans1);

        System.out.println("How many times have you seen it?");
        int ans2 = input.nextInt();

        System.out.println("Answer to second question = " + ans2);

        System.out.println("For real??");

        String ans3 = input.nextLine();

        input.nextLine(); // Providing an extra line for Scanner to eliminate issues

        System.out.println("Answer to third question = " + ans3);
    }
}
