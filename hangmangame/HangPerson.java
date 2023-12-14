import java.util.Scanner;

public class HangPerson {

    String word;
    String wordStatus;

    String guessedLetters = "";

    int incorrect = 0;
    int correct = 0;

    Scanner user_input;

    public void start() {
        System.out.println("Welcome to Hangperson");
        System.out.println();
        System.out.println("The rules are simple.. You know the drill. Guess the word before time runs out.");
        System.out.println();
        System.out.println("Choosing word....");

        setup();
        run();
    }

    public void setup() {
        word = getRandomWord();
        setupWordStatus();
    }

    public void run() {

        user_input = new Scanner(System.in);

        while (incorrect < 5 && !wordStatus.equals(word)) {
            showStatus();

            System.out.print("Enter a letter: ");
            char letter = user_input.next().charAt(0);

            boolean isGuessed = checkGuessedLetter(letter);

            if (isGuessed) {
                System.out.println("You already guessed that letter. Try another one!");
            } else {
                guessedLetters += letter;
                if (word.contains(String.valueOf(letter))) {
                    updateWordStatus(letter);
                } else {
                    incorrect++;
                    showHangman(incorrect);
                }
            }
        }

        if (wordStatus.equals(word)) {
            System.out.println("Congratulations! You guessed the word: " + word);
        } else {
            System.out.println("Sorry! You've used all your attempts. The word was: " + word);
        }

        user_input.close();
    }

    private void setupWordStatus() {
        wordStatus = "";
        for (int i = 0; i < word.length(); i++) {
            wordStatus += "_";
        }
    }

    private void updateWordStatus(char letter) {
        StringBuilder newWordStatus = new StringBuilder(wordStatus);
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                newWordStatus.setCharAt(i, letter);
            }
        }
        wordStatus = newWordStatus.toString();
    }

    private boolean checkGuessedLetter(char c) {
        return guessedLetters.contains(String.valueOf(c));
    }

    public void showStatus() {

        System.out.println("There are " + word.length() + " letters in the word.");
        System.out.println("You have guessed these letters: " + guessedLetters);
        System.out.println("Current status: " + displayCurrentStatus());
        System.out.println();
    }

    public String getRandomWord() {
        int randomNumber = (int)(Math.random()*15 + 1);
        String selectedString;
        if (randomNumber == 1) {
            selectedString = "banana";
        } else if (randomNumber == 2) {
            selectedString = "skramstad";
        } else if (randomNumber == 3) {
            selectedString = "keith";
        } else if (randomNumber == 4) {
            selectedString = "melissa";
        } else if (randomNumber == 5) {
            selectedString = "elisa";
        } else if (randomNumber == 6) {
            selectedString = "xavier";
        } else if (randomNumber == 7) {
            selectedString = "shannon";
        } else if (randomNumber == 8) {
            selectedString = "samantha";
        } else if (randomNumber == 9) {
            selectedString = "variable";
        } else if (randomNumber == 10) {
            selectedString = "concatenation";
        } else if (randomNumber == 11) {
            selectedString = "string";
        } else if (randomNumber == 12) {
            selectedString = "mitochondria";
        } else if (randomNumber == 13) {
            selectedString = "asymptote";
        } else {
            selectedString = "topoisomerase";
        }        
        return selectedString;
    }

    private void showHangman(int inc) {
        switch (inc) {
            case 0:
                break;
            case 1:
                System.out.println("We've got the scaffold ready...");
                System.out.println("   _______");
                System.out.println("    |/      |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("   _|___");
                break;
            case 2:
                System.out.println("Second wrong.. he's hanging...");
                System.out.println("   _______");
                System.out.println("    |/      |");
                System.out.println("    |      (_)");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("   _|___");
                break;
            case 3:
                System.out.println("He's raising his hands for help.. Help him!...");
                System.out.println("   _______");
                System.out.println("    |/      |");
                System.out.println("    |      (_)");
                System.out.println("    |      \\|/");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("   _|___");
                break;
            case 4:
                System.out.println("No time left.. one false step...");
                System.out.println("   _______");
                System.out.println("    |/      |");
                System.out.println("    |      (_)");
                System.out.println("    |      \\|/");
                System.out.println("    |       |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("   _|___");
                break;
            case 5:
                System.out.println("Times up!");
                System.out.println("   _______");
                System.out.println("    |/      |");
                System.out.println("    |      (_)");
                System.out.println("    |      \\|/");
                System.out.println("    |       |");
                System.out.println("    |      / \\");
                System.out.println("    |");
                System.out.println("   _|___");
                break;
        }
    }

    private String displayCurrentStatus() {
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < wordStatus.length(); i++) {
            newStr.append(wordStatus.charAt(i));
            newStr.append(" ");
        }
        return newStr.toString();
    }
}
