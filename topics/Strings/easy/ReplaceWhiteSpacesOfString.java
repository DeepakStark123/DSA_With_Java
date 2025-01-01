class ReplaceWhiteSpacesOfString {
   public static void main(String[] args) {
       String str = "hello world";
       String res = removeWhiteSpacesOfString(str);
       System.out.println("Result => " + res);
   }

   public static String removeWhiteSpacesOfString(String str) {
       // Convert the string to a character array
       char[] characters = str.toCharArray();
       // Initialize a StringBuilder for the result
       StringBuilder result = new StringBuilder();
       for (char c : characters) {
           if(c == ' '){
              result.append('_');
           }else{
             result.append(c);
           }
       }
       return result.toString();
   }
}



/*
Answer2:- using predefined function replaceAll()
//-----------------

class ReplaceWhiteSpacesOfString {
   public static void main(String[] args) {
       String str = "hello world";
       String res = removeWhiteSpacesOfString(str);
       System.out.println("Result => " + res);
   }

   public static String removeWhiteSpacesOfString(String str) {
       return str.replaceAll(" ", "_");
   }
}

*/

/*
------Output------------

Result => hello_world

------Time-And-Space-Complexity------------
Time Complexity: 
Space Complexity: 

*/