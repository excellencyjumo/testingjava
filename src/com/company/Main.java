package com.company;

import java.util.*;

public class Main {

//    private static boolean True;

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean answer = num % 2 == 0;
        int check = answer ? 0 : 1;
        switch (check) {
            case 0:
                System.out.println("Even number");
                break;
            case 1:
                System.out.println("Not an Even number");
                break;
            default:
                System.out.println("Not Valid");
        }
    }
}
