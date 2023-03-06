import java.util.*;
public class map1 {
    public static void main(String[] args) {
        Map<Integer,String> n=new HashMap<>();

        n.put(12,"mayukhjit"); // keys are always unique ,values are not
        n.put(14,"debayan");
        n.put(16,"aftfau");
        n.put(15,"shuvamnggi");

        System.out.println(n.containsKey(12));
        System.out.println(n.containsValue("mayukhjit"));

        System.out.println(n);

        for(Integer key : n.keySet()){
            System.out.println(key);
        }
        for(String values : n.values()){
            System.out.println(values);
        }

    }
}
