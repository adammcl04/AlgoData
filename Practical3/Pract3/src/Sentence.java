/*
public class Sentence {

    private String text;

    public Sentence(String aText) {
        text = aText;
    }

    public boolean isPalindrome() {
        int length = text.length();

        if(length <= 1) return true;

        char first = Character.toLowerCase(text.charAt(0));
        char last = Character.toLowerCase(text.charAt(length - 1));

        if(Character.isLetter(first) && Character.isLetter(last)) {
            if (first == last) {
                Sentence shorter = new Sentence(text.substring(1, length - 1));
                return shorter.isPalindrome();
            } else
                return false;
        }

        else if(!Character.isLetter(last)){
            Sentence shorter = new Sentence(text.substring(0, length - 1));
            return shorter.isPalindrome();
        }
        else{
            Sentence shorter = new Sentence(text.substring(1));
            return shorter.isPalindrome();
        }

    }


    public static void main(String[] args) {
        Sentence sentence1 = new Sentence("A man, a plan, a canal, Panama!");
        System.out.println(sentence1.isPalindrome()); // true

        Sentence sentence2 = new Sentence("Hello, World!");
        System.out.println(sentence2.isPalindrome()); // false

        Sentence sentence3 = new Sentence("Racecar");
        System.out.println(sentence3.isPalindrome()); // true

        Sentence sentence4 = new Sentence("12321");
        System.out.println(sentence4.isPalindrome()); // true (if numbers are considered)

        Sentence sentence5 = new Sentence("");
        System.out.println(sentence5.isPalindrome()); // true

        Sentence sentence6 = new Sentence(" ");
        System.out.println(sentence6.isPalindrome()); // true
    }
}
*/



/*  PART
public class Sentence {

    private String text;

    public Sentence(String aText) {
        if (aText == null) {
            throw new IllegalArgumentException("Text cannot be null.");
        }
        text = aText;
    }

    public boolean isPalindrome() {
        return isPalindromeHelper(text);
    }

    private boolean isPalindromeHelper(String str) {
        int length = str.length();

        // Base case: strings of length 0 or 1 are palindromes
        if (length <= 1) {
            return true;
        }

        // Get the first and last characters (case-insensitive)
        char first = Character.toLowerCase(str.charAt(0));
        char last = Character.toLowerCase(str.charAt(length - 1));

        // If the first character is not a letter, skip it
        if (!Character.isLetter(first)) {
            return isPalindromeHelper(str.substring(1));
        }

        // If the last character is not a letter, skip it
        if (!Character.isLetter(last)) {
            return isPalindromeHelper(str.substring(0, length - 1));
        }

        // If both are letters, compare them
        if (first == last) {
            // Recursively check the substring excluding the first and last characters
            return isPalindromeHelper(str.substring(1, length - 1));
        } else {
            // If they don't match, it's not a palindrome
            return false;
        }
    }

    public static void main(String[] args) {
        Sentence sentence1 = new Sentence("A man, a plan, a canal, Panama!");
        System.out.println(sentence1.isPalindrome()); // true

        Sentence sentence2 = new Sentence("Hello, World!");
        System.out.println(sentence2.isPalindrome()); // false

        Sentence sentence3 = new Sentence("Racecar");
        System.out.println(sentence3.isPalindrome()); // true

        Sentence sentence4 = new Sentence("12321");
        System.out.println(sentence4.isPalindrome()); // true (if numbers are considered)

        Sentence sentence5 = new Sentence("");
        System.out.println(sentence5.isPalindrome()); // true

        Sentence sentence6 = new Sentence(" ");
        System.out.println(sentence6.isPalindrome()); // true
    }
}


 */


public class Sentence {

    private String text;

    public Sentence(String aText) {
        if (aText == null) {
            throw new IllegalArgumentException("Text cannot be null.");
        }
        text = aText;
    }

    // Method to check if the sentence is a palindrome
    public boolean isPalindrome() {
        return isPalindromeHelper(text);
    }

    // Helper method for palindrome check
    private boolean isPalindromeHelper(String str) {
        int length = str.length();

        // Base case: strings of length 0 or 1 are palindromes
        if (length <= 1) {
            return true;
        }

        // Get the first and last characters (case-insensitive)
        char first = Character.toLowerCase(str.charAt(0));
        char last = Character.toLowerCase(str.charAt(length - 1));

        // If the first character is not a letter, skip it
        if (!Character.isLetter(first)) {
            return isPalindromeHelper(str.substring(1));
        }

        // If the last character is not a letter, skip it
        if (!Character.isLetter(last)) {
            return isPalindromeHelper(str.substring(0, length - 1));
        }

        // If both are letters, compare them
        if (first == last) {
            // Recursively check the substring excluding the first and last characters
            return isPalindromeHelper(str.substring(1, length - 1));
        } else {
            // If they don't match, it's not a palindrome
            return false;
        }
    }

    // Method to reverse the string recursively
    public String reverseString() {
        return reverseStringHelper(text);
    }

    // Helper method for reversing the string
    private String reverseStringHelper(String str) {
        // Base case: if the string is empty or has one character, return it
        if (str.length() <= 1) {
            return str;
        }

        // Recursive case: take the last character and prepend it to the reversed substring
        return str.charAt(str.length() - 1) + reverseStringHelper(str.substring(0, str.length() - 1));
    }

    public static void main(String[] args) {
        Sentence sentence1 = new Sentence("A man, a plan, a canal, Panama!");
        System.out.println("Is palindrome: " + sentence1.isPalindrome()); // true
        System.out.println("Reversed string: " + sentence1.reverseString()); // !amanaP ,lanac a ,nalp a ,nam A

        Sentence sentence2 = new Sentence("Hello, World!");
        System.out.println("Is palindrome: " + sentence2.isPalindrome()); // false
        System.out.println("Reversed string: " + sentence2.reverseString()); // !dlroW ,olleH

        Sentence sentence3 = new Sentence("Racecar");
        System.out.println("Is palindrome: " + sentence3.isPalindrome()); // true
        System.out.println("Reversed string: " + sentence3.reverseString()); // racecaR

        Sentence sentence4 = new Sentence("12321");
        System.out.println("Is palindrome: " + sentence4.isPalindrome()); // true
        System.out.println("Reversed string: " + sentence4.reverseString()); // 12321

        Sentence sentence5 = new Sentence("");
        System.out.println("Is palindrome: " + sentence5.isPalindrome()); // true
        System.out.println("Reversed string: " + sentence5.reverseString()); // (empty string)

        Sentence sentence6 = new Sentence(" ");
        System.out.println("Is palindrome: " + sentence6.isPalindrome()); // true
        System.out.println("Reversed string: " + sentence6.reverseString()); // (single space)
    }
}