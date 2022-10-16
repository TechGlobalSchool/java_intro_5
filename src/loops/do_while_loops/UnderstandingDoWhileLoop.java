package loops.do_while_loops;

public class UnderstandingDoWhileLoop {
    public static void main(String[] args) {

        System.out.println("\n-------do-while loop-------\n");
        int i = 0;

        do{
            System.out.println(i); // 0
            i++;
        }
        while (i < 5);


        System.out.println("\n-------while loop-------\n");
        int j = 0;

        while(j < 5){ // false
            System.out.println(j);
            j++;
        }

        System.out.println("end of the program");
    }
}
