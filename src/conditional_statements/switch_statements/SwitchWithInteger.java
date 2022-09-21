package conditional_statements.switch_statements;

public class SwitchWithInteger {
    public static void main(String[] args) {
        /*
        DRESS CODE
        1. Monday  -> Blue
        2. Tuesday  -> Red
        3. Wednesday  -> Green
        4. Thursday  -> Yellow
        5. Friday  -> Orange
        6. 7. Weekend -> Free
         */

        int day = 2; // Could only be 1 to 7

        System.out.println("\n-------ladder if-else way-------\n");
        if(day == 1) System.out.println("Monday and Blue");
        else if(day == 2) System.out.println("Tuesday and Red");
        else if(day == 3) System.out.println("Wednesday and Green");
        else if(day == 4) System.out.println("Thursday and Yellow");
        else if(day == 5) System.out.println("Friday and Orange");
        else if(day == 6 || day == 7) System.out.println("Weekend and Free");
        else System.out.println("THIS IS NOT A VALID ENTRY");


        System.out.println("\n-------switch way-------\n");
        switch (day){
            case 1:
                System.out.println("Monday and Blue");
                break;
            case 2:
                System.out.println("Tuesday and Red");
                break;
            case 3:
                System.out.println("Wednesday and Green");
                break;
            case 4:
                System.out.println("Thursday and Yellow");
                break;
            case 5:
                System.out.println("Friday and Orange");
                break;
            case 6:
            case 7:
                System.out.println("Weekend and Free");
                break;
            default:
                System.out.println("THIS IS NOT A VALID ENTRY");
        }


    }
}
