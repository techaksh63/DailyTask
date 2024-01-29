import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"hello","eses", "merry","dear", "deere"};
        for(String word : words){
            System.out.println(word);
        }
        String[] modifiedWords1 = modifyStringArrayUsingCollection(words);

        System.out.println("Modified words: " + Arrays.toString(modifiedWords1));


//        String[] words = {"hello","eses", "merry","dear", "deere"};
//        int count = 0;
//        for(String word : words){
//            System.out.println(word);
//            for(int i=0;i<=word.length(); i++) {
//                System.out.println(i);
//            }
//
//        }

    }


    public static String[] modifyStringArrayUsingCollection(String[] words) {
        List<String> modifiedWords = new ArrayList<>();
        for (String word : words) {
            int eCount = word.length() - word.replace("e", "").length();
            if (eCount == 1) {
                continue;
            } else if (eCount > 1) {
                modifiedWords.add(word + "e");
            } else {
                modifiedWords.add(word);
            }
        }
        return modifiedWords.toArray(new String[0]);
    }


//    public static String[] modifyStringArrayUsingLoop(String[] words) {
//        int j = 0;
//
//        for (int i = 0; i < words.length; i++) {
//            int eCount = words[i].length() - words[i].replace("e", "").length();
//            if (eCount != 1) {
//                words[j++] = (eCount > 1) ? words[i] + "e" : words[i];
//            }
//        }
//
//        // Trim the unused part of the original array (optional)
//        words = Arrays.copyOf(words, j);
//        return words;
//    }



}