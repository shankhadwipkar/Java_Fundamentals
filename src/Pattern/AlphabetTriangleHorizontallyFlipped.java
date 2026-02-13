package Pattern;

import java.util.Scanner;

public class AlphabetTriangleHorizontallyFlipped {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows= sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows+1-i;j++){
                System.out.print((char)(j+96)+" ");
            }
//            for (int j=rows;j>=i;j--){
//                System.out.print(j+" ");
//            }
            System.out.println(" ");
        }
    }
}

//Output
//a b c d
//a b c
//a b
//a