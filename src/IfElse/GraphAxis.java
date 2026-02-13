package IfElse;

import java.util.Scanner;

public class GraphAxis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int x = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int y = sc.nextInt();

        if(x==0 && y==0){
            System.out.println("Point is origin.");
        } else if (x>0 && y==0) {
            System.out.println("Point is X axis");
        } else if (x==0 && y>0) {
            System.out.println("Point is Y axis");
        } else if (x>0 && y>0) {
            System.out.println(" Point is 1st Quadrant");
        } else if (x<0 && y>0) {
            System.out.println("Point is 2nd Quadrant");
        } else if (x<0 && y<0) {
            System.out.println("Point is 3rd Quadrant");
        } else if (x>0 && y<0) {
            System.out.println("Point is 4th Quadrant");
        }
    }

}
