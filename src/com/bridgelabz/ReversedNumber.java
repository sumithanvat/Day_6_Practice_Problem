package com.bridgelabz;

import java.util.Scanner;

public class ReversedNumber {
// main method started
    public static void main(String[] args) {

        // taking user input by scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number which you want to reverse");

        int number = input.nextInt();
        int reversedNumber=0;

        // using while loop till number = 0

        while (number != 0){
            int remander = number % 10;
            reversedNumber = reversedNumber * 10 + remander;
            number = number / 10;

        }
        System.out.println("reversed number is :-"+reversedNumber);


    }
}
