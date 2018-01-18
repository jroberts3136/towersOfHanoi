package com.company;

//import java.util.InputMismatchException;
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
        //int temp;
        int diskNum = keyInput.nextInt();
        /*boolean validDisk = false;
        while(!validDisk) {
            try {
                temp = keyInput.nextInt();
                if (temp > 0) {
                    diskNum = temp;
                    validDisk = true;
                }
                else{
                    System.out.println("The number of disks must be a positive number.");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("You must enter the number of disks in number form.");
            }
            finally {
                diskNum = 3;
            }
        }
        */
        Tower hanoi = new Tower();
        hanoi.solve(diskNum, tower1, tower2, tower3);
    }
}