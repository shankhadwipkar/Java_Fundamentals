package Pattern;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows= sc.nextInt();
//With math
//        for(int i=1;i<=rows;i++){
//            for(int j=1;j<=rows-i;j++){
//                System.out.print("   ");
//            }
//            for(int j=1;j<=2*i-1;j++){
//                System.out.print(" * ");
//            }
//            System.out.println(" ");
//        }
//        Without Math
        int nsp=rows-1, nst=1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("   ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print(" * ");
            }
            nsp--;
            nst+=2;
            System.out.println(" ");
        }
    }
}
