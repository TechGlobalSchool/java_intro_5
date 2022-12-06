package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework10 {

    public static void main(String[] args) {
        System.out.println("\n==========Task06==========\n");
        System.out.println(removeExtraSpaces("     i   Love Java    "));
        System.out.println("\n==========Task07==========\n");
        System.out.println(Arrays.toString(sum(new int[]{10, 3, 6, 3, 2}, new int[]{6, 8, 3, 0, 0, 7, 5, 10, 34})));
        System.out.println("\n==========Task08==========\n");
        System.out.println(findClosestTo10(new int[]{10, -13, 5, 70, 15, 57, 10}));
    }
    //////////////////Task06/////////////////////

    public static String removeExtraSpaces(String str){
       return str.trim().replaceAll("[ ]+", " ");
        /*String newStr = "";//" i love java"
        char[] charArr = str.toCharArray();//' ' ' ' 'i' '' '' 'l' 'o' 'v' 'e' '' '' 'j' 'a' 'v' 'a'

        for (int i = 0; i < charArr.length; i++) {
            if(charArr[i] != ' ') newStr += charArr[i];
            else if(i != charArr.length-1 && charArr[i+1] != ' ') newStr += charArr[i];
        }
        return newStr.trim();

         */

    }

    //////////////////Task07/////////////////////

    public static int[] add(int[]a, int[]b){
        for (int i = 0; i < Math.min(a.length, b.length); i++) {
            if(a.length > b.length) a[i] += b[i];
            else b[i] += a[i];
        }
        return a.length > b.length ? a : b;
    }

    public static int[] sum(int[] arr1, int[] arr2){
        // 10, 3, 6, 3, 2
        // 6, 8, 3, 0, 0, 7, 5, 10, 34
        // newArr = 16,11,9,3,2
        //



        int smallerLength = Math.min(arr1.length, arr2.length);//5
        int largerLength = Math.max(arr1.length, arr2.length);//9
        int[] newArr = new int[largerLength]; // 9
        for (int i = 0; i < smallerLength; i++) {
            newArr[i] = arr1[i] + arr2[i];
        }
        for (int i = smallerLength; i < largerLength; i++) {
            if(arr1.length < arr2.length) newArr[i] = arr2[i];
            else newArr[i] = arr1[i];

        }
            return newArr;
    }

    //////////////////Task08/////////////////////
    //10, -13, 5, 70, 15, 57, 10
    //-13, 5, 10, 10, 15, 57, 70
    //
    //
    public static int findClosestTo10(int[] arr){
        Arrays.sort(arr);
        int numberBefore10 = 0;// 5  11-5 = 6
        int numberAfter10 = 0;// 15 10-15 = 4

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 10) numberBefore10 = arr[i];
            else break;
        }
        for (int i = arr.length-1; i >= 0 ; i--) {
            if(arr[i]>10) numberAfter10 = arr[i];
            else break;
        }

        if(arr[0] >= 10) return numberAfter10;
        else if(arr[arr.length-1] <= 10) return numberAfter10;
        else{
            if(Math.abs(10-numberBefore10) <= Math.abs(10-numberAfter10)) return numberBefore10;
            else return numberAfter10;
        }
    }
}
