import  java.util.Scanner;
public class patterns1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number of digit");
        int n = sc.nextInt();

        // pattern 1

//        for (int i = 1; i <= n; i++) {
//            System.out.print("* ");
//        }

        // pattern 2
//         for (int i=1 ; i<=n ; i++){
//            for (int j =1; j<=n ; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Pattern 3

//         for (int i=1 ; i<=n ; i++){
//            for (int j =1; j<=i ; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // pattern 4

//         for (int i=1 ; i<=n ; i++){
//            for (int j =i; j<=n ; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Pattern 5

//        for (int i=1 ; i<=n ; i++){
//            for (int j =i+1; j<=n ; j++){
//                System.out.print("  ");
//            }
//            for (int j=1; j<=i ; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // pattern 6

//        for (int i=1 ; i<=n ; i++){
//            for (int j =1; j<=i-1 ; j++){
//                System.out.print("  ");
//            }
//            for (int j=i; j<=n ; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // pattern 7

//        for (int i=1 ; i<=n ; i++){
//            for (int j =i+1; j<=n ; j++){
//                System.out.print("  ");
//            }
//            for (int j=1; j<i ; j++){
//                System.out.print("* ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // pattern 8


        /* for (int i=1 ; i<=n ; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        } */

        // Pattern 9

       /* for (int i=1 ; i<n ; i++){
            for (int j =i+1; j<=n ; j++){
                System.out.print("  ");
            }
            for (int j=1; j<i ; j++){
                System.out.print("* ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i=1 ; i<=n ; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }  */

        // pattern 10

         /* for (int i=1 ; i<=n ; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=2 ; i<=n ; i++){
            for (int j =i+1; j<=n ; j++){
                System.out.print("  ");
            }
            for (int j=1; j<i ; j++){
                System.out.print("* ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        } */



    }
}
