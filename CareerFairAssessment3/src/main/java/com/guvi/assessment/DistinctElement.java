package com.guvi.assessment;

import java.util.*;

public class DistinctElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the total element");
        int number = scanner.nextInt();

        System.out.println("Enter the array elements");
        int array[] = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }
        Boolean result = distinctElementInArray(array);
        System.out.println("The result is " + result);
    }

    private static Boolean distinctElementInArray(int[] array) {
        Set<Integer> s = new HashSet();
        for (int element : array) {
            s.add(element);
        }
        if (s.size() != array.length)
            return true;
        else
            return false;
    }
}
