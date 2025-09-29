/*
* Kiểm Tra Chuỗi Đối Xứng
Mô tả: Viết một hàm kiểm tra xem một chuỗi có phải là chuỗi đối xứng (palindrome) không.
Yêu cầu:
Hàm nhận vào một chuỗi.
Trả về true nếu chuỗi là đối xứng, false nếu không.
Ví dụ:
Input: "madam"
Output: true
Input: "hello"
Output: false
* */

public class Lvl2_Ex2 {
    // hàm kiểm tra xem một chuỗi có phải là palindrome

    public static boolean isPalindrome(String input) {
        int left = 0;                  // index 0
        int right = input.length() - 1;  // index cuoi

        while (left < right){ //do until left >= right
            if (input.charAt(left) != input.charAt(right)) { //neu ki tu dau != ki tu cuoi > false luon
                return false;
            }
            left++; //index+1
            right--; //index-1

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("blahblahb"));
    }
}
