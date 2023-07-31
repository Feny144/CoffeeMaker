package CollectionFramework;

import java.util.Map;


public class HashMap {
    public static void main(String[] args){
        Map<String, Integer> map = new java.util.HashMap<>();
        map.put("Apple",1);
        map.put("Banana",2);
        map.put("Orange",3);

        map.remove("Banana");

        //map.clear();

        //insert
        map.put("Apple",1);
        map.put("Banana",2);
        map.put("Orange",3);

        Map<String,Integer> newMap = new java.util.HashMap<>();
        for (Map.Entry<String, Integer> entry: map.entrySet()){
            if (entry.getKey().equals("Orange")){
                newMap.put("Pineapple",4);
            }
            newMap.put(entry.getKey(), entry.getValue());
        }
        map = newMap;

        System.out.println();

//        //search
//        if (map.containsKey("kiwi")){
//            System.out.println("The value of Apple is" + map.get("Apple"));
//        }else {
//            System.out.println("The map dose not contain");
//        }
    }
}
