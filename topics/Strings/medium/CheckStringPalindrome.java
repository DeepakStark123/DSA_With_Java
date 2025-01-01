
class CheckStringPalindrome {

    public static void main(String[] args) {
        String str = "civic";
        boolean canPalindrome = checkStringCanPalindrome(str);
        System.out.println("Input: " + str);
        if (canPalindrome) {
            System.out.println(" \"" + str + "\" Can be Palindrome by Rearranging");
        } else {
            System.out.println(" \"" + str + "\" Can not be Palindrome by Rearranging");
        }
    }

    public static boolean checkStringCanPalindrome(String str) {
        if (str.isEmpty()) {
            return false;
        }
        str = str.toLowerCase();
        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }

        return result.toString().equals(str);
    }
}
