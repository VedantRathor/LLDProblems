package com.cloudvendor.cloudvendor.DesignPatterns.StrategyDP;

import java.util.Scanner;

public class Main {
    public static void main(String varchar[]) {
        System.out.println("running from CLI");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("ENter you mobile number");
        long mobileNumber = sc.nextLong();

        System.out.println("1. Print; 2. Exit");
        int press = sc.nextInt();

        if (press == 1) {
          System.out.println("Your name is: " + name);
          System.out.println("Your mobile number is: " + mobileNumber);
        }
    }
}
