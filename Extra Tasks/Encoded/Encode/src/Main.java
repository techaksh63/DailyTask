import java.util.*;

public class Main {
        public static void main(String[] args) {
            String encoded_str = " olleH I epoh uoy era gniod llew ";
            Main main = new Main();
            String decode_str = main.decode_message(encoded_str);
            System.out.println(decode_str);

        }

    String decode_message(String encoded_str) {
        String decode = "";
        String reversed="";
        String s = " ";

        String[] words = encoded_str.split(s);

        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                decode = decode + words[i] + " ";
            }
        }

        for (int i = decode.length() - 1; i >= 0; i--)
        {
            reversed = reversed + decode.charAt(i);
        }

        return reversed;
    }
    }

