package org.example;

// На вход дается строка, состоящая из букв, чисел и знаков препинания.
// Необходимо определить, является ли даннае строка палиндромом (читается в обоих направлениях одинаково).
// При определении палиндромности учитывать только буквы (любые иные символы в определении признака палиндромности
// участвовать не должны)
public class IsPalindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrome("ab1a"));
    }
    public static boolean isPalindrome(String s) {
        StringBuilder lowerCase = new StringBuilder(s.toLowerCase());
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < lowerCase.length(); i++) {
            if (Character.isLetter(lowerCase.charAt(i))) res.append(lowerCase.charAt(i));
        }
        int i = 0;
        int j = res.length() - 1;
        while (j != 0 && i < res.length()) {
            if (res.charAt(i) != res.charAt(j)) return false;
            j--;
            i++;
        }
        return true;
    }
}