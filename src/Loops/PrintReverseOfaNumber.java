package Loops;

public class PrintReverseOfaNumber {
    public static void main(String[] args) {
        int n = 109981;
        while ( n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n = n/10;
        }
        System.out.println();
    }
}
