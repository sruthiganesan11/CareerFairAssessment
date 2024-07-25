package com.guvi.assessment;

import java.util.*;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = scanner.nextInt();

        Boolean result = isHappy(num);
        System.out.println("The result is: " + result);
    }

    private static Boolean isHappy(int num) {
        Set<Integer> number = new HashSet<>();
        while (num != 1) {
            int current = num;
            int sum = 0;
            while (current != 0) {
                int rem = current % 10;
                sum = sum + (rem * rem);
                current = current / 10;

            }
            if (number.contains(sum))
                return false;
            num = sum;
            number.add(num);
        }
        return true;
    }
}
