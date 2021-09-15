package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num =1;
    while(num==1) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of dice [X] and the number of sides [Y], in the format XdY:");
        String dieSides = input.nextLine();
        String dies[]= dieSides.split("d");
        int total = 0, die1,side;

        die1=Integer.parseInt(dies[0]);
        side=Integer.parseInt(dies[1]);
        int[] dice = new int[die1];

        for (int i = 0; i < die1; i++) {
            Random rand = new Random();
            dice[i] = rand.nextInt(side) + 1;
        }
        String msg = "";
        for(int j=0;j<dice.length;j++)
        {
            msg = "You rolled a " + dice[j];
            System.out.println(msg);
            total += dice[j];
        }
        System.out.println("Your total " + total);

        Scanner input1 = new Scanner(System.in);
        System.out.println("Do you want to continue rolling dice? Enter 1 = yes  0 = no:");
        num = input1.nextInt();

    }
    }
}
