import java.util.*;
public class stackframework1 {
    public static void main(String[] args) {

        Stack<Integer> s=new Stack<>();
        s.push(123);
        s.push(12);
        s.push(15);
        s.push(17);

        System.out.println("Stack :" + s);

        System.out.println(s.peek());

        s.pop();

        System.out.println(s);



    }
}
