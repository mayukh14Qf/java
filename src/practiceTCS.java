import java.util.Scanner;

public class practiceTCS {
    public static void main(String[] args) {

        //If number is  Negative or Positive Number

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number ");
//        int a= sc.nextInt();
//        int b=a;
//        if(b<0){
//            System.out.println("Number is Negative");
//        }
//        else{
//            System.out.println("Number is Positive");
//        }

        // Even or Odd number

//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter your Number ");
//        int a=sc.nextInt();
//        int p=a;
//        if(p%2==0){
//            System.out.println("This Number is Even ");
//        } else if (p==0) {
//            System.out.println("Do Not put 0 here ");
//        }
//        else{
//            System.out.println("This Number is Odd");
//        }

        // Sum of First N Natural Numbers

//        Scanner sc= new Scanner(System.in);
//        System.out.println("Your digit ");
//        int n=sc.nextInt();
//        int sum=n*(n+1)/2;
//        System.out.println("Sum of the numbers " + sum);

        // Sum of numbers in a given range

//        int a= 12; int b=14;
//        int sum=0;
//        for(int i=a;i<=b;i++){
//            sum=sum+i;
//        }
//        System.out.println("sum is of the number " + sum);

        // Greatest of Two numbers

//        int a=100;
//        int b=10;
//        int c= Math.max(a,b);
//        System.out.println("max is " + c);

        // Greatest of Three of Numbers

//        int a=100;
//        int b=18;
//        int c=188;
//        int d=Math.max(a,b);
//        int e=Math.max(c,d);
//        System.out.println("max of the three number is " +e);

        // String Reversal

//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter your String Value");
//        String s=sc.nextLine();
//        String p="";
//        int ptr=s.length()-1;
//        while (ptr>=0){
//            p=p+s.charAt(ptr);
//            ptr--;
//        }
//        System.out.println(p);

        // String Palindrome

//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter your String Value");
//        String s=sc.nextLine();
//        String p="";
//        int ptr=s.length()-1;
//        while (ptr>=0){
//            p=p+s.charAt(ptr);
//            ptr--;
//        }
//        System.out.println(p);
//        if(p.equals(s)){
//            System.out.println("it is a palindrome String");
//        }
//        else {
//            System.out.println("it is not the palindrome" );
//        }

        // Number Reversal

//        int num=1234;
//        int rev=0;
//        while (num>0){
//            rev=(rev*10)+(num%10);
//            num=num/10;
//        }
//        System.out.println("your reversed Number is " + rev);

        // Number Palindrome

//        int num = 1221;
//        int num1=num;
//        int rev =0;
//        while (num>0){
//            rev=(rev*10)+(num%10);
//            num=num/10;
//        }
//        System.out.println("Reversed number " + rev);
//        if(num1==rev){
//            System.out.println("Number is palindrome");
//        }
//        else {
//            System.out.println("not a palindrome number");
//        }

        // Sum of the digits

//        int s=123;
//        int sum =0;
//        while (s>0){
//            sum=sum+(s%10);
//            s=s/10;
//        }
//        System.out.println("sum of the digit is " + sum);

        // Leap year
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter your value");
//        int num=sc.nextInt();
//        if(num%4==0 && num%100!=0){
//            System.out.println("leap year");
//        } else if (num%400==0) {
//            System.out.println("leap year");
//        }
//        else {
//            System.out.println("not a leap year ");
//        }

        // First Digit of number

//        int a=1234;
//        while (a>10){
//            a=a/10;
//        }
//        System.out.println(a);

        // Last digit of number

//        int a=1233;
//        int b=a%10;
//        System.out.println(b);

        // Count the digits

//        int a=1234;
//        int count=0;
//        while (a>0){
//            a=a/10;
//            count=count+1;
//        }
//        System.out.println("number os the digits is " + count);

        // Factorial of a Number

//        int a=3;
//        int i=1;
//        while (a>0){
//            i=i*a;
//            a--;
//        }
//        System.out.println("your Factorial is " + i);

        // Power of Number

//        int a=12;
//        int b= (int) Math.pow(12,2);
//        System.out.println(b);

        // OR

//        int ans=1;
//        int a= 3;
//        int b=2;;
//        while (b>0){
//            ans=a*ans;
//            b--;
//        }
//        System.out.println(ans);

        // Typecasting

//        double a=123;
//        int b=(int)a;
//
//        System.out.println(a);

        // Fibonacci Series

//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter your Range");
//        int n=sc.nextInt();
//        int a=0;
//        int b=1;
//        int sum=0;
//        System.out.print(a+" "+b+" ");
//        for(int i=3;i<=n;i++){
//            sum=a+b;
//            a=b;
//            b=sum;
//            System.out.print(sum+" ");
//        }

        // Prime or not

//        int n=97;
//        int count=0;
//        if(n<2){
//            System.out.println("not a prime number");
//        }
//        for(int i=1;i<=n;i++){
//            if(n%i==0){
//                count=count+1;
//            }
//        }
//
//        if (count>2){
//            System.out.println("not prime");
//        }
//        else{
//            System.out.println("prime");
//        }

        // Armstrong Number


//        int i=371;
//        int count=0;
//        while (i>0){
//            i=i/10;
//            count=count+1;
//        }
//        System.out.println("number digit present in number " + count);
//
//        int reminder;int result=0;
//        while(i!=0){
//            reminder=i%10;
//            result=result+(int)Math.pow(reminder,count);
//            i=i/10;
//        }
//        System.out.println(result);

        // Hcf code

        int n1=36; int n2=60; int hcf;
        while (n1!=n2){
            if (n1>n2){
                n1=n1-n2;
            }
            else {
                n2=n2-n1;
            }
        }
        System.out.println("hcf is " + n1);
    }
}
