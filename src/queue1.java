import java.util.*;
public class queue1 {
    public static void main(String[] args) {
//        Queue<Integer> q= new LinkedList<>();// Linkedlist , Arraylist , Priority Queue
//
//        q.offer(12);
//        q.offer(14);
//        q.offer(15); // adding in queue (add)
//
//        System.out.println(q);
//
//        q.poll(); // deleting a element (remove)
//
//        System.out.println(q);
//
//        System.out.println(q.peek()); // returns value of peek (element)
//

        //Priority Queue
        Queue<Integer> pq=new PriorityQueue<>();
        pq.offer(121);
        pq.offer(14);
        pq.offer(119);

        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());



    }
}
