package IfElse;

import java.util.Scanner;

public class IntegerorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        double n = sc.nextDouble();
        int x = (int)n; //typecasting double to integer
//        if(n-x > 0){
//            System.out.println("Not integer");
//        }else{
//            System.out.println("Integer");
//        }
        if(n==x){
            System.out.println("Integer");
        }else{
            System.out.println("Not integer");
        }
    }
}
