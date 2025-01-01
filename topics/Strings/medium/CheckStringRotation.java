
class CheckStringRotation {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "llohe";
        boolean isRotation = checkStringRotation(str1, str2);
        System.out.println("Input: \"" + str1 + "\", \"" + str2 + "\"");
        System.out.println("Output: " + isRotation);
    }

    public static boolean checkStringRotation(String str1, String str2) {
        // Check if lengths are equal and not empty
        if (str1.length() != str2.length() || str1.isEmpty() || str2.isEmpty()) {
            return false;
        }

        // Concatenate str1 with itself
        String concatenated = str1 + str1;

        // Check if str2 is a substring of concatenated string
        return concatenated.contains(str2);
    }
}

/*
//------------Output------------

Input: "hello", "llohe"
Output: true


------Time-And-Space-Complexity------------
Time Complexity:
Space Complexity:

 */
