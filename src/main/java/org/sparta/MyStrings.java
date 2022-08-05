package org.sparta;

public class MyStrings {

    public void sayHello() {
        System.out.println("Hello");
    }

    public boolean letterExists(String strIn, String strSearch) {

        return strSearch.contains(strIn);

    }

    public static boolean isPalindrome(String word) {
        if (word.equals(reverse(word)))
            return true;
        else
            return false;
    }

    public static String reverse(String word) {

        String ans = "";


        for (int element = word.length() - 1; element >= 0; element--) {
            ans = ans + word.charAt(element);

        }
        return ans;


    }
}

