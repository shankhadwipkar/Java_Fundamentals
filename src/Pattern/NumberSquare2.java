package Pattern;

import java.util.Scanner;

public class NumberSquare2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows= sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }
}

//   Output
//        1 1 1 1
//        2 2 2 2
//        3 3 3 3
//        4 4 4 4
