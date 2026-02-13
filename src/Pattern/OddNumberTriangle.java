package Pattern;

import java.util.Scanner;

public class OddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows= sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(2*j-1+" ");
            }
            System.out.println(" ");
        }
    }
}

//Output
//1
//1 3
//1 3 5
//1 3 5 7