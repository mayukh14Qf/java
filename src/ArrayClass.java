import java.util.*;
public class ArrayClass {
    public static void main(String[] args) {
        Integer [] arr={12,1,23,4,5,67,86};
        Arrays.sort(arr);

        for(int a:arr){
            System.out.print(a +" ");
        }
        System.out.println();
        Arrays.fill(arr,12);
        for(int a:arr){
            System.out.print(a +" ");
        }
    }
}
