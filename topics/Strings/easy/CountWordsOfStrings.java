
class CountWordsOfStrings {

    public static void main(String[] args) {
        // Input strings
        String str = "hello world";
        // Concatenate the strings
        int result = countWordsOfStrings(str);
        // Output the result
        System.out.println("result => " + result);
    }

    public static int countWordsOfStrings(String str) {
        // Return the number of words
        return str.trim().split("\\s").length;
    }
}

/*
------Output------------

result => 2

------Time-And-Space-Complexity------------
Time Complexity: 
Space Complexity: 

*/
