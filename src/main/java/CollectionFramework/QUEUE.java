package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QUEUE {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

            //Adding
            queue.add("A");
            queue.add("C");
            queue.add("B");
            System.out.println(queue);

            //Removing
            String removeElement = queue.remove();
            System.out.println("Remove element:" + removeElement);

            //Checking
            boolean isEmpty = queue.isEmpty();
            System.out.println("Is queue empty?" + isEmpty);

            //Finding
            int size = queue.size();
        System.out.println("Size of queue:" + size);
        }
    }

