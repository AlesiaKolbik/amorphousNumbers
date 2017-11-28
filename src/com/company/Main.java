package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Введите натуральное число: ");
        int counter = input.nextInt();     //колличество чисел,которые надо распечатать
        int number = 1;
        while (1 <= counter) {
            if (isAmorphousNumber(number)) {
                System.out.println(number + " ");
                counter--;
            }
            number++;
        }
    }

    public static boolean isAmorphousNumber(int number) {
        int numberToPowTwo = (int) Math.pow(number, 2);
        String inputNumber = String.valueOf(number);
        String translateNumberToString = String.valueOf(numberToPowTwo);
        boolean nextDigits = translateNumberToString.endsWith(inputNumber);
        return nextDigits;
    }
}
