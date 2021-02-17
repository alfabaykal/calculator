package alfabaykal.javamentor.calculator;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Checker {

    //static String [] arabianList = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    static String [] romanianList = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public static boolean expressionChek(String[] x) throws NumberFormatException {

        if ((x[1].equals("+") || x[1].equals("-") || x[1].equals("*") || x[1].equals("/")) && x.length == 3) {
            return true;
        }
        return false;
    }

    /*public static boolean romanChek(String x) {
        if (x.equals("I") || x.equals("II") || x.equals("III") || x.equals("IV") || x.equals("V") || x.equals("VI") || x.equals("VII") || x.equals("VIII") || x.equals("IX") || x.equals("X")) {
            return true;
        }
        return false;
    }*/

    public static boolean romanCheck(String x) {
        for (int i = 0; i < romanianList.length; i++) {
            if (romanianList[i].equals(x)) {
                return true;
            }
        } return false;
    }

    /*public static boolean arabianChek(String x) {
        if (x.equals("1") || x.equals("2") || x.equals("3") || x.equals("4") || x.equals("5") || x.equals("6") || x.equals("7") || x.equals("8") || x.equals("9") || x.equals("10")) {
            return true;
        }
        return false;
    }*/

    public static boolean arabianCheck(String x) {
        int number = Integer.parseInt(x);
        return  (0 < number && number <= 10);
    }
}
