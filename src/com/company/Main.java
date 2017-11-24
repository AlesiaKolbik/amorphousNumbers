package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Введите натуральное число: ");
        int amountOfNumbers = input.nextInt();
            for (int i = 1; ; i++) {
                if (numberIsAmorphous(i)) {
                    while(1<=amountOfNumbers){
                    System.out.println(i + " ");
                    amountOfNumbers--;
                    break;
                }
            }
        }
    }
    public static boolean numberIsAmorphous (int number) {
        int numberToPowTwo= (int)Math.pow(number,2);
        String inputNumber=String.valueOf(number);
        String translateNumberToString=String.valueOf(numberToPowTwo);
        boolean nextDigits=translateNumberToString.endsWith(inputNumber);
        return nextDigits;
    }
}
