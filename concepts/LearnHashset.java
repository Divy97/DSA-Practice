package concepts;

import java.util.HashSet;
import java.util.Iterator;

public class LearnHashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);

        if (set.contains(1)) {
            System.out.println("Contains 1");
        }

        set.remove(1);
        System.out.println(set);
        System.out.println(set.size());

        // Iterator
        Iterator it = set.iterator();
        System.out.print("Elements in set: ");
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
