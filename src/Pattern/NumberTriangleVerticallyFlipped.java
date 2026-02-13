package Pattern;

import java.util.Scanner;

public class NumberTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows= sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}

//Output
//      1
//    1 2
//  1 2 3
//1 2 3 4
