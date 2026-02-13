package Pattern;

import java.util.Scanner;

public class AlphabetSquare2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows= sc.nextInt();

        for(int i=65;i<=rows;i++){
            for(int j=65;j<=rows;j++){
                System.out.print((char)(j)+" ");
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