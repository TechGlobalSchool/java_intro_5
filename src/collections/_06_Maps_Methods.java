package collections;

import java.util.*;

public class _06_Maps_Methods {
    public static void main(String[] args) {

        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("France", "Paris");

        System.out.println(capitals); // {France=Paris}

        capitals.put("Germany", "Berlin");
        capitals.put("Italy", "Rome");
        capitals.put("Spain", "Madrid");

        System.out.println(capitals); // {Italy=Rome, France=Paris, Germany=Berlin, Spain=Madrid}

        System.out.println("\n----------Retrieve values with their keys------------\n");
        System.out.println(capitals.get("Spain")); // Madrid
        System.out.println(capitals.get("Belgium")); // null
        System.out.println(capitals.getOrDefault("Belgium", "Does not exists!"));


        System.out.println("\n----------Check if map contains given key or value------------\n");
        System.out.println(capitals.containsKey("Germany")); // true
        System.out.println(capitals.containsKey("Portugal")); // false

        System.out.println(capitals.containsValue("Ankara")); // false
        System.out.println(capitals.containsValue("Berlin")); // true


        System.out.println("\n----------Update the value for the specified key------------\n");
        System.out.println(capitals.replace("Ukraine", "Kyiv")); // null
        System.out.println(capitals.replace("Germany", "berlin", "Munich")); // false
        System.out.println(capitals.replace("Germany", "Berlin", "Munich")); // true

        capitals.put("Turkey", "Ankara");
        System.out.println(capitals); // {Turkey=Ankara, Italy=Rome, France=Paris, Germany=Munich, Spain=Madrid}

        capitals.put("Turkey", "Istanbul");
        System.out.println(capitals); // {Turkey=Istanbul, Italy=Rome, France=Paris, Germany=Munich, Spain=Madrid}


        System.out.println("\n----------Remove some entries------------\n");
        capitals.remove("France");
        System.out.println(capitals); // {Turkey=Istanbul, Italy=Rome, Germany=Munich, Spain=Madrid}
        capitals.remove("US"); // null
        capitals.remove("Germany", "Stuttgart"); // false
        System.out.println(capitals); // {Turkey=Istanbul, Italy=Rome, Germany=Munich, Spain=Madrid}

        System.out.println(capitals.remove("Germany", "Munich")); // true
        System.out.println(capitals); // {Turkey=Istanbul, Italy=Rome, Spain=Madrid}

        System.out.println("\n----------Advanced Map methods------------\n");
        //Keys: Turkey, Italy, Spain
        //Values: Istanbul, Rome, Madrid


        Set<String> set = capitals.keySet();
        System.out.println(set); // [Turkey, Italy, Spain]

        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println(treeSet); // [Italy, Spain, Turkey]

        Collection<String> collection = capitals.values();
        System.out.println(collection); // [Istanbul, Rome, Madrid]

        ArrayList<String> list = new ArrayList<>(capitals.values());

        System.out.println("\n----------Iterating key and values------------\n");
        for (String s : capitals.keySet()) {
            System.out.println(s);
        }

        for(String s : capitals.values()){
            System.out.println(s);
        }

        System.out.println("\n----------Getting all the entries------------\n");
        Set<Map.Entry<String, String>> entries = capitals.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
            System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
        }
    }
}
