/*
Xóa Nguyên Âm Trong Chuỗi
Mô tả: Viết một hàm để xóa tất cả các nguyên âm (a, e, i, o, u) trong một chuỗi ký tự. Hàm sẽ nhận
vào một chuỗi và trả về chuỗi đó sau khi đã xóa tất cả các nguyên âm.
Yêu cầu:
Hàm sẽ nhận vào một chuỗi và trả về chuỗi đó sau khi đã xóa tất cả các nguyên âm.
Không sử dụng các hàm có sẵn để xóa ký tự.
Ví dụ:
Input: "Cybersoft"
Output: "Cbrsft"
Input: "hello"
Output: "hll"
* */

public class DeleteVowels_Lvl1_Ex1 {

    public static void main(String[] args) {

        System.out.println(deleteVowels("Hello"));
        System.out.println(deleteVowels("Cybersoft"));
    }

    public static String deleteVowels (String input) {
      String word = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // Nếu không phải nguyên âm thì cộng vào result
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'
                    && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                word = word + c;
            }
        }
        return word;

    };




    }
