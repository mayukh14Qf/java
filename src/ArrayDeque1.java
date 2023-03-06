import java.util.*;
public class ArrayDeque1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 =new ArrayDeque<>();
        ad1.addFirst(1); // adding in front of queue
        ad1.addLast(12); // adding in last
        ad1.add(12);
        System.out.println(ad1.getFirst()); // getting 1st element

    }
}
