package basics;

import java.util.Scanner;

public class Scannerinput {
    public static void main(String[] args) {
        int a,b,c,avg,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sum = a+b+c;
        System.out.println(sum);
        avg = a+b+c/3;
        System.out.println(avg);
        if(a>35 && b<35 && c<35 && avg>40){
            System.out.println("you are pass");
        }
        else{
            System.out.println("you are fail");
        }

        //math =2 ; int phy =9; int chem =10;      //(a+b+c)/3
        int math =2 ; int phy =9; int chem =10;
        int avg1 = (math+phy+chem)/3;               //2,9,10= 2+9+10= 21/3
        //if the avrage is greATER than 5 he is passed othrwise he is failed
        if(avg>5){
            System.out.println("passed");
        }
        else{
            System.out.println("failed");
        }


    }
}


