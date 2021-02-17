package alfabaykal.javamentor.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {

        String[] expressionArray;
        String a = null;
        String b = null;
        String answer = null;

        System.out.println("Введи выражение");

        Scanner reader = new Scanner(System.in);
        String expression = reader.nextLine();
        //String expression = "X * VII";
        //String expression = "6 / 2";
        //String expression = "6 / II";
        //String expression = "VI / 2";

        expressionArray = expression.split(" ", 3);
        a = expressionArray[0];
        b = expressionArray[2];

        /*for(String s:expressionArray) {
            System.out.println(s);
        }*/

        //Checker check = new Checker();

        if (!Checker.expressionChek(expressionArray)) {
            Exception e = new NumberFormatException();
            throw e;
        }

        if (Checker.romanCheck(expressionArray[0])) {
            if (Checker.romanCheck(expressionArray[2])) {
                Converter romans = new Converter();
                a = romans.romanToArabianTransform(expressionArray[0]);
                b = romans.romanToArabianTransform(expressionArray[2]);
                answer = Calculations.calculate(a, expressionArray[1], b);
                answer = romans.arabianToRomanTransform(answer);
            }
        }

        if (!Checker.romanCheck(expressionArray[0])) {
            if (!Checker.romanCheck(expressionArray[2])) {
                if (Checker.arabianCheck(expressionArray[0])) {
                    if (Checker.arabianCheck(expressionArray[2])) {
                        answer = Calculations.calculate(a, expressionArray[1], b);
                    }
                }
            }
        }


        if (answer == null) {
            Exception e = new NumberFormatException();
            throw e;
        }
        System.out.println("Ответ: " + answer);
    }
}
