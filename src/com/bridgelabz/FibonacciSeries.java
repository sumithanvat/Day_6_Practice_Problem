package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of term");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("fibonacci series upto " +n + "number is ");

        for (int i=1;i<n;i++){
            System.out.println(a + " ");
            int sum = a + b;
            a=b;
            b=sum;

        }



    }
}
