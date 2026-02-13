package Pattern;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows= sc.nextInt();
        System.out.print("Enter the columns: ");
        int columns= sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=columns;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}

//Output
// *  *  *
// *  *  *
// *  *  *
// *  *  *