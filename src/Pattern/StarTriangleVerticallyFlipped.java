package Pattern;

import java.util.Scanner;

public class StarTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows= sc.nextInt();
//Considering this is a square
//        for(int i=1;i<=rows;i++){
//            for(int j=1;j<=rows;j++){
//                if((i+j)>rows)
//                    System.out.print(" * ");
//                else
//                    System.out.print("   ");
//            }
//            System.out.println(" ");
//        }

//Considering this is a triangle
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                    System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}

//Output
//         *
//      *  *
//   *  *  *
//*  *  *  *