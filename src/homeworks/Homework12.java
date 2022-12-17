package homeworks;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {
        System.out.println("========Task08========\n");
        System.out.println(Arrays.toString(categorizeCharacters("    ")));

        System.out.println("\n========Task07========\n");
        System.out.println(Arrays.toString(arrFactorial(new int[] {5 , 0, 6})));

        System.out.println("\n========Task06========\n");
        System.out.println(Arrays.toString(no13(new int[] {0, 13, 5 ,0 ,0 ,13})));

        System.out.println("\n========Task05========\n");
        System.out.println(middleInt(-25, 5, -10));

        System.out.println("\n========Task03========\n");
        System.out.println(sumOfDigits("25 java techGlobal 1"));

        System.out.println("\n========Task02========\n");
        System.out.println(noVowels("javA"));
    }

    //------------->TASK08
    public static String[] categorizeCharacters(String str) { // str = 123abcABC#$%
        /*
        String[] result = new String[]{ "","",""};
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))) result[0] += str.charAt(i);
            else if(Character.isDigit(str.charAt(i))) result[1] += str.charAt(i);
            else if(!Character.isWhitespace(str.charAt(i))) result[2] += str.charAt(i);

        }
        return result;

          */
        return new String[]{

                str.replaceAll("[^a-zA-Z]", ""),//abcABC
                str.replaceAll("[^0-9]", ""),//123
                str.replaceAll("[A-Za-z0-9 ]", "")//#$%
        };
    }


        //------------->TASK07
    public static int[] arrFactorial(int[] arr){ //[1,2,6,4,5]
        // 3! = 1*2*3 = 6
        //i = 2
        // arr[i] = 3 , 6
        //j = 1 , 2, 3, 4
        //fact = 1 , 1 , 2 , 6
        for (int i = 0; i < arr.length; i++) {
            int factorial = 1;
            for (int j = 1; j <= arr[i]; j++) {
                factorial *= j;
            }
            arr[i] = factorial;

        }
        return arr;
    }
    //------------->TASK06
    public static int[] no13(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 13) arr[i] = 0;
        }
        return arr;
    }
    //------------->TASK05
public static int middleInt(int num1, int num2, int num3){
        int[] arr = new int[]{num1, num2, num3};
        Arrays.sort(arr);
        return arr[arr.length/2];
}
    //------------->TASK03
    public static int sumOfDigits (String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                sum += Character.getNumericValue(str.charAt(i));


        }
        /*
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(Character.isDigit(arr[i])) sum += Integer.parseInt(Character.toString(arr[i]));
        }



        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }

         */
        return sum;


    }

    //------------->TASK02
    public static String noVowels(String str){ //javA
        return str.replaceAll("[aeiouAEIOU]", "");//jv
    }




    }
