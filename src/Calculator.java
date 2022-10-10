package src;

import java.util.Scanner;

public class Calculator {
    int firstValue;
    int secondValue;
    static int result;

    private static void GetSum(int firstValue, int secondValue){
        result = firstValue + secondValue;
    }

    private static void GetDiff(int firstValue, int secondValue){
        result = firstValue - secondValue;
    }

    private static void GetMult(int firstValue, int secondValue){
        result =  firstValue * secondValue;
    }

    private static void GetDiv(int firstValue, int secondValue){
        result  = firstValue / secondValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int firstValue = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int secondValue = scanner.nextInt();
        System.out.println("Введите операцию действия: ");
    }
}
