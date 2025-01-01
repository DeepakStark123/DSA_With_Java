# DSA_With_Java

Welcome to the **DSA_With_Java** repository! This project is designed to help you strengthen your skills in Data Structures and Algorithms (DSA) using Java. The repository is structured topic-wise, allowing you to practice questions categorized as **Easy**, **Medium**, and **Hard**. 

## Features

- **Topic-wise Categorization**: Questions are grouped by topics such as Strings, Arrays, etc., making it easier to focus on specific areas.
- **Difficulty Levels**: Each topic contains problems divided into:
  - **Easy**
  - **Medium**
  - **Hard**

## Project Structure

Here's an overview of the folder structure:

- `Array/`
  - Contains DSA problems related to arrays.
  - Further categorized into:
    - `easy/`
    - `medium/`
    - `hard/`
  
- `Strings/`
  - Includes string manipulation and algorithm questions.
  - Further categorized into:
    - `easy/`
    - `medium/`
    - `hard/`

- Additional folders for other DSA topics will follow a similar structure.

## Example

Here's an example of a problem solution from the `Strings/easy/` category:

```java
import java.util.Arrays;

class AnagramsOfString {

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean res = anagramsOfString(str1, str2);
        if (res) {
            System.out.println(str1 + " And " + str2 + " is anagrams");
        } else {
            System.out.println(str1 + " And " + str2 + " is not anagrams");
        }
    }

    public static boolean anagramsOfString(String str1, String str2) {
        if (str1.length() != str1.length()) {
            return false;
        }
        // Convert the string to a character array
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
