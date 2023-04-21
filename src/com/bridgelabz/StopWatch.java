package com.bridgelabz;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        // taking input to start stopwatch
        Scanner input = new Scanner(System.in);
        System.out.println("Press enter to start stopwatch");
        input.nextLine();
        // giving value of startTime
        double startTime = System.currentTimeMillis();

        System.out.println("enter to stop stopWatch");
        input.nextLine();

        double endTime = System.currentTimeMillis();

        double elapsedTime = endTime - startTime;

        System.out.println(elapsedTime +"   milliSecond");



    }
}
