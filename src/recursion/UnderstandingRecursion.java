package recursion;

public class UnderstandingRecursion {

    public static void print(){
        System.out.println("Hello");
        print();
    }

    //Create a method that prints number from 1 to given positive number - iterative way
    public static void printNumbers(int end){
        for (int i = 1; i <= end; i++) {
            System.out.println(i);
        }
    }

    //Recursive way
    public static void printNumbersRecursively(int end){ // 5
        if(end == 0) return;
        printNumbersRecursively(end - 1);
        System.out.println(end);
    }

    public static void main(String[] args) {
        //print(); // StackOverFlowError

        printNumbers(5);

        printNumbersRecursively(5);

        System.out.println("End of the program");
    }
}
