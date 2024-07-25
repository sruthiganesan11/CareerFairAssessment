package com.guvi.assessment;

public class License {

    public static void main(String[] args) {
        String s = "5F3Z-2e-9-w";
        int K = 4;
        String result = ReFormatString(s, K);

        System.out.println("The License Number is " + result);

    }

    public static String ReFormatString(String S, int K) {

        String temp = "";
        int num = S.length();
        for (int i = 0; i < num; i++) {
            if (S.charAt(i) != '-') {
                if (Character.isLowerCase(S.charAt(i)))
                    temp += (Character.toUpperCase(S.charAt(i)));
                else
                    temp += (Character.toLowerCase(S.charAt(i)));
            }
        }
        int len = temp.length();
        String ans = "";
        int val = K;

        for (int i = len - 1; i >= 0; i--) {
            if (val == 0) {
                val = K;
                ans += '-';
            }
            ans += temp.charAt(i);
            val--;
        }


        char[] charArray = ans.toCharArray();
        reverse(charArray, charArray.length);
        String res = new String(charArray);
        return res;
    }

    static void reverse(char array[], int n) {
        char t;
        for (int i = 0; i < n / 2; i++) {
            t = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = t;
        }
    }
}
