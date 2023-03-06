

import java.util.*;

public class collection_framework {

    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);

        l2.add(12);
        l2.add(13);
        l2.add(15);

        li.add(6);
        li.add(7);
        li.add(8);

        li.addAll(l2); // add two arraylist together



        for (int a : li) {
            System.out.print(" " + a);
        }

        System.out.println();

        li.addAll(0,l2); // adding in front of 2nd list
        li.set(1,123);// set a particular index to a particular value
        for (int a : li) {
            System.out.print(" " + a);
        }





        System.out.println();
        System.out.println(li.contains(2));// element present  in the arraylist or not
        System.out.println(li.size()); // size of the arraylist
        System.out.println(li.get(1)); // getting an element
        System.out.println(li.indexOf(7));// return an index of element {-1 represents element is not present}

    }
}
