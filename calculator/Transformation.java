package calculator;

public class Transformation {
        int number = 0;

    int romeConversionArab(String romeNumber) {
        switch (romeNumber) {
            case "I":
                number = 1;
                break;
            case "II":
                number = 2;
                break;
            case "III":
                number = 3;
                break;
            case "IV":
                number = 4;
                break;
            case "V":
                number = 5;
                break;
            case "VI":
                number = 6;
                break;
            case "VII":
                number = 7;
                break;
            case "VIII":
                number = 8;
                break;
            case "IX":
                number = 9;
                break;
            case "X":
                number = 10;
                break;
            default:
                throw new IllegalStateException("Unexpected arithmetic operations: " + romeNumber);
        }

        return number;
    }

    String romeConversionFromOneToTen(int number){
        String romeNumber = "";
        switch (number) {
            case 1 :
                romeNumber = "I";
                break;
            case 2 :
                romeNumber = "II";
                break;
            case 3 :
                romeNumber = "III";
                break;
            case 4 :
                romeNumber = "IV";
                break;
            case 5 :
                romeNumber = "V";
                break;
            case 6 :
                romeNumber = "VI";
                break;
            case 7 :
                romeNumber = "VII";
                break;
            case 8 :
                romeNumber = "VIII";
                break;
            case 9 :
                romeNumber = "IX";
                break;

        }
        return romeNumber;
    }

    String romeConversionFromTenToOneHundred(int number){
        String romeNumber = "";
        switch (number) {
            case 1 :
                romeNumber = "X";
                break;
            case 2 :
                romeNumber = "XX";
                break;
            case 3 :
                romeNumber = "XXX";
                break;
            case 4 :
                romeNumber = "XL";
                break;
            case 5 :
                romeNumber = "L";
                break;
            case 6 :
                romeNumber = "LX";
                break;
            case 7 :
                romeNumber = "LXX";
                break;
            case 8 :
                romeNumber = "LXXX";
                break;
            case 9 :
                romeNumber = "XC";
                break;
            case 10 :
                romeNumber = "C";
                break;

        }
        return romeNumber;
    }



}
