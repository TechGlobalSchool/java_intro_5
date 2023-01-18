package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Homework15 {
    public static void main(String[] args) {
        System.out.println("==========TASK01==========\n");
        System.out.println(Arrays.toString(fibonacciSeries1(4)));
        System.out.println("\n==========TASK02==========\n");
        System.out.println(fibonacciSeries2(4));
        System.out.println("\n==========TASK03==========\n");
        System.out.println(Arrays.toString(findUniques(new int[]{1,2,3,4}, new int[]{3,4,5,5})));//1,2,5
        System.out.println("\n==========TASK04==========\n");
        System.out.println(isPowerOf3(243));
        System.out.println("\n==========TASK05==========\n");
        System.out.println(firstDuplicate(new int[]{1,  2, 3, 4, 4}));

    }
    //////////TASK01
    public static int[] fibonacciSeries1(int n){ // 4 -> [0, 1, 1, 2]
        if(n > 0) {
            int[] result = new int[n];//[0,1,1,2]
            for (int i = 0; i < n; i++) {
                if(i == 0) result[i] = 0;
                else if(i == 1) result[i] = 1;
                else result[i] = result[i-1] + result[i-2];
            }
            return result;
        }
        else throw new IllegalArgumentException();

        /*int prev;// 0 1 1 2
        int cur = 0;// 1 1 2 3
        int next = 1;// 1 2 3 5
        int[] answer = new int[n];// [0, 1, 1, 2]
        for (int i = 0; i < n; i++) {
            answer[i] = cur;
            prev = cur;
            cur = next;
            next = prev + next;


        }
        return answer;

         */
    }
    //////////TASK02
    public static int fibonacciSeries2(int n){// 0 1 1 2 3 5 8
        if(n <= 1) return 0;
        if(n <= 3) return 1;
        return fibonacciSeries2(n-1)+fibonacciSeries2(n-2);



        /*int prev;
        int cur = 0;
        int next = 1;
        int answer = 0;

        for (int i = 0; i < n; i++) {
            answer = cur;
            prev = cur;
            cur = next;
            next = prev + next;


        }
        return answer;

         */
    }
    //////////TASK03
    public static int[] findUniques(int[] arr1, int[] arr2){
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i : arr1) {
            set1.add(i);
        }

        for (int i : arr2) {
            set2.add(i);
        }

        for (Integer i : set1) {
            if(!set2.contains(i) && !al.contains(i)) al.add(i);
        }
        for (Integer i : set2) {
            if(!set1.contains(i) && !al.contains(i)) al.add(i);
        }

        int[] answer = new int[al.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = al.get(i);
        }
        return answer;
    }
    //////////TASK04
    public static boolean isPowerOf3(int n){//243
        int power = 0;
        for (int i = 0; n > power; i++) {
            power = (int)Math.pow(3,i);//9
            if(power == n) return true;
        }
        return false;

    }
    //////////TASK05
        public static int firstDuplicate(int[] arr){
            int dup = -1;
            int index = arr.length-1;

            for (int i = 0; i < arr.length-1; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[i] == arr[j] && j<=index){
                        dup = arr[i];
                        index = j;
                    }

                }
            }

            return dup;
        }
}
