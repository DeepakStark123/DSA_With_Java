class CountVowelsOfString {
   public static void main(String[] args) {
       String str = "hello";
       int res = countVowelsOfString(str);
       System.out.println("Total Vowels => " + res);
   }

   public static int countVowelsOfString(String str) {
       int count = 0;
       str = str.toLowerCase();
       for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
               count++;
           }
       }
       return count;
   }
}

/*
------Output------------

Total Vowels => 2

------Time-And-Space-Complexity------------
Time Complexity: O(n)
Space Complexity: O(n)

*/