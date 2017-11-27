package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Введите натуральное число: ");
        int quantityOfNumbers = input.nextInt();     //колличество чисел,которые надо распечатать
        for (int i = 1; ; i++) {
            if (isAmorphousumberNumber(i)) {
                while (1 <= quantityOfNumbers) {
                    System.out.println(i + " ");
                    quantityOfNumbers--;
                    break;
                }
            }
        }
    }

    public static boolean isAmorphousumberNumber(int number) {
        int numberToPowTwo = (int) Math.pow(number, 2);
        String inputNumber = String.valueOf(number);
        String translateNumberToString = String.valueOf(numberToPowTwo);
        boolean nextDigits = translateNumberToString.endsWith(inputNumber);
        return nextDigits;
    }
}
