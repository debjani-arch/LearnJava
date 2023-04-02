package IfElse;

import java.util.Scanner;

public class LargestOf2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if (a > b)
            System.out.println(a + " is largest");
         else if (b > a)
            System.out.println(b + " is largest");
         else
            System.out.println("both are equal");
    }
}
