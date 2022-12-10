package homeworks;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Homework11 {
    public static void main(String[] args) {
        int[] arr;
        System.out.println("===========Task06\n");
        checkAge(1700);
        System.out.println("===========Task05\n");
        System.out.println(averageOfEdges(-3,15,-3));
        System.out.println("\n==========Task06==========\n");
        String[] arrStr = new String[]{"appium", "hello", "123", "xyz"};
        System.out.println(Arrays.toString(noA(arrStr)));

        System.out.println("\n==========Task07==========\n");
        arr = new int[]{3,4,5,6};
        System.out.println(Arrays.toString(no3or5(arr)));

        System.out.println("\n==========Task08==========\n");
        arr = new int[]{-10, -3, 0, 1};
        System.out.println(countPrimes(arr));


    }



    public static void checkAge(int yearOfBirth){
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(dateFormat.format(date));

    int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    int age = currentYear - yearOfBirth;
    
    if(age >= 16 && age < 100) System.out.println("AGE IS ALLOWED");
    else if(age < 16 && age > 0) System.out.println("AGE IS NOT ALLOWED");
    else System.out.println("AGE IS NOT VALID");

    }

    public static int averageOfEdges(int num1, int num2, int num3){
        return ((Math.min(num1,Math.min(num2,num3))) + (Math.max(num1,Math.max(num2,num3))) )/ 2;
    }

    public static String[] noA(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].toLowerCase().startsWith("a")) arr[i]="###";
        }
        return arr;




    }

    public static int[] no3or5(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 15 == 0) arr[i] = 101;
            else if(arr[i] % 3 == 0) arr[i] = 100;
            else if(arr[i] % 5 == 0) arr[i] = 99;
        }
        return arr;
    }

    public static int countPrimes(int[] arr){
        int nonPrimeNumbers = 0;

        for (int num : arr) {
            if(num < 2){
                nonPrimeNumbers++;
                continue;
            }
            for (int i = 2; i < num; i++) {
                if(num % i == 0) nonPrimeNumbers++;
            }
        }
        return arr.length - nonPrimeNumbers;
        /*
        WAY 2:
        int prime = 0;
        boolean isNotPrime = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >=2){
                for (int j = 2; j < arr[i]; j++) {
                    if(arr[i] % j == 0) {
                        isNotPrime = true;
                        break;
                    }
                }
                if(!isNotPrime) prime++;
                isNotPrime = false;
            }
        }
        return prime;
         */
    }


}
