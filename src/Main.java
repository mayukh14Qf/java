import java.util.Scanner ;
public class Main {

    public static void main(String[] args) {

        /*System.out.println("enter your name");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("enter your age");
        int i= sc.nextInt();
        System.out.println("your name is " +" "+s+" "+"your  age is " +i);*/

        // swap 2 nu,ber in java

        /*int a,b,c;
        a=10;
        b=20;
        c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);*/

        // sum of n numbers

        /*Scanner s1=new Scanner(System.in);
        System.out.println("enter your number of digits");
        int n = s1.nextInt();

        int p;
        p=(n*(n+1)/2);

        System.out.println("your answer after sun is /*" +p);*/

        // find last digit of number


        /*Scanner t = new Scanner(System.in);
        System.out.println("Enter your number");
        int p = t.nextInt();


        int ans =p%10;
        System.out.println(ans); */

        // Largest of three number

        /*int a,b,c;
        a=10;
        b=24;
        c=56;
        if (a>=b && a>=c){
            System.out.println(a);
        }
        else if (b>=a && b>=c) {
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }*/

        // another method

        /* int a,b;
        a=10;
        b=20;

        int p = Math.max(a,b);
        System.out.println(p); */

        // leap year

       /* Scanner sc = new Scanner(System.in);
        System.out.println("enter your year");
        int p = sc.nextInt();

        if (p%4==0 && p%100 != 0){
            System.out.println("yah this year is leap year");
        } else if (p%400==0) {
            System.out.println("yah!! it's a leap  year");
        } else{
            System.out.println("no!! it's not leap year");
        } */

        // make a simple calculator

       /* Scanner sc = new Scanner(System.in);
        System.out.println("Select your operation : \n1.addition \n2.multiplication \n3.substraction");
        int p = sc.nextInt();
        if (p != 1 && p != 2 && p != 3) {
            System.out.println("invalid imput");
        }
        System.out.println("enter your 1st number");
        int a = sc.nextInt();
        System.out.println("enter your 2nd number");
        int b = sc.nextInt();
        ;

        if (p == 1) {
            System.out.println("your answer is " + (a + b));
        } else if (p == 2) {
            System.out.println("your answer is " + (a * b));
        } else if (p == 3) {
            System.out.println("your answer is " + (a - b));
        }*/

        // count the digits of number

        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int num= sc.nextInt();
        int count=0;
        while (num>0){
            num=num/10;
            count=count+1;
        }
        System.out.println("your number of digit present is  " + count); */

        // Make a table of number

        /*/Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int n = sc.nextInt();
        for(int i=1 ; i<11 ; i++){
            System.out.println(i + " x "+ n +" = "+ (i*n));  */

        // some pattern in java

       /*  int i = 1;
        while (i<=5){
            System.out.println("*");
            i=i+1; */

        /*int j=1;
       while (j<=5){
           System.out.print("*");
           j+=1; */

      /*  int i = 1;
        while (i<=5) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
        } */

        /*int i = 1;
        while (i<=5) {
            int j = 1;
            while (j <= 5) {
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
        } */

      /*  int i = 1;
        while (i<=5) {
            int j = 1;
            while (j <= (6-i)) {
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
        } */

        /*int i = 1;
        while (i<=6) {
            int j = 1;
            while (j <= (6-i)) {
                System.out.print(" ");
                j++;
            }
            int l=1;
            while (l<=(2*i-1)){
                System.out.print("*");
                l++;
            }
            System.out.println();
            i++;
        } */

        // determine  the factorial

       /* Scanner sc = new Scanner(System.in);
        System.out.print("enter your number");
        int n = sc.nextInt();
        int i =1;
        while (n>0){
            i=i*n;
            n--;
        }
        System.out.println(i); */

        // There are 4 types of primitive  datatype [for float  put 'f' and long 'l']



    }



}



