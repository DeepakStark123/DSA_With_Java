
class ReverseString {

    public static void main(String[] args) {
        String str = "hello";
        String res = reverseString(str);
        System.out.println("Reverse String => " + res);
    }

    public static String reverseString(String str) {
        StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        return rev.toString();
    }
}

/*
------Output------------

Reverse String => olleh

------Time-And-Space-Complexity------------
Time Complexity: O(n)
Space Complexity: O(n)

*/
