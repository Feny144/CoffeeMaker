package CollectionFramework;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSET {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("Om");
        set.add("Sai");
        set.add("Ram");
        System.out.println(set);

        TreeSet<String> sortedSet = new TreeSet<>(set);
        System.out.println("The sorted list is:");
        System.out.println(sortedSet);
    }
}
