package homeworks;

import java.util.Arrays;

public class Homework06 {
    public static void main(String[] args) {
        System.out.println("\n==========TASK05==========\n");

        String[] cartoonDogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky" };

        boolean containsPluto = false;

        for (String cartoonDog : cartoonDogs) {
            if (cartoonDog.equals("Pluto")) {
                containsPluto = true;
                break;
            }
        }
        System.out.println(Arrays.toString(cartoonDogs));
        System.out.println(containsPluto);

        System.out.println("\n==========TASK06==========\n");

        String[] cartoonCats = {"Garfield", "Tom", "Sylvester", "Azrael"};

        Arrays.sort(cartoonCats);
        System.out.println(Arrays.toString(cartoonCats));
        System.out.println(Arrays.binarySearch(cartoonCats,"Garfield") >= 0 &&
                Arrays.binarySearch(cartoonCats,"Felix") >= 0);

        /*
        boolean containsGarfield = false;
        boolean containsFelix = false;
        boolean containsBoth = false;
        for (String cartoonCat : cartoonCats) {


            if(cartoonCat.equals("Garfield")) containsGarfield = true;
            else if(cartoonCat.equals("Felix")) containsFelix = true;

            if(containsGarfield && containsFelix)  {
                containsBoth = true;
                break;
            }



        }
        System.out.println(Arrays.toString(cartoonCats));
        System.out.println(containsBoth);

         */





        System.out.println("\n==========TASK07==========\n");
        double[] doubleArr = {10.5, 20.75, 70, 80, 15.75, 15, 12};

        System.out.println(Arrays.toString(doubleArr));
        for (double v : doubleArr) {
            if(v % (int)v == 0) System.out.println((int)v);
            else System.out.println(v);
        }
        System.out.println("\n==========TASK08==========\n");

        char[] charArr = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4', ' '};
        int uLetters = 0;
        int lLetters = 0;
        int digits = 0;
        int special = 0;

        for (char c : charArr) {
            if(Character.isUpperCase(c)) uLetters++;
            else if(Character.isLowerCase(c)) lLetters++;
            else if(Character.isDigit(c)) digits++;
            else if(c != ' ') special++;
        }

        System.out.println("Letter = " + (uLetters + lLetters));
        System.out.println("Uppercase letters = " + uLetters);
        System.out.println("lowercase letters = " + lLetters);
        System.out.println("digits = " + digits);
        System.out.println("Special characters = " + special);
        System.out.println("\n==========TASK09==========\n");

        String[] strArr = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        int startsWithUpper = 0;
        int startsWithLower = 0;
        int startsWithBOrP = 0;
        int containsBookOrPen = 0;

        for (String s : strArr) {
            if (Character.isUpperCase(s.charAt(0))) startsWithUpper++;
            else startsWithLower++;

            if(s.toLowerCase().charAt(0) == 'b' || s.toLowerCase().charAt(0) == 'p') startsWithBOrP++;

            if(s.toLowerCase().contains("book") || s.toLowerCase().contains("pen")) containsBookOrPen++;
        }
        System.out.println(Arrays.toString(strArr));
        System.out.println("Elements starts with uppercase = " + startsWithUpper +
                "\nElements starts with lowercase = " + startsWithLower +
                "\nElements starting with B or P = " + startsWithBOrP +
                "\nElements having ”book” or “pen”= " + containsBookOrPen);
        System.out.println("\n==========TASK10==========\n");

        int[] numArr = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        int moreThanTen = 0;
        int lessThanTen = 0;
        int isTen = 0;

        for (int elements : numArr) {
            if(elements > 10) moreThanTen++;
            else if(elements < 10) lessThanTen++;
            else isTen++;
        }

        System.out.println(Arrays.toString(numArr));
        System.out.println("Elements that are more than 10 = " + moreThanTen);
        System.out.println("Elements that are less than 10 = " + lessThanTen);
        System.out.println("Elements that are 10 = " + isTen);

        System.out.println("\n==========TASK11==========\n");
        int[] firstArr = {5, 8, 13, 1, 2};
        int[] secArr = {9, 3, 67, 1, 0};
        int[] thirdArr = new int[5];

        for (int i = 0; i < thirdArr.length; i++) {
            thirdArr[i] = Math.max(firstArr[i],secArr[i]);
        }
        System.out.println("1st array is = " + Arrays.toString(firstArr));
        System.out.println("2nd array is = " + Arrays.toString(secArr));
        System.out.println("3rd array is = " + Arrays.toString(thirdArr));

    }
}
