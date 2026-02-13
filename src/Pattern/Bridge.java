package Pattern;

import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows= sc.nextInt();
        for(int i=1;i<=2*rows-1;i++){
            System.out.print(" * ");
        }
        System.out.println();
        int nsp=1;
        for(int i=1;i<=rows-1;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" * ");
            }
            for(int j=1;j<=nsp;j++){
                System.out.print("   ");
            }
            for(int j=1;j<=rows-i;j++){
                System.out.print(" * ");
            }
            nsp+=2;
            System.out.println(" ");
        }
    }
}
