/*
Đếm số từ trong một chuỗi
Mô tả: Viết một hàm đếm số từ trong một chuỗi.
Yêu cầu:
Hàm nhận vào một chuỗi.
Trả về số từ trong chuỗi.
Ví dụ:
Input: "Xin chào các bạn"
Output: 4
Input: "Hello World"
Output: 2
*/

public class LettersCount_Lvl1_Ex4 {
    public static void main(String[] args) {
        String str1 = "Xin chào các bạn";
        String str2 = "Hello World";

        // Tách chuỗi theo khoảng trắng " "
        String[] arr1 = str1.split(" ");
        String[] arr2 = str2.split(" ");

        System.out.println("Output 1: " + arr1.length);
        System.out.println("Output 2: " + arr2.length);
    }
}
