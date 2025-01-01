class ConcatenateStrings {
   public static void main(String[] args) {
       String str1 = "hello";
       String str2 = "world";
      
       String result = concatenateStrings(str1, str2);
     
       System.out.println("result => "+result);
   }

   public static String concatenateStrings(String str1, String str2) {
       return str1 + str2;
   }
}


/*
------Output------------

result => helloworld

------Time-And-Space-Complexity------------
Time Complexity: 
Space Complexity: 

*/