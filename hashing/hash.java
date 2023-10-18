package hashing;

import java.util.HashSet;
import java.util.Iterator;

public class hash {
    public static void main(String[] arg) {
        HashSet<Integer> set = new HashSet<>();

        // Insert --add
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(7);

        // size of set
        System.out.println("Size of the set is : " + set.size());

        // to print all the element of set

        System.out.println(set);

        // search -- contains

        if (set.contains(1)) {
            System.out.println("set contains 1");
        }

        // delete -- remove

        set.remove(1);

        if (!set.contains(1)) {
            System.out.println("does not contains 1");

        }

        // Iterator(set traversing) set is unodered

        Iterator<Integer> it = set.iterator();

        // hasNext fuc

        // it.hasNext() checks if there is any next element left if yes the return true
        // else return false

        // next fun

        // the it intially points to null value then
        // it->null->value in set in unodered manner

        System.out.println(it.next());

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
