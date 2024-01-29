public class thirdpractical {
   public static void main(String[] args) {
       String ParentString = "ajqyhrjsoqunidus";
       String SubString = "qrious";

       word w = new word();
       int output = w.countOccurrences(ParentString, SubString); 

       System.out.println("Qrious can be made " + output + " times from the parent string");
   }
}

class word {

   public int countOccurrences(String parentString, String substring) {
       
       int[] parentCharCount = new int[256];
       int[] substringCharCount = new int[256];

       
       for (int i = 0; i < parentString.length(); i++) {
          char ch = parentString.charAt(i);
          parentCharCount[ch]++;
       }
       
       for (int i = 0; i < substring.length(); i++) {
          char ch = substring.charAt(i);
          substringCharCount[ch]++;
       }

       int count = Integer.MAX_VALUE;
       for (char ch = 0; ch < 256; ch++) {
           if (substringCharCount[ch] > 0) {
               if (parentCharCount[ch] < substringCharCount[ch]) {
                   return 0;
               }
               count = Math.min(count, parentCharCount[ch] / substringCharCount[ch]);
           }
       }

       return count;
   }
}