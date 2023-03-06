import java.util.*;
public class Treeset1 {
    public static void main(String[] args) {
        Set<Integer> s1= new TreeSet<>();

        s1.add(13);
        s1.add(14);
        s1.add(16);
        s1.add(11); // duplication is not allowed , but it will be sorted

        System.out.println(s1);

        s1.remove(13);
        System.out.println(s1);
        System.out.println( s1.contains(16));
        System.out.println(s1.isEmpty());
        System.out.println(s1.size());
    }
}
