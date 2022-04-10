package Assignment3;

import java.util.*;
import java.util.stream.Collectors;

public class ListNMap {
    /*
    15. Create List and Map. List A contains 1,2,3,4,10(integer) . Map B contains ("a","1") ("b","2") ("c","10") (key = string, value = string)
    Question: get a list which contains all the elements in list A, but not in map B.
     */
    public static void main(String[] args) {
        ListNMapPractice();
    }

    public static void ListNMapPractice() {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(10);
        Map<String, String> b = new HashMap<>();
        b.put("a", "1");
        b.put("b", "2");
        b.put("c", "10");

        Set<Integer> set = b.values().stream()
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toSet());


        List<Integer> res = new ArrayList<>();
        for (Integer i : a) {
            if (!set.contains(i)) {
                res.add(i);
            }
        }

        System.out.println("Result list: " + res.toString());
    }
}
