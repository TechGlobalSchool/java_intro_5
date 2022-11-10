package regex;

import utilities.ScannerHelper;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClass {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("SDET");
        Matcher matcher = pattern.matcher("TechGlobal provides students a complete educational program to be a competitive SDET in the professional IT field. With the course, students learn all the fundamental technologies needed to become an SDET professional and how important testing is in the Software Development Life Cycle (SDLC)… Learn more about the technologies that TechGlobal provides to its participants below and feel free to reach out to us with any questions.");

        System.out.println(matcher.matches());
        int counter = 0;


        while(matcher.find()){
            counter++;
            System.out.println(matcher.group());
            System.out.println(matcher.start());
            System.out.println(matcher.end());
        }
        System.out.println(counter);


        System.out.println("==========task1==========");
        Scanner scanner = new Scanner(System.in);
        pattern = Pattern.compile("[A-Za-z]{1,}");

        System.out.println("Please print out a sentence: ");
        String sentence = scanner.nextLine();

        matcher = pattern.matcher(sentence);
        int wordCount = 0;

        while(matcher.find()){
            System.out.println(matcher.group());
            wordCount++;
        }
        System.out.println("This sentence contains "+ wordCount +" words");


        pattern = Pattern.compile("[a-zA-Z0-9-_]{9,15}");
        String str = ScannerHelper.getAString();

        System.out.println(Pattern.matches(pattern.toString(), str));


















        








    }

}
