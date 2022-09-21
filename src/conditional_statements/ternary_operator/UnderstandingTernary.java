package conditional_statements.ternary_operator;

public class UnderstandingTernary {
    public static void main(String[] args) {
        /*
        F   -> for female   -> Jane
        M   -> for male     -> John
         */

        char gender = 'M';

        String name = gender == 'F' || gender == 'f' ? "Jane" : "John";

        System.out.println(name);

    }
}
