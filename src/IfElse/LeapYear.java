package IfElse;

public class LeapYear {
    public static String checkLeapYear(int year) {
        if(year % 4 !=0) return "COMMON YEAR";
        else {
            if(year%100 == 0 && year%400 == 0) return "LEAP YEAR";
            else if(year%100 == 0 && year%400 != 0) return "COMMON YEAR";
            else
                return "LEAP YEAR";

        }
    }

    public static void main(String[] args) {
        System.out.println(checkLeapYear(1234));
    }
}
