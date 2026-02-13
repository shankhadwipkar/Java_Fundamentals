package Pattern;

import java.util.Scanner;

public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows= sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println(" ");
        }
    }
}

//Output
//A B C D
//A B C D
//A B C D
//A B C D