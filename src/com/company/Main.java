package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyInput = new Scanner(System.in);

        System.out.println("Towers of Hanoi\n" +
                "This program will solve the puzzle for you.\n" +
                "Please enter the number of disks:");

        String tower1 = "1";
        String tower2 = "2";
        String tower3 = "3";
        int diskNum = keyInput.nextInt();

        Tower hanoi = new Tower();
        hanoi.solve(diskNum, tower1, tower2, tower3);
    }
}