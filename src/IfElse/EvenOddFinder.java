package IfElse;

import java.util.Scanner;

public class EvenOddFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if ( a % 2 == 0)
            System.out.println(a+ " is even");
        else
            System.out.println( a+ " is odd");
    }
}
