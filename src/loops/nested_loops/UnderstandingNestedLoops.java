package loops.nested_loops;

public class UnderstandingNestedLoops {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) { // outer loop
            System.out.println(i);
            for(int j = 1; j <= 5; j++){ // inner loop
                System.out.println("\t" + j);
            }
        }
    }
}
