package CollectionFramework;

import java.util.TreeSet;

public class TreeSET {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        //Adding
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        System.out.println(treeSet);

        //Removing
        treeSet.remove(5);
        System.out.println(treeSet);

        //Searching
        boolean containsElement = treeSet.contains(2);
        System.out.println(treeSet);

        //Inserting
        treeSet.add(3);
        System.out.println(treeSet);

        //Editing
        treeSet.remove(2);
        treeSet.add(7);
        System.out.println(treeSet);

        //Deleting
        treeSet.clear();
        System.out.println(treeSet);

        //Printing
        for (int element : treeSet){
            System.out.println(element);
        }
    }
}
