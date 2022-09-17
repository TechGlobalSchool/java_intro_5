package casting;

public class Exercise1 {
    public static void main(String[] args) {
        int num1 = 5, num2 = 2;

        System.out.println(num1 / num2); // 5 / 2 = 2
        System.out.println( (double) num1 / num2); // 5.0 / 2 = 2.5
        System.out.println( num1 / (double) num2); // 5 / 2.0 = 2.5
        System.out.println( (double) (num1 / num2)); // (double)(5 / 2) = 2.0
        System.out.println((double) num1 / (double) num2); // 5.0 / 2.0 = 2.5
    }
}
