package CollectionFramework;

public class LinkedHashSET {
    public static void main(String[] args){
        java.util.LinkedHashSet<String> set=new java.util.LinkedHashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        set.remove("Banana");

        //set.clear();

//        LinkedHashSet<String> newSet = new LinkedHashSet<>();
//        for (String fruit : set){
//            if(fruit.equals("Orange")){
//                newSet.add("Pineapple");
//            }
//            set = newSet;
//
         System.out.println(set);
//        }

    }
}
