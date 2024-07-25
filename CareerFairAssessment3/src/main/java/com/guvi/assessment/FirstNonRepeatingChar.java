package com.guvi.assessment;

import java.util.*;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any word");
        String input = scanner.next();

        int result = firstUniqueCharacter(input);
        System.out.println("The result is " + result);
    }

    public static int firstUniqueCharacter(String s) {

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int i = 0; i < s.length(); ++i) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
