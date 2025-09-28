public class Lvl1_Ex1 {

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
