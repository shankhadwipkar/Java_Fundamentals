package Pattern;

import java.util.Scanner;

public class AlphabetTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows= sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print((char) (i+64)+" ");
            }
            System.out.println(" ");
        }
    }
}

//Output
//      A
//    B B
//  C C C
//D D D D