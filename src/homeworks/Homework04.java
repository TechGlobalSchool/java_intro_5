package homeworks;

import utilities.ScannerHelper;

public class Homework04 {
    public static void main(String[] args) {
        String name = ScannerHelper.getAName();
        System.out.println("=====Task1=====\n");

        System.out.println("The length of the name is = " + name.length());
        System.out.println("The first character in the name is = " + name.charAt(0));
        System.out.println("The last character in the name is = " + name.charAt(name.length() - 1));
        System.out.println("The first 3 characters in the name are = " + name.substring(0 ,3));
        System.out.println("The last 3 characters in the name are = " + name.substring(name.length()-3));

        if(name.toLowerCase().startsWith("a")) System.out.println("You are in the club!");
        else System.out.println("Sorry, you are not in the club");

        System.out.println("\n=====Task2=====\n");

        String address = ScannerHelper.getAnAddress();


        if(address.toLowerCase().contains("chicago")) System.out.println("You are in the club");
        else if(address.toLowerCase().contains("des plaines")) System.out.println("You are welcome to join to the club");
        else System.out.println("Sorry, you will never be in the club");

        System.out.println("\n=====Task3=====\n");

        String favColors = ScannerHelper.getFavColors();

        if(favColors.toLowerCase().contains("red") && favColors.toLowerCase().contains("green"))
            System.out.println("Green and red are in the list");
        else if(favColors.toLowerCase().contains("red")) System.out.println("Red is in the list");
        else if(favColors.toLowerCase().contains("green")) System.out.println("Green is in the list");
        else System.out.println("Green and red are not on the list");

        System.out.println("\n=====Task4=====\n");
        String str = "  Java is FUN   ";
        str = str.toLowerCase().trim();

        //java is fun

        String word1 = str.substring(0, str.indexOf(" ")); //hello
        String word2 = str.substring(str.indexOf(" ") + 1, str.lastIndexOf(" ")); //everyone
        String word3 = str.substring(str.lastIndexOf(" ") + 1);//here

        System.out.println("The first word in the str is = " + word1);
        System.out.println("The second word in the str is = " + word2);
        System.out.println("The third word in the str is = " + word3);


    }
}
