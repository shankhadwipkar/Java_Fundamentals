package Loops;

import java.util.Scanner;

public class SumofDigitsandReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

//        int sum=0;
//        int rev=0;
//        while (n!=0){
//            int digit=n%10;
//            sum+= digit;
//            rev*=10+digit;
//            n/=10;
//        }
//        System.out.println("The sum of number: "+sum+" "+"Reverse number is: "+rev);

        int sum=0;
        int rev=0;

        while(n!=0){
            sum+= n%10;
            rev*=10+sum;
            n/=10;
            sum+=rev;
        }
        System.out.println("The sum of number: "+sum+" "+"Reverse number is: "+rev);
    }
}
