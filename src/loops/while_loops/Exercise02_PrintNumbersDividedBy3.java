package loops.while_loops;

public class Exercise02_PrintNumbersDividedBy3 {
    public static void main(String[] args) {
        //Print numbers divided by 3 bt 1 and 100 -> 3 - 6 - 9....99

        int i = 1;

        while(i <= 100){
            if(i % 3 == 0) System.out.println(i);
            i++;
        }

        System.out.println("End of the program");
    }
}
