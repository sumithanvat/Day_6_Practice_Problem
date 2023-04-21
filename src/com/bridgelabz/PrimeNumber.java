package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = input.nextInt();
        boolean isprime = true;
             if (n<2){
            isprime = false;
        }
                for (int i = 2;i<n;i++){
                    if (n%i==0){
                        isprime = false;
                        break;
                    }
                  }
                if (isprime){
                    System.out.println("given number is prime");
                }
                else {
                    System.out.println("given number is not a prime");
                }
    }
}
