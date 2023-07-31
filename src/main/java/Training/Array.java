package Training;

import java.util.ArrayList;
import java.util.LinkedList;

public class Array {
    public static void main(String[] args){
//        ArrayList<String> Name=new ArrayList<>();
//        Name.add("Feni");
//        Name.add("Pulu");
//
//        System.out.println(Name);
//        Name.add("Heny");
//        Name.clear();
//        System.out.println(Name);
//        Name.add(1, "Kinjal");
//        Name.remove(1);
//        Name.add(0,"Hardi");
//        System.out.println(Name.get(1));

        LinkedList<String> Name=new LinkedList<String>();
        Name.add("Feni");
        Name.add("Heny");
        Name.add("Purvi");

        System.out.println(Name);
        Name.remove();
        System.out.println(Name);
        Name.addFirst("Om");
        Name.addLast("Sai");
        System.out.println(Name);
        Name.add(3,"Sai");
        Name.removeLast();
        System.out.println(Name);

        for(String str:Name){
            System.out.println(str);
        }
    }
}
