package variables;

public class UnderstandingVariables {
    public static void main(String[] args) {

        //Variable declaration and assignment with an initial value
        int age = 45;

        System.out.println(age); // 45

        //Variable declaration - it allocates the memory
        String name;

        //Variable assignment
        name = "John";

        System.out.println(name); // John

        //Re-assigning
        name = "Mike";

        System.out.println(name); // Mike

        age = 21;

        System.out.println(age); // 21
    }
}
