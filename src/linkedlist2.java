import java.util.*;
public class linkedlist2 {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l2.add(12);
        l2.add(13);
        l2.add(15);

        li.add(6);
        li.add(7);
        li.add(8);

        li.addLast(645);//  adding element in last
        li.addFirst(123); // adding in the first

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
        System.out.println(li.indexOf(7));

    }
}
