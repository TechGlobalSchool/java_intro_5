package conditional_statements.if_else_statements;

public class IfElseSyntax {
    public static void main(String[] args) {
        /*
        - if or else statements are used to control the flow of the program based on conditions
        - conditions are always boolean statements (true or false)
        - if block can be used without else block
        - else block CAN NEVER be used without if
         */

        boolean condition = false;

        if(condition){
            //This is the if block, and it executes if the condition is true
            System.out.println("AAA");
        }
        else{
            //This is the else block, and it executes if the condition is false
            System.out.println("BBB");
        }


        System.out.println("End of the program!");
    }
}
