package collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Practice07_ProductPrices {
    public static void main(String[] args) {
        /*
        iPhone      -> 1000
        Macbook Pro -> 1300
        iMac        -> 1500
        Airpods     -> 200
        iPad        -> 700

        TASK 1:
        Find the most expensive product and print it as below

        Expected:
        iMac is the most expensive with the price of $1500.0

        1. Store the items in a HashMap
        2. Find the max price value from HashMap values
        3. Loop and find the item which has the value equals max price value
         */

        HashMap<String, Double> products = new HashMap<>();
        products.put("iPhone", 1000.0);
        products.put("Macbook Pro", 1300.0);
        products.put("iMac", 1500.0);
        products.put("AirPods", 200.0);
        products.put("iPad", 700.0);


        double maxPrice = new TreeSet<>(products.values()).last();

        for (Map.Entry<String, Double> entry : products.entrySet()) {
            if(entry.getValue() == maxPrice){
                System.out.println(entry.getKey() + " is the most expensive with the price of $" + entry.getValue());
                break;
            }
        }
    }
}
