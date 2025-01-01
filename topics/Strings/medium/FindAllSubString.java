
import java.util.ArrayList;


class FindAllSubString {

    public static void main(String[] args) {
        String input = "abc";
        ArrayList<String> substrings = findAllSubstrings(input);

        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: " + substrings);
    }

    public static ArrayList<String> findAllSubstrings(String str) {
        ArrayList<String> result = new ArrayList<>();

        // Generate all substrings
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                result.add(str.substring(i, j));
            }
        }

        return result;
    }
}

/*
//------------Output------------

Input: "abc"
Output: [a, b, c, ab, bc, abc]


------Time-And-Space-Complexity------------
Time Complexity:
Space Complexity:

 */
