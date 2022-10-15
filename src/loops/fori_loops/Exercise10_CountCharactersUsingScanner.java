package loops.fori_loops;

import utilities.ScannerHelper;

public class Exercise10_CountCharactersUsingScanner {
    public static void main(String[] args) {
        /*
        Ask user to enter a name and count how many l letter exists in the name

        Lionel -> 2
        Leo    -> 1
        lucy   -> 1
         */

        String name = ScannerHelper.getAName();

        int countL = 0; //

        for (int i = 0; i < name.length(); i++) {
            if(name.toLowerCase().charAt(i) == 'l') countL++;
        }

        System.out.println(countL);
    }
}
