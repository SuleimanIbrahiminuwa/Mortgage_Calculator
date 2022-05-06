package org.example;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Principal = 0;
        int numberOfPayment = 0;
        float monthlyInterest = 0;

        while (true){
            System.out.print("Principal ($1k - $1M): ");
            Principal = scanner.nextInt();
            if (Principal >=  1000 && Principal <= 1_000_000)
                break;
            System.out.println("Enter a Value greater than 1000 and less than or equal to 1_000_000");
        }

        while (true) {
            System.out.print("Annual Interest Rate: " );
            float Rate = scanner.nextFloat();
            if (Rate >= 1 && Rate <=30) {
                monthlyInterest = Rate / 100 / 12;
                break;
            }
            System.out.println("Enter a Value Greater than 0 and less than or equal to 30");
        }
        while (true) {
            System.out.print("Period: ");
            byte Time = scanner.nextByte();
            if (Time >=1 && Time <= 30) {
                numberOfPayment = Time * 12;
                break;
            }
            System.out.println("Enter a Value Greater than 0 and less than or equal to 30");

        }

        double interest = Principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayment)) / (Math.pow(1 + monthlyInterest, numberOfPayment) -1);
        String Mortgage = NumberFormat.getCurrencyInstance().format(interest);
        System.out.println("Mortgage: " + Mortgage);
    }
}