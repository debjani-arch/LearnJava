package IfElse;

import java.util.Scanner;

public class CheckAdult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a <= 18) {
            System.out.println("not an adult");

        } else {
            System.out.println("is an adult");
        }
    }
}
