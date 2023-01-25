package homeworks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Homework16 {
    public static void main(String[] args) {
        System.out.println("==========TASK01==========\n");
        System.out.println(parseData("{104}LA{101}Paris{102}Berlin{1033}Chicago{99}London"));
        System.out.println("\n==========TASK02==========\n");
        HashMap<String,Integer> hm1 = new HashMap<>();
        hm1.put("Apple", 3);
        hm1.put("Mango", 1);
        System.out.println(calculateTotalPrice1(hm1));
        System.out.println("\n==========TASK03==========\n");
        HashMap<String,Integer> hm2 = new HashMap<>();
        hm2.put("Apple", 4);
        hm2.put("Mango", 8);
        hm2.put("Orange", 3);
        System.out.println(calculateTotalPrice2(hm2));
    }
    /////////TASK01
    public static HashMap<Integer,String> parseData(String str){//101 chicago 102 la
        HashMap<Integer, String> hm = new HashMap<>();
        String[] arr = str.split("[{}]");//[,101,chicago,102,la]

        for (int i = 1; i < arr.length; i++) {
            hm.put(Integer.parseInt(arr[i]),arr[i+1]);
            i++;
        }
        return hm;
    }
    /////////TASK02
    public static double calculateTotalPrice1(HashMap<String, Integer> hm){
        double price = 0.0;

        for (String s : hm.keySet()) {
            switch (s){
                case "Apple":
                    price += hm.get("Apple") * 2.00;
                    break;
                case "Mango":
                    price += hm.get("Mango") * 4.99;
                    break;
                case "Orange":
                    price += hm.get("Orange") * 3.29;
                    break;
                case "Pineapple":
                    price += hm.get("Pineapple") * 5.25;
                    break;
            }
        }
        return price;

    }
    /////////TASK03
    public static double calculateTotalPrice2(HashMap<String, Integer> hm){
        double price = 0;

        for (String s : hm.keySet()) {
            switch (s){
                case "Apple":
                    /*int disApples = hm.get("Apple")/2;
                    price += (hm.get("Apple") * 2.00) - disApples;
                    break;
                     */
                    if(hm.get("Apple") % 2 == 0) price += hm.get("Apple") * 1.50;
                    else price += (hm.get("Apple") * 1.50) + .50;
                    break;
                case "Mango":
                    int freeMango = hm.get("Mango")/4;
                    price += (hm.get("Mango") * 4.99) - (freeMango * 4.99);
                    break;
                case "Orange":
                    price += hm.get("Orange") * 3.29;
                    break;
            }
        }
        return price;


    }
}
