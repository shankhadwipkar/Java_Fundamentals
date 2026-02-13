package Pattern;

import java.util.Scanner;

public class SpecialShapeStarCross {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int n= sc.nextInt();
//        System.out.print("Enter the columns: ");
//        int columns= sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j || i+j==n+1)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}

//Output
// *           *
//    *     *
//       *
//    *     *
// *           *