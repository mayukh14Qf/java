import  java.util.Scanner;
public class Recursion1 {
     // Factorial of a number
    static int factorial(int n){
        if(n==0 || n==1) {
            return 1;
        }
        else{
            n=n*factorial(n-1);
            }
        return n;
    }

    //sum of n natural numbers using recursions
    static int sumOfNum(int n) {
        if (n == 0) {
            System.out.println("put number greater than zero");
            return 0;
        } else {
            n = n + sumOfNum(n - 1);
        }
        return n;
    }
    static int fibo(int i) {
        if (i < 0) {
            System.out.println("invalid");
        } else if (i == 0) {
            return 0;
        } else if (i == 1 || i == 2) {
            return 1;
        } else {
            return fibo(i - 1) + fibo(i - 2); // Recursion
        }
        return fibo(i);
    }





    // Recursion
    // Factorial
    public static void main(String[] args) {

//        System.out.println("our factorial is : "+ factorial(4));
        System.out.println("your sum is : " + sumOfNum(3));
        System.out.println(fibo(9));
        System.out.println(sumOfNum(3));




    }
}
