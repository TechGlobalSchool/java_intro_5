package homeworks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework14 {
    public static void main(String[] args) {
        System.out.println("==========TASK01==========\n");

        System.out.println("\n==========TASK02==========\n");
        System.out.println(fizzBuzz2(7));
        System.out.println("\n==========TASK03==========\n");
        System.out.println(findSumNumbers("a1b2c3"));
        System.out.println("\n==========TASK04==========\n");
        System.out.println(findBiggestNumber("a-a76b101-"));
        System.out.println("\n==========TASK05==========\n");
        System.out.println(countSequenceOfCharacters("aabbcaa"));// 1a1b1c
    }
    //////////Task01



    //////////Task02

    public static String fizzBuzz2(int num){
        if(num % 5 == 0 && num % 3 == 0) return "FuzzBuzz";
        if(num % 5 == 0) return "Buzz";
        if(num % 3 == 0) return "Fizz";
        return String.valueOf(num);
    }

    //////////Task03

    public static int findSumNumbers(String str){
        int num = 0;
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i)))
                num += num * 10 + str.charAt(i) - '0';
            else {
                sum += num;
                num = 0;
            }
        }

        return sum+num;
    }

    //////////Task04

    public static int findBiggestNumber(String str){//a-a56b-5abc
        if(str.isEmpty()) return 0;
        int max = Integer.MIN_VALUE;
        String[] arr = str.split("[^0-9-]");
        for (String s : arr) {
            if(!s.isEmpty()){
                if(s.startsWith("-")){
                    String[] arr1 = s.split("-");
                    for (String s1 : arr1) {
                        if(!s1.isEmpty()) {
                            int number = Integer.parseInt(s1) - Integer.parseInt(s1) - Integer.parseInt(s1);
                            max = Math.max(max, number);
                        }
                    }
                }else if(!s.contains("-")) max = Math.max(max, Integer.parseInt(s));
                else max = Math.max(max, Integer.parseInt(s.substring(0,s.indexOf("-"))));
            }
        }
        return max;



        /*int num =0, max = 0;

        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i)))
                num += num * 10 + str.charAt(i) - '0';
            else{
                max = Math.max(num, max);
                num = 0;
            }
        }
        return Math.max(num,max);


        /*if(str.replaceAll("[^0-9]", "").isEmpty())return 0;
        String[] arr = str.split("[^0-9]+");//[]
        Arrays.sort(arr);//["","" , "", "", "" , "1", "4", "6"]
        return Integer.parseInt(arr[arr.length-1]);

         */

    }

    //////////Task05
    public static String countSequenceOfCharacters(String str){// aabbcaa
        if(str.isEmpty()) return str;
        String answer = "";// 2a2b1c2a
        char letter = str.charAt(0);//a - b - c - a
        int count = 1;//2

        for (int i = 1; i < str.length(); i++) {//i = 7
            if(str.charAt(i) == letter) count++;
            else{
                answer += Integer.toString(count) + letter;
                letter = str.charAt(i);
                count = 1;
            }
        }

        answer += Integer.toString(count) + letter;
        return answer;
    }
}
