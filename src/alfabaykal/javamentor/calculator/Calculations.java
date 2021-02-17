package alfabaykal.javamentor.calculator;

public class Calculations {
    public static String calculate(String a, String x, String b) throws NumberFormatException {

        String stringAnswer;
        int answer = 0;
        int aa = Integer.parseInt(a);
        int bb = Integer.parseInt(b);

        if (x.equals("+")) {
            answer = aa + bb;
        } else if (x.equals("-")) {
            answer = aa - bb;
        } else if (x.equals("*")) {
            answer = aa * bb;
        } else if (x.equals("/")) {
            answer = aa / bb;
        }

        stringAnswer = Integer.toString(answer);

        return stringAnswer;
    }

}
