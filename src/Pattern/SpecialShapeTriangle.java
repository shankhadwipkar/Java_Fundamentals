package Pattern;

import java.util.Scanner;

public class SpecialShapeTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows = sc.nextInt();
//Without Math
        int nsp = 0, nst = rows;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print(" * ");
            }
            nsp++;
            nst--;
            System.out.println(" ");
        }
    }
}
