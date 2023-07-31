package CollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLIST {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter names (press enter to stop):");

        while (true) {
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            names.add(name);
        }
        System.out.println("Name entered:" + names);

//        ArrayList<String> list1 = new ArrayList<>();
//        ArrayList<Boolean> list2 = new ArrayList<>();

//        //Add element
//        list.add(0);
//        list.add(2);
//        list.add(3);
//        System.out.println(list);
//
//        //Get element
//        int element = list.get(0);
//        System.out.println(element);
//
//        //Add element in between
//        list.add(1,1);
//        System.out.println(list);
//
//        //Set element
//        list.set(0,5);
//        System.out.println(list);
//
//        //Delete element
//        list.remove(3);
//        System.out.println(list);
//
//        //Size
//        int size = list.size();
//        System.out.println(size);
//
//        //Loop
//        for (int i=0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }
//        System.out.println();
//
//        //Sorting
//        Collections.sort(list);
//        System.out.println(list);

//        Collection<Integer>nums = new ArrayList<>();
//
//        //Add
//        nums.add(2);
//        nums.add(1);
//        nums.add(3);
//        nums.add(4);
//        for (int n : nums){
//            int num = (Integer)n;
//            System.out.println(num*2);
//        }
//
    }
}
