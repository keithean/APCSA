import java.util.Scanner;

public class writingmethodstwo {

    public static void main(String[] args) {
        scenario6();

        scenario7();

        scenario8();

        scenario9();

        scenario10();

        scenario11();

        scenario12();

        scenario13();

        scenario14();

        scenario15();
    }

    //6
    public static void scenario6() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a message: ");
        String message = input.nextLine();
        repeatMessage(message);
    }

    public static void repeatMessage(String message) {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
        }
    }

    //7
    public static void scenario7() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a message: ");
        String message = input.nextLine();
        System.out.println("How many times would you like it displayed: ");
        int num = input.nextInt();
        repeatMessage(message, num);
    }

    public static void repeatMessage(String message, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(message);
        }
    }
     //8
    public static void scenario8() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String string1 = input.nextLine();
        System.out.println("Enter your second string: ");
        String string2 = input.nextLine();
        compareStrings(string1, string2);
    }

    public static void compareStrings(String string1, String string2) {
        if (string1.length() > string2.length()) {
            System.out.println(string1 + " is longer than " + string2 + ".");
        } else if (string2.length() > string1.length()) {
            System.out.println(string2 + " is longer than " + string1 + ".");
        } else {
            System.out.println("Both " + string1 + " and " + string2 + " are the same length.");
        }
    }

    //9
    public static void scenario9() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String string = input.nextLine();
        if (isPalindrome(string)) {
            System.out.println(string + " is a palindrome.");
        } else {
            System.out.println(string + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String string) {
        int i = 0, h = string.length() - 1;
        while (i < h) {
            if (string.charAt(i) != string.charAt(h)) {
                return false;
            }
            i++;
            h--;
        }
        return true;
    }

    //10
    public static void scenario10() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();
        int spaces = checkSpace(sentence);
        System.out.println(spaces);
    }

    public static int checkSpace(String sentence) {
        int spaces = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                spaces++;
            }
        }
        return spaces;
    }

    //11
    public static void scenario11() {
        String sentence = "I will finish all my APCSA assignments tonight!";
        char character = 'i';
        int totalChar = checkChar(sentence, character);
        System.out.println("The character " + "'" + character + "'" + " appears " + totalChar + " times in the sentence.");
    }

    public static int checkChar(String sentence, char character) {
        int charCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == character) {
                charCount++;
            }
        }
        return charCount;
    }

    //12
    public static void scenario12() {
        String sentence = "I have a crush on a girl whose name starts with M.";
        char character = 'a';
        String charString = getString(sentence, character);
        System.out.println(charString);
    }

    public static String getString(String sentence, char character) {
        String charString = "";
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != character) {
                charString += sentence.charAt(i);
            }
        }
        return charString;
    }

    //13
    public static void scenario13() {
        String string = "This statement will end up all uppercase.";
        System.out.println(convertString(string, true));
    }

    public static String convertString(String string, boolean upperCase) {
        if (upperCase) {
            return string.toUpperCase();
        } else {
            return string.toLowerCase();
        }
    }

    //14
    public static void scenario14() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String string = input.nextLine();

        System.out.println("Enter the starting index: ");
        int num1 = input.nextInt();

        System.out.println("Enter the ending index: ");
        int num2 = input.nextInt();

        String substring = rangeSubstring(string, num1, num2);
        System.out.println(substring);
    }

    public static String rangeSubstring(String string, int num1, int num2) {
        if (num1 >= 0 && num2 <= string.length()) {
            return string.substring(num1, num2);
        } else {
            return "Not in range";
        }
    }

    //15
    public static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static void scenario15() {
        System.out.println(randomLetter());
    }

    public static char randomLetter() {
        int randIndex = (int) (Math.random() * alphabet.length());
        return alphabet.charAt(randIndex);
    }
}
