package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int n = input.nextInt();
        int sum = 0;
        for (int i=1;i<n;i++){
            if (n % i == 0){
                sum += i;
            }
        }
        if ( sum ==n){
            System.out.println("The given number is perfect number");
        }
        else{
            System.out.println("given number is not a perfect number");
        }

    }
}
