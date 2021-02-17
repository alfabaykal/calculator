package alfabaykal.javamentor.calculator;

import java.util.HashMap;

public class Converter {

    String aa;

    public String romanToArabianTransform(String a) {
        HashMap<String, String> romanToArabian = new HashMap<>();

        romanToArabian.put("I", "1");
        romanToArabian.put("II", "2");
        romanToArabian.put("III", "3");
        romanToArabian.put("IV", "4");
        romanToArabian.put("V", "5");
        romanToArabian.put("VI", "6");
        romanToArabian.put("VII", "7");
        romanToArabian.put("VIII", "8");
        romanToArabian.put("IX", "9");
        romanToArabian.put("X", "10");

        this.aa = romanToArabian.get(a);

        return aa;
    }

    public String arabianToRomanTransform (String a) {
        HashMap<String, String> arabianToRoman = new HashMap<>();

        arabianToRoman.put("1", "I");
        arabianToRoman.put("2", "II");
        arabianToRoman.put("3", "III");
        arabianToRoman.put("4", "VI");
        arabianToRoman.put("5", "V");
        arabianToRoman.put("6", "VI");
        arabianToRoman.put("7", "VII");
        arabianToRoman.put("8", "VIII");
        arabianToRoman.put("9", "IX");
        arabianToRoman.put("10", "X");

        arabianToRoman.put("11", "XI");
        arabianToRoman.put("12", "XII");
        arabianToRoman.put("13", "XIII");
        arabianToRoman.put("14", "XVI");
        arabianToRoman.put("15", "XV");
        arabianToRoman.put("16", "XVI");
        arabianToRoman.put("17", "XVII");
        arabianToRoman.put("18", "XVIII");
        arabianToRoman.put("19", "XIX");
        arabianToRoman.put("20", "XX");

        arabianToRoman.put("21", "XXI");
        arabianToRoman.put("22", "XXII");
        arabianToRoman.put("23", "XXIII");
        arabianToRoman.put("24", "XXVI");
        arabianToRoman.put("25", "XXV");
        arabianToRoman.put("26", "XXVI");
        arabianToRoman.put("27", "XXVII");
        arabianToRoman.put("28", "XXVIII");
        arabianToRoman.put("29", "XXIX");
        arabianToRoman.put("30", "XXX");

        arabianToRoman.put("31", "XXXI");
        arabianToRoman.put("32", "XXXII");
        arabianToRoman.put("33", "XXXIII");
        arabianToRoman.put("34", "XXXVI");
        arabianToRoman.put("35", "XXXV");
        arabianToRoman.put("36", "XXXVI");
        arabianToRoman.put("37", "XXXVII");
        arabianToRoman.put("38", "XXXVIII");
        arabianToRoman.put("39", "XXXIX");
        arabianToRoman.put("40", "XL");

        arabianToRoman.put("41", "XLI");
        arabianToRoman.put("42", "XLII");
        arabianToRoman.put("43", "XLIII");
        arabianToRoman.put("44", "XLVI");
        arabianToRoman.put("45", "XLV");
        arabianToRoman.put("46", "XLVI");
        arabianToRoman.put("47", "XLVII");
        arabianToRoman.put("48", "XLVIII");
        arabianToRoman.put("49", "XLIX");
        arabianToRoman.put("50", "L");

        arabianToRoman.put("51", "LI");
        arabianToRoman.put("52", "LII");
        arabianToRoman.put("53", "LIII");
        arabianToRoman.put("54", "LVI");
        arabianToRoman.put("55", "LV");
        arabianToRoman.put("56", "LVI");
        arabianToRoman.put("57", "LVII");
        arabianToRoman.put("58", "LVIII");
        arabianToRoman.put("59", "LIX");
        arabianToRoman.put("60", "LX");

        arabianToRoman.put("61", "LXI");
        arabianToRoman.put("62", "LXII");
        arabianToRoman.put("63", "LXIII");
        arabianToRoman.put("64", "LXVI");
        arabianToRoman.put("65", "LXV");
        arabianToRoman.put("66", "LXVI");
        arabianToRoman.put("67", "LXVII");
        arabianToRoman.put("68", "LXVIII");
        arabianToRoman.put("69", "LXIX");
        arabianToRoman.put("70", "LXX");

        arabianToRoman.put("71", "LXXI");
        arabianToRoman.put("72", "LXXII");
        arabianToRoman.put("73", "LXXIII");
        arabianToRoman.put("74", "LXXVI");
        arabianToRoman.put("75", "LXXV");
        arabianToRoman.put("76", "LXXVI");
        arabianToRoman.put("77", "LXXVII");
        arabianToRoman.put("78", "LXXVIII");
        arabianToRoman.put("79", "LXXIX");
        arabianToRoman.put("80", "LXXX");

        arabianToRoman.put("81", "LXXXI");
        arabianToRoman.put("82", "LXXXII");
        arabianToRoman.put("83", "LXXXIII");
        arabianToRoman.put("84", "LXXXVI");
        arabianToRoman.put("85", "LXXXV");
        arabianToRoman.put("86", "LXXXVI");
        arabianToRoman.put("87", "LXXXVII");
        arabianToRoman.put("88", "LXXXVIII");
        arabianToRoman.put("89", "LXXXIX");
        arabianToRoman.put("90", "XC");

        arabianToRoman.put("91", "XCI");
        arabianToRoman.put("92", "XCII");
        arabianToRoman.put("93", "XCIII");
        arabianToRoman.put("94", "XCVI");
        arabianToRoman.put("95", "XCV");
        arabianToRoman.put("96", "XCVI");
        arabianToRoman.put("97", "XCVII");
        arabianToRoman.put("98", "XCVIII");
        arabianToRoman.put("99", "XCIX");
        arabianToRoman.put("100", "C");

        this.aa = arabianToRoman.get(a);

        return aa;
    }

}
