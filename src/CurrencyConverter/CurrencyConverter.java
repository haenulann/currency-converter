package CurrencyConverter;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        double amt, currency, dollar, pound, euro, yen, ringgit, rupee;

        //format decimal number
        DecimalFormat f = new DecimalFormat("##.##");

        Scanner input = new Scanner(System.in);

        System.out.println("Hello, Welcome to the Currency Converter ");

        System.out.println("Which currency do you wish to convert? ");

        System.out.println("1: Rupee \t2:Dollar \t3:Pound \t4:Euro \t5:Yen \t6:Ringgit ");
        currency = input.nextInt();

        System.out.println("Please enter the amount of money you are converting: ");
        amt = input.nextFloat();

        //Rupee Conversion
        if (currency == 1) {
            dollar = amt / 70;
            System.out.println("Your " + amt + " Rupee is : " + f.format(dollar) + " Dollar ");

            pound = amt / 88;
            System.out.println("Your " + amt + " Rupee is : " + f.format(pound) + " Pound ");

            euro = amt / 80;
            System.out.println("Your " + amt + " Rupee is : " + f.format(euro) + " Euro ");

            yen = amt / 0.63;
            System.out.println("Your " + amt + " Rupee is : " + f.format(yen) + " Yen ");

            ringgit = amt / 16;
            System.out.println("Your " + amt + " Rupee is : " + f.format(ringgit) + " Ringgit ");

        }else if (currency == 2) {
        //Dollar Conversion
            rupee = amt * 70;
            System.out.println("Your " + amt + " Dollar is : " + f.format(rupee) + " Rupees ");

            pound = amt * 0.78;
            System.out.println("Your " + amt + " Dollar is : " + f.format(pound) + " Pound");

            euro = amt * 0.87;
            System.out.println("Your " + amt + " Dollar is : " + f.format(euro) + " Euro ");

            yen = amt * 111.087;
            System.out.println("Your " + amt + " Dollar is : " + f.format(yen) + " Yen ");

            ringgit = amt * 4.17;
            System.out.println("Your " + amt + " Dollar is : " + f.format(ringgit) + " Ringgit ");

        }else if (currency == 3) {
        //Pound Conversion
            rupee = amt * 88;
            System.out.println("Your " + amt + " Pound is : " + f.format(rupee) + " Rupee ");

            dollar = amt * 1.26;
            System.out.println("Your " + amt + " Pound is : " + f.format(dollar) + " Dollar ");

            euro = amt * 1.10;
            System.out.println("Your " + amt + " Pound is : " + f.format(euro) + " Euro ");

            yen = amt * 140.93;
            System.out.println("Your " + amt + " Pound is : " + f.format(yen) + " Yen ");

            ringgit = amt * 5.29;
            System.out.println("Your " + amt + " Pound is : " + f.format(ringgit) + " Ringgit ");

        }else if (currency == 4) {
        //Euro Conversion
            rupee = amt * 80;
            System.out.println("Your " + amt + " Euro is : " + f.format(rupee) + " Rupee ");

            dollar = amt * 1.14;
            System.out.println("Your " + amt + " Euro is : " + f.format(dollar) + " Dollar ");

            pound = amt * 0.90;
            System.out.println("Your " + amt + " Euro is : " + f.format(pound) + " Pound ");

            yen = amt * 127.32;
            System.out.println("Your " + amt + " Euro is : " + f.format(yen) + " Yen ");

            ringgit = amt * 4.78;
            System.out.println("Your " + amt + " Euro is : " + f.format(ringgit) + " Ringgit ");

        }else if (currency == 5) {
        //Yen Converter
            rupee = amt * 0.63;
            System.out.println("Your " + amt + " Yen is : " + f.format(rupee) + " Rupee ");

            dollar = amt * 0.008;
            System.out.println("Your " + amt + " Yen is : " + f.format(dollar) + " Dollar ");

            pound = amt * 0.007;
            System.out.println("Your " + amt + " Yen is : " + f.format(pound) + " Pound ");

            euro = amt * 0.007;
            System.out.println("Your " + amt + " Yen is : " + f.format(euro) + " Euro ");

            ringgit = amt * 0.037;
            System.out.println("Your " + amt + " Yen is : " + f.format(ringgit) + " Ringgit ");

        }else if (currency == 6) {
        //Ringgit Conversion
            rupee = amt * 16.8;
            System.out.println("Your " + amt + " Ringgit is : " + f.format(rupee) + " Rupee ");

            dollar = amt * 0.239;
            System.out.println("Your " + amt + " Ringgit is : " + f.format(dollar) + " Dollar ");

            pound = amt * 0.188;
            System.out.println("Your " + amt + " Ringgit is : " + f.format(pound) + " Pound ");

            euro = amt * 0.209;
            System.out.println("Your " + amt + " Ringgit is : " + f.format(euro) + " Euro ");

            yen = amt * 26.63;
            System.out.println("Your " + amt + " Ringgit is : " + f.format(yen) + " Yen ");

        }else {
            System.out.println("Invalid Input");
        }
        System.out.println("Thank you for using our Currency Converter");
    }
}
