import java.util.Scanner;
import  java.util.Random;
public class ifelse1 {
    public static void main(String[] args) {

        // Switch case in java

        /*Scanner sc= new Scanner(System.in);
        System.out.println("enter your age");
        int i= sc.nextInt();
        switch (i){
            case 18:
                System.out.println("going to become an adult");
                break; // break or terminate a block
            case 22:
                System.out.println("you are going to join your job");
                break;
            case 60:
                System.out.println("you are going to retire from your job");
                break;
            default:
                System.out.println("Enjoy your life");
            }*/

        /*char var='t';

        switch (var) {
            case 'g':
                System.out.println("going to become an adult");
                break; // break or terminate a block
            case 't':
                System.out.println("you are going to join your job");
                break;
            case 'k':
                System.out.println("you are going to retire from your job");
                break;
            default:
                System.out.println("Enjoy your life");
        } */

        // Enhance Switch in java

        /*char var='t';
        switch (var) {
            case 'g' -> System.out.println("going to become an adult");
            case 't' -> System.out.println("you are going to join your job");
            case 'k' -> System.out.println("you are going to retire from your job");
            default -> System.out.println("Enjoy your life");
        } */

        // example 1

      /*  Scanner sc = new Scanner(System.in);
        System.out.println("your total number for each subject is 100");
        System.out.println("enter your 1st subject marks");
        float b= sc.nextFloat();
        System.out.println("enter your 2nd subject marks");
        float e= sc.nextFloat();
        System.out.println("enter your 3rd subject marks");
        float s=sc.nextFloat();
        float t;
        t=b+e+s;
        t=t*(1/3);
        if ((b>=33) && (e>=33) && (s>=33) && (t>=40)){
            System.out.println("you are passed");
        }
        else{
            System.out.println("failed");
        } */

        // example 2 (confirm your website)

       /* Scanner sc= new Scanner(System.in);
        System.out.println("enter your website name");
        String s= sc.nextLine();
        if (s.endsWith(".com")){
            System.out.println("it's a commercial website");
        } else if (s.endsWith(".in")) {
            System.out.println("it's an Indian website");
        } else if (s.endsWith(".org")) {
            System.out.println("it's an organizational website");
        }
        else {
            System.out.println("you have a different one");
        } */

        // rock, paper and Scissor game in java vs computer

       Scanner sc= new Scanner(System.in);
        System.out.println("enter your input \n 0:rock \n 1:paper \n 2:scissor");
        int yi=sc.nextInt();

        Random ran= new Random();
        int ci=ran.nextInt(3);

        if(yi==ci){
            System.out.println("draw");
        }
        else if (yi==0 && ci==2 || yi==1 && ci==0 || yi==2 && ci==1 ) {
            System.out.println("Congratulations you won");
        }
        else {
            System.out.println("computer won");
        }
        System.out.println("computer input was " + ci);
        System.out.println("you have chosen " + yi);
        if (ci==0){
            System.out.println("computer choose rock");
        } else if (ci==1) {
            System.out.println("computer choose paper");
        } else if (ci==2) {
            System.out.println("computer choose scissor");
        }

        // Check either your input is an alphabet or not

//        Scanner sc= new Scanner(System.in);
//        System.out.println("enter your char ");
//        char c=sc.next().charAt(0); //  character at that position
//        if ((c>='a' && c<='z')||(c>='A' && c<='Z')){
//            System.out.println("this is a alphabet");
//        }
//        else {
//            System.out.println(" this is not an alphabet");
//        }

        // Vowel or not

//        char p='I';
//        if(p =='a' || p =='e' || p=='i' || p=='o' || p=='u' || p =='A' || p =='E' || p=='I' || p=='O' || p=='U'  ){ //Java is a Case Sensitive language
//            System.out.println("this Is A  Vowel");
//        }
//        else{
//            System.out.println("this is a consonant");
//        }

        // CALCULATE POWER OF EXPRESSION

        /*int base=3; int exp=4;
        int result=1;
        while (exp>0){
            result=result*base;
            exp--;
        }
        System.out.println("the result is " +result);*/






    }
}
