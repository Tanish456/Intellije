package basics;

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        System.out.println("TAking the no.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int a =sc.nextInt();
        System.out.println("enter the no. ");
        int b =sc.nextInt();
        System.out.println("enter the no.");
        int c =sc.nextInt();
        System.out.println("enter the no.");
        int d= sc.nextInt();
        int sum = a+b+c+d;
        int percent= ((a+b+c+d)/4)*100;
        System.out.println("percentage is");
        System.out.println(percent);
    }
}


