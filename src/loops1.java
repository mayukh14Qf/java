import java.util.Scanner;
public class loops1 {
    public static void main(String[] args) {

        // simple example of while loop

       /* int i =1;
        while (i<=3){
            System.out.println(i);
            i++;
        }*/

        //  infinite while loop

        /* while(true){
            System.out.println("mayukhjit chakraborty");
        } */

//         DO- WHILE LOOP

//        int b=0;
//        do {
//            System.out.println(b);
//            b++;
//        } while (b<5);

//        int b=10;
//        do {
//            System.out.println(b);    // no need to learn do while
//            b++;
//        } while (b<5);

        //FOR loop

        // print 1st n odd numbers
        // odd (2n+1)
        // even 2n

//        int n=10;
//        for (int i=1; i<=n ; i++){
//            if (i%2!=0){
//                System.out.println(i);
//            }
//        }

        //  Break Statement

//        for(int i =0; i<5 ; i++){
//            System.out.println(i);
//            System.out.println("java is great");
//            if (i==2){
//                System.out.println("ending the loop");
//                break; // break out or terminate from the loop whether the condition is true or false
//            }
//            System.out.println("loop ends here");
//        }

        // Continue Statement

//        for(int i =0; i<5 ; i++){
//            if (i==2){
//                System.out.println("ending the loop");
//               continue; // skip that particular iteration
//            }
//            System.out.println(i);
//            System.out.println("java is great");
//
//        }

        // Practice set
        // Problem 1 {print that pattern}

//        int n = 4;
//        for (int i=1 ; i<=n; i++){
//            for(int j=i; j<=n;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Problem 2 {sum of n even number using while loop}

//        int n =10;
//        int sum=0;
//        while (n>0){
//            if(n%2==0){
//                sum=sum+n;
//            }
//            n--;
//        }
//        System.out.println("sum is : " +sum);

        //Problem 3 {Multiplication table of a number}

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your number or digit");
//        int n= sc.nextInt();
//        for(int i=1 ; i<=10 ;i++){
//            System.out.println(i + " x " +n +" = " + (i*n)) ;
//        }

        // Problem 4 {Multiplication table of 10 in reverse order}

//        int n= 10;
//        for(int i=10 ; i>0 ;i--){
//            System.out.println(i + " x " +n +" = " + (i*n)) ;
//        }

        //problem 5 { Factorial of a number }

//        Scanner sc= new Scanner(System.in);
//        System.out.println("enter your number");
//        int num = sc.nextInt();
//        int i =1;
//        while (num>0){
//            i=i*num;
//            num--;
//        }
//        System.out.println("your factorial is: " + i);

        // Problem 6 {sum of the multiplication digit}

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your number or digit");
//        int n= sc.nextInt();
//        for(int i=1 ; i<=10 ;i++){
//            System.out.println(i + " x " +n +" = " + (i*n)) ;
//        }
//        int sum=0;
//        int p=1;
//        while (p<=10){
//            sum=sum+(p*n);
//            p++;
//        }
//        System.out.println("sum of all multiplications: " +sum );

        // A do while executes at least once (*****)

        // problem 7 {sum of n even number using for loop}

//        int n = 10;
//        int sum =0;
//        for(int i=0; i<=n ; i++){
//            if(i%2==0){
//                sum=sum+i;
//            }
//        }
//        System.out.println("your sum of is :" +sum);

    }
}
