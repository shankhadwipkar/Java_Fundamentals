package Loops;

import java.util.Scanner;

public class APSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
//        for(int i=2;i<=20;i+=3){
//            System.out.print(i+" ");
//    }

//        for(int i=2;i<=3*n-1;i+=3){
//            System.out.print(i+" ");
//    }

        int a=2,d=3;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a+=d;
        }
    }
}
