package string_methods;

public class _07_indexOf_lastIndexOf_Methods {
    public static void main(String[] args) {
        /*
        -return
        -returns int which matching index
        -non-static
        -It takes a char or String - there are overloaded methods
         */

        String company = "TechGlobal School";

        int firstIndexOfO = company.indexOf('o'); // 6
        int lastIndexOfO = company.lastIndexOf('o'); // 15

        System.out.println(firstIndexOfO);
        System.out.println(lastIndexOfO);

        //Find the first and last indexes of l -> Expected 5 and 16
        System.out.println(company.indexOf('l')); // 5
        System.out.println(company.lastIndexOf('l')); // 16


        System.out.println(company.indexOf('X')); // -1


        System.out.println(company.indexOf("School")); // 11
    }
}
