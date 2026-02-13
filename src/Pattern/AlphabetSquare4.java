package Pattern;

import java.util.Scanner;

public class AlphabetSquare4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows= sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
                if(i%2==1)
                System.out.print((char)(i+96)+" ");
                else
                    System.out.print((char)(i+64)+" ");
            }
            System.out.println(" ");
        }
    }
}

//Output
//a a a a
//B B B B
//c c c c
//D D D D
