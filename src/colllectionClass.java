import java.util.*;
public class colllectionClass {
    public static void main(String[] args) {
        List<Integer> a= new ArrayList<>();
        a.add(120);
        a.add(12);
        a.add(12);
        a.add(12);
        a.add(90);
        a.add(1);

        System.out.println(Collections.min(a));
        System.out.println(Collections.max(a));
        System.out.println(Collections.frequency(a,12));

        Collections.sort(a); // sorting in Ascending order
        System.out.println(a);

        Collections.sort(a,Comparator.reverseOrder()); // Sorting in Descending order
        System.out.println(a);


    }
}
