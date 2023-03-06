import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        // loop
        // for, while, do-while
        //while
//        int i=1;
//        while (i<11){
//            System.out.println(i);
//            i++; // i=i+1
//        }
//        // for loop
//        for(int x=11;x<21;x++){
//            System.out.println(x);
//        }
//        for(int a=0;a<21;a++){
//            System.out.println((2*a)+1);
//        }
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter your number");
//        int a=sc.nextInt();
//        for (int i=1;i<11;i++){
//            System.out.println(a + " * " + i + " = " + (i*a) );
//        }
//        Scanner sc= new Scanner(System.in);
//        System.out.println("enter your number");
//        int num = sc.nextInt();
//        int i =1;
//        while (num>0){
//            i=i*num;
//            num--;
//        }
//        System.out.println("your factorial is: " + i);
        int num = 15;
        int a = 0, b = 1;

        // Here we are printing 0th and 1st terms
        System.out.print (a + " , " + b + " , ");

        int nextTerm;

        // printing the rest of the terms here
        for (int i = 2; i < num; i++)
        {
            nextTerm = a + b;
            a = b;
            b = nextTerm;
            System.out.print(nextTerm + " , ");
        }
    }
}
