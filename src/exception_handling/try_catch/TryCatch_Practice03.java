package exception_handling.try_catch;

public class TryCatch_Practice03 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 5};

        /*
        Find the 6th number from the array, multiply it with 5 and print the result
         */

        try{
            System.out.println(numbers[5] * 5);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }


        System.out.println("End of the program");
    }
}
