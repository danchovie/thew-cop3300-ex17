/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Thew
 */
package com.ex17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final double legal = 0.08;
	    Scanner newScanner = new Scanner(System.in);
        int gender, weight, oz, hours;
        double bac, ratio;
        System.out.print("Enter a 1 if you are male of a 2 if you are female: ");
        gender = newScanner.nextInt();
        System.out.print("How many ounces of alcohol did you have? ");
        oz = newScanner.nextInt();
        System.out.print("What is your weight, in pounds? ");
        weight = newScanner.nextInt();
        System.out.print("How many hours has it been since your last drink? ");
        hours = newScanner.nextInt();
        if(gender==1){
            ratio = 0.73;
        }
        else{
            ratio = 0.66;
        }
        bac = (oz*5.14/weight*ratio)-0.015*hours;
        if(bac<=legal){
            System.out.printf("Your BAC is %f.\nIt is legal for you to drive.", bac);
        }
        else{
            System.out.printf("Your BAC is %f.\nIt is not legal for you to drive.", bac);
        }
    }
}
