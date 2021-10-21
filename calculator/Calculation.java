package calculator;
import java.lang.Math;

public class Calculation {
        Transformation transformation = new Transformation();
        String resultString;
        int result;
    String calculation(boolean iSRome,char operation, int number1, int number2) {
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '**':
                result = (int) Math.pow(number1, number2);
                break;
            default:
                throw new IllegalStateException("Unexpected arithmetic operations: " + operation);
        }
        if (iSRome){
            resultString = transformation.romeConversionFromTenToOneHundred(result / 10) + transformation.romeConversionFromOneToTen(result % 10);
            return resultString;

        }else {
            resultString = Integer.toString(result);
            return resultString;
        }

    }
}
