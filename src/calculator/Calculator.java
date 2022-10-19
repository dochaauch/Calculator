package src.calculator;

import java.util.Scanner;

public class Calculator {
    protected int num1;
    protected int num2;
    protected String operation;

    double getResult(int num1, int num2, String operation) {
        switch (operation){
            case "+" -> {
                return num1 + num2;
            }
            case "-" -> {
                return num1 - num2;
            }
            case "/" -> {
                return num1 / num2;
            }
            case "*" -> {
                return num1 * num2;
            }
            default -> {
                System.out.println("Операция не найдена");
                return  0;
            }
        }
    }

    public void inputOutput() {
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое целое число: ");
            int num1 = scanner.nextInt();
            System.out.println("Введите знак операции (+-*/): ");
            String operation = scanner.next();
            System.out.println("Введите второе целое число: ");
            int num2 = scanner.nextInt();
            System.out.println(num1 + " " + operation + " " + num2 + " = " + getResult(num1, num2, operation));
            System.out.println("Закончить программу? Нажмиже 'y', если да, иначе любую другую букву");
            char checkPoint = scanner.next().charAt(0);
            if (checkPoint == 'y') {
                flag = false;
            }
        }
    }
}