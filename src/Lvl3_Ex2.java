/*
Longest Palindromic Substring
Mô tả: Tìm chuỗi con đối xứng (palindromic substring) dài nhất trong một chuỗi cho trước.
Ví dụ:
Input: "babad"
Output: "bab" (hoặc "aba"
, vì cả hai đều là chuỗi con đối xứng dài nhất)
* */

import java.util.ArrayList;

public class Lvl3_Ex2 {

    // hàm kiểm tra xem một chuỗi có phải là palindrome

    public static boolean isPalindrome(String input) {
        //su dung 2 pointers
        int left = 0;                  // index 0
        int right = input.length() - 1;  // index cuoi n length -1

        while (left < right){ //do until left >= right
            if (input.charAt(left) != input.charAt(right)) { //neu ki tu dau != ki tu cuoi > false luon
                return false;
            }
            left++;
            right--;

        }
        return true;
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) { // neu chuoi null hoặc rỗng > trả về rỗng
            return "";
        }

        ArrayList<String> palindromes = new ArrayList<>(); //input valid> tao một arraylist để lưu tất cả những chuỗi palindorme trong string s

        // sinh tất cả các substring và kiểm tra
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (isPalindrome(sub)) {
                    palindromes.add(sub);
                }
            }
        }

        // tìm chuỗi đối xứng dài nhất trong arraylist
        String longest = "";
        for (String p : palindromes) {
            if (p.length() > longest.length()) {
                longest = p;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        String input1 = "babad";
        String input2 = "hanlahannahnahla";

        System.out.println(longestPalindrome(input1));
        System.out.println(longestPalindrome(input2));
    }

}
