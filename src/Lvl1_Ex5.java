/*
*In Chữ Cái Đầu Của Mỗi Từ
Mô tả: Viết một hàm in ra chữ cái đầu tiên của mỗi từ trong một chuỗi.
Yêu cầu:
Hàm nhận vào một chuỗi.
Trả về chuỗi chứa các chữ cái đầu của mỗi từ.
Ví dụ:
Input: "Xin chào các bạn"
Output: "X C C B"
Input: "Hello World"
Output: "H W"
* */

public class Lvl1_Ex5 {
    public static String logFirstLetters(String input) {
        String[] words = input.split(" ");
        String res = "";

        for (String word : words) {
            if (!word.isEmpty()) {
                res += word.charAt(0) + " ";
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(logFirstLetters("Xin Chào Các Bạn"));
        System.out.println(logFirstLetters("Hello World"));
    }

}
