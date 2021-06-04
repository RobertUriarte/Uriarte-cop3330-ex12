/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Robert Uriarte
 */
import java.util.Scanner;
public class Exercise12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double principal = scan.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = scan.nextDouble();
        System.out.print("Enter the number of years: ");
        double years = scan.nextDouble();
        double simple_interest = (principal*(1+(rate/100) * years));
        System.out.printf("After %.0f years at %.2f percent, the investment will be worth $%.2f" ,years,rate,simple_interest);
    }
}