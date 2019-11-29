package calculator;

public class Main {
    public static void main(String[] args) {
        Enter readVariables = new Enter();
        Calculation resultCalculation = new Calculation();
        readVariables.readForConsole();
        System.out.println("Результат выполнения : " + resultCalculation.calculation(readVariables.isRome,readVariables.operation, readVariables.number1, readVariables.number2));
    }
}

