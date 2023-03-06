import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
       // there are 3 methods of declare an array

//        int [] marks = new int [5];
//        marks [0]=30;

//        2nd way is_

//        int [] marks={12,34,56,78};
//        System.out.println(marks[0]);

//        String [] Students ={"mayukh","papia","debrup","debayan","arjo"};
//        System.out.println(Students.length);

        // array length

//        int [] marks={12,34,56,78};
//        System.out.println(marks.length);

        //problem{ array in reverse order}(this is using for loop)

//        int [] marks={12,34,56,78};
//        for(int i= marks.length-1;i>=0;i--){
//            System.out.println(marks[i]);
//        }

        // for-each loop to print all the elements of array

//        int [] marks={12,34,56,78};
//        for (int i: marks){
//            System.out.print(i +" ");
//        }

        // Multidimensional Array
        // 2-D Array

//        int [][] marks=new int[2][3];
//        marks[0][0]=12;
//        marks[0][1]=13;
//        marks[0][2]=14;
//        marks[1][0]=22;
//        marks[1][1]=23;
//        marks[1][2]=24;
//
//        for(int i =0 ; i<= marks.length;i++){
//            for(int j =0; j< marks[i].length; j++){
//                System.out.print(marks[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }

        // problem 1 {sum of the element in array}
//        float [] nums = {1.2f,3.4f,5.6f,1.7f,4.5f};
//        float sum=0;
//        for (int p=0 ; p<=nums.length-1;p++ ){
//            sum=sum+nums[p];
//        }
//        System.out.println("sum of elements is array is : " + sum);

        // problem 2{ either your element is present or not}

//        int p= 12;
//        int [] marks ={14,15,12,17,18,19};
//        for (int i =0; i<=marks.length-1;i++){
//            if(marks[i]==p){
//                System.out.println(" your number is present ");
//            }
//        }

        // Another Method is using for each loop
//        int p= 12;
//        int [] marks ={14,15,12,17,18,19};
//        boolean isArray=false;
//        for(int e:marks){
//            if(e==p){
//                isArray=true;
//                break;
//            }
//        }
//        if(isArray){
//            System.out.println("your number is present");
//        }
//        else {
//            System.out.println(" your number is not present");
//        }

        // problem 3 {calculate avg of an array elements }

//        float [] marks ={14,15,12,17,18,19};
//        float sum=0;
//        for (float e : marks){
//            sum=sum+e;
//        }
//        System.out.println("Avg is : " + sum/(marks.length));
//        System.out.println("sum is : " + sum);

        // problem 4 {reverse a Array}

//        int [] marks ={14,15,12,17,18,19};
//        for(int i = marks.length-1 ; i>=0 ;i--){
//            System.out.print(marks[i] + " ");
//        }

        // problem 5 {max element in an array}

//        int [] marks ={14,15,12,17,27,18,19};
//        int max=0;
//        for (int e : marks ){
//            if(e>max){
//                max=e;
//            }
//        }
//        System.out.println("max of that array " + max);
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);

        // problem 6{min of an array}
//
//        int [] marks ={14,15,12,17,27,18,19};
//        int min=Integer.MAX_VALUE;
//        for(int e: marks){
//            if(e<min){
//                min=e;
//            }
//        }
//        System.out.println("min is "+ min);

        // Problem 7 (either an array sorted or not)

//        int [] marks ={14,15,16,17,27,28,29};
//        boolean isSorted = true;
//        for(int i=0; i<marks.length-1;i++){
//            if(marks[i]>marks[i+1]){
//                isSorted=false;
//                break;
//            }
//        }
//        if(isSorted){
//            System.out.println("array is sorted");
//        }
//        else {
//            System.out.println("array is not sorted");
//        }

        // Problem 8

//        int [][] m1 ={ {1,2,3},
//                       {5,6,7}  };
//        int [][] m2 = { {7,8,9},
//                       {10,11,12}};
//        int [][] sum= {{0,0,0},
//                        {0,0,0}  };
//        for(int i=0; i<m1.length;i++){
//            for (int j=0;j<m1[i].length;j++){
//                sum[i][j]=m1[i][j]+m2[i][j];
//                System.out.print(sum[i][j] +" ");
//            }
//            System.out.println("");
//        }



    }
}
