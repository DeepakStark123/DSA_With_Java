class PalindromeOfString {
   public static void main(String[] args) {
       String str = "Madam";
       boolean res = palindromeOfString(str);
       if (res) {
           System.out.println(str+" is palindrome");
       } else {
           System.out.println(str+" is not palindrome");
       }
   }

   public static boolean palindromeOfString(String str) {
       StringBuilder rev = new StringBuilder();
       str = str.toLowerCase();
       for (int i = str.length() - 1; i >= 0; i--) {
           rev.append(str.charAt(i));
       }
       return rev.toString().toLowerCase().equals(str.toLowerCase());
   }
}

/*
------Output------------

Madam is palindrome

------Time-And-Space-Complexity------------
Time Complexity: O(n)
Space Complexity: O(n)

*/




