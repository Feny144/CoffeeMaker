package CollectionFramework;

import java.util.Hashtable;

public class HashTABLE {
    public static void main(String[] args){
        //creat hashtable
        Hashtable<String, Integer> ht = new Hashtable<>();

        //add
        ht.put("A",1);
        ht.put("B",2);
        ht.put("C",3);
        ht.put("D",4);
        ht.put("E",5);

        //remove
        ht.remove("A");

        //print
        System.out.println("Hashtable after removing A:" +ht);

        //search
        if (ht.containsKey("A")){
            System.out.println("A age is"+ ht.get("A"));
        }else {
            System.out.println("A is not age in hashtable");
        }

    }
}
