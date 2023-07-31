package CollectionFramework;

import java.util.PriorityQueue;

public class PriorityQUEUE {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        //Adding
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(1);
        priorityQueue.add(4);
        priorityQueue.add(2);
        System.out.println(priorityQueue);

        //Display
        System.out.println("Element of priority queue:");
        for (Integer elemnet : priorityQueue){
            System.out.println(elemnet);
        }

        //Serach
        int serachElement = 3;
        if (priorityQueue.contains(serachElement)){
            System.out.println(serachElement +"is present in the priority queue");
        }else {
            System.out.println(serachElement + "is not present in the priority queue");
        }

        //Remove
        int removeElement = priorityQueue.remove();
        System.out.println("Removed element:"+ removeElement);

        //Adding
        int addElement = 6;
        priorityQueue.add(addElement);

        //Display
        System.out.println("Element of the priority queue:");
        for (Integer element : priorityQueue){
            System.out.println(element);
        }
    }
}
