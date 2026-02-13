package Pattern;

import java.util.Scanner;

public class AlphabetSquare3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows = sc.nextInt();

        for (int i = 65; i <= rows; i++) {
            for (int j = 65; j <= rows; j++) {
                System.out.print((char) (i) + " ");
            }
            System.out.println(" ");
        }
    }
}

//Output
//A A A A
//B B B B
//C C C C
//D D D D