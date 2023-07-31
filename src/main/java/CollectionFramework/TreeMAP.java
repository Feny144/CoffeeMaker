package CollectionFramework;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMAP {
    public static void main(String[] args){
        //creat
        TreeMap<String, Integer> map = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);
        int nos = scanner.nextInt();

        for (int i = 0; i < nos; i++) {
            String key = scanner.next();
            int value = scanner.nextInt();
            map.put(key, value);
        }

//        //add
//        map.put("Pink",001);
//        map.put("Black",002);
//        map.put("White",003);

        //remove
        map.remove("Pink");

        //insert
        map.put("Green",004);

        //search
        if (map.containsKey("Black")){
            System.out.println("Is in the TreeMap");
        }else {
            System.out.println("Is not in the TreeMap");
        }
    }
}
