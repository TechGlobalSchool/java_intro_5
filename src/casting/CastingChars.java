package casting;

public class CastingChars {
    public static void main(String[] args) {
        int i1 =  65;

        System.out.println(i1); // 65

        char c1 = (char)i1;

        System.out.println(c1); // A

        System.out.println(51); // 51
        System.out.println((char) 51); // 3

        System.out.println((char) 123); // {

        System.out.println((char) 32);

        System.out.println((char) 1020);


        char char1 = 'A';
        char char2 = 97; // 'a'

        System.out.println(char1 + char2); // 65 + 97 -> 162
        System.out.println("" + char1 + char2); // Aa
        System.out.println("" + (char1 + char2)); // 162
        System.out.println(char1 + char2 + ""); // 162
        System.out.println(char1 + "" + char2); // Aa


        char c = 'A';
        int i = c;
        System.out.println(i);

        int n = 97;
        char cc = (char)n;

        System.out.println(cc); // a
    }
}
