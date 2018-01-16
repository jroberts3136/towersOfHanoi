package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyInput = new Scanner(System.in);
        Tower myTower;

        System.out.println("Towers of Hanoi\n" +
                "This program will solve the puzzle for you.\n" +
                "Please enter the number of disks:");
        try{
             myTower = new Tower(keyInput.nextInt());
        }
        catch (InputMismatchException e){
            System.out.println("You must enter an integer number of disks.");

        }


    }

}