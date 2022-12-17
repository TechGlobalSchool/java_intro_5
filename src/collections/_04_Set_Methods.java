package collections;

import java.util.*;

public class _04_Set_Methods {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Foo");
        set.add("Bar");
        set.add("bar");
        set.add("foo");
        set.add("abc");
        set.add("xxx");

        System.out.println(set); // [Bar, bar, abc, Foo, foo, xxx]
        System.out.println(set.size()); // 6
        System.out.println(set.isEmpty()); // false
        System.out.println(set.contains("ABC")); // false
        System.out.println(set.contains("abc")); // true
        System.out.println(set.remove("AAA")); // false
        System.out.println(set.remove("xxx")); // true
        System.out.println(set); // [Bar, bar, abc, Foo, foo]
        System.out.println(set.equals(set)); // true

        set.removeIf(e -> e.toLowerCase().startsWith("b"));
        System.out.println(set); // [abc, Foo, foo]

        System.out.println("\n---------forEach()------------\n");
        set.forEach(System.out::println);

        System.out.println("\n---------for-each loop------------\n");
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("\n---------Iterator------------\n");
        Iterator<String> it = set.iterator();
        while(it.hasNext()) System.out.println(it.next());

        set.removeAll(set); // removing all
        set.clear(); // removing all

        System.out.println(set.size()); // 0
        System.out.println(set); // []
    }
}
