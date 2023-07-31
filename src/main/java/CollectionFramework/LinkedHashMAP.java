package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class LinkedHashMAP {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        Scanner scanner = new Scanner(System.in);

        int nos = scanner.nextInt();

        for (int i = 0; i < nos; i++) {
            String key = scanner.next();

            int value = scanner.nextInt();

            map.put(key, value);

        }

        System.out.println(map);


        //Add
//        map.put("Feny", 01);
//        map.put("Heny", 02);
//        map.put("Purvi", 03);
//
//        //Remove
//        map.remove("Purvi");
//
//        //Insert
//        map.put("Kinjal", 04);
//        System.out.println(map);


        System.out.println("Enter key for Search : ");

        //Search
        String search = scanner.next();
        if (map.containsKey(search)) {
            System.out.println("Is in the LinkedHashMap");
        } else {
            System.out.println("Is not in the LinkedHashMap");
        }
    }
}
