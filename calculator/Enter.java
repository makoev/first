package calculator;

import java.util.Scanner;

public class Enter {
    boolean isRome;
    char operation;
    int number1;
    int number2;

    void readForConsole() {
        System.out.println("Введите арифметическую операцию в сторку через пробел (1 + 2 или VI / III )");
        Transformation transformation = new Transformation();
        Scanner scanner = new Scanner(System.in);
        String readConsole;
        readConsole = scanner.nextLine();
        System.out.println("Вы ввели : " + readConsole);
        String[] expression = readConsole.split(" ");
        operation = getOperation(expression[1]);

        if (isCorrectly(expression[0]) & isCorrectly(expression[2])){
            if ((isArab(expression[0])) & (isArab(expression[2]))) {
                number1 = Integer.parseInt(expression[0]);
                number2 = Integer.parseInt(expression[2]);
            }

            if ((isRome(expression[0])) & (isRome(expression[2]))) {
                number1 = transformation.romeConversionArab(expression[0]);
                number2 = transformation.romeConversionArab(expression[2]);
                isRome = true;
            }
        }else {
            throw new IllegalStateException("Unexpected variables (Калькулятор умеет работать на ввод только с числа от 1 до 10 включительно)");
        }

        if (((isArab(expression[0])) & (isRome(expression[2]))) | ((isArab(expression[2])) & (isRome(expression[0])))) {
            throw new IllegalStateException("Unexpected variables (Калькулятор умеет работать только с арабскими или римскими цифрами одновременно )");
        }
    }

    boolean isArab(String string) {
        if (string == null) return false;
        return string.matches("[1-9]|10");
    }

    boolean isRome(String string) {
        if (string == null) return false;
        return string.matches("I|II|III|IV|V|VI|VII|VIII|IX|X");
    }

    char getOperation(String string) {
        char[] chArray = string.toCharArray();
        return chArray[0];
    }

    boolean isCorrectly(String string) {
        if ((string.matches("[1-9]|10")) | (string.matches("I|II|III|IV|V|VI|VII|VIII|IX|X"))) return true;
        return false;
    }


}
