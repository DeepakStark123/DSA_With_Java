class CountLengthOfString {
   public static void main(String[] args) {
       String str = "world";
       int res = countLengthOfString(str);
       System.out.println("Length Of String => " + res);
   }

   public static int countLengthOfString(String str) {
       int length = 0;
       // Calculate length manually
       for (char c : str.toCharArray()) {
           length++;
       }
       return length;
   }
}

/*
------Output------------

Length Of String => 5

------Time-And-Space-Complexity------------
Time Complexity: 
Space Complexity: 

*/