package com.altun.ConditionalStatement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Input validation example

        Scanner userInteraction = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");

        int input = userInteraction.nextInt();

        if (input >= 1 && input <= 10) {
            System.out.println("A valid value has been chosen!");
        }   else {
            System.out.println("The selected value is not between 1 and 10!");
        }
    }
}