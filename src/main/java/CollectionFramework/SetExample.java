package CollectionFramework;

import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {
    public static <Hashset> void main(String[] args) {
        int count[] = {21, 23, 43, 53, 22, 65};
        HashSet<Integer> set = new HashSet<>();
        try {
            for (int i = 0; i <= 5; i++) {
                set.add(count[i]);
            }
            System.out.println(set);

            TreeSet sortedSet = new TreeSet<>(set);
            System.out.println("The sorted list is:");
            System.out.println(sortedSet);

            System.out.println("First element of the set is:" + sortedSet.first());
            System.out.println("Last element of the set is:" + sortedSet.last());
        } catch (Exception e) {
        }
    }

    private void add(int i) {
    }
}

