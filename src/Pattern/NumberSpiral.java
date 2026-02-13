package Pattern;

import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows= sc.nextInt();
        for(int i=1;i<=2*rows-1;i++){
            for(int j=1;j<=2*rows-1;j++){
                int a=i, b=j;
                if(i>rows) a=2*rows-i;
                if(j>rows) b=2*rows-j;
                System.out.print(Math.min(a,b)+"  ");
            }
            System.out.println(" ");
        }
    }
}
