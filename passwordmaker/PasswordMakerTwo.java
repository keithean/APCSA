import java.util.Scanner;

public class PasswordMakerTwo {
    public static void main(String[] args) {
        PasswordMakerTwo passwordMaker = new PasswordMakerTwo();
        passwordMaker.start();
    }

    public void start() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the password: ");
        int passwordLength = input.nextInt();

        if (passwordLength < 10) {
            System.out.println("Password length must be at least 10 characters.");
        } else {
            System.out.print("Enter the number of lowercase letters: ");
            int lowercaseCount = input.nextInt();

            System.out.print("Enter the number of uppercase letters: ");
            int uppercaseCount = input.nextInt();

            System.out.print("Enter the number of numbers: ");
            int numberCount = input.nextInt();

            System.out.print("Enter the number of symbols: ");
            int symbolCount = input.nextInt();

            if (lowercaseCount + uppercaseCount + numberCount + symbolCount > passwordLength) {
                System.out.println("Total count of lowercase, uppercase, numbers, and symbols exceeds password length.");
            } else {
                String password = generateCustomPassword(passwordLength, lowercaseCount, uppercaseCount, numberCount, symbolCount);
                System.out.println("Generated password: " + password);
            }
        }

        input.close();
    }

    public String generateCustomPassword(int length, int lowercaseCount, int uppercaseCount, int numberCount, int symbolCount) {
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String symbols = "@#%$`~!^&*–_?<>";

        StringBuilder passwordBuilder = new StringBuilder();

        for (int i = 0; i < lowercaseCount; i++) {
            passwordBuilder.append(lowercaseLetters.charAt((int) (Math.random() * lowercaseLetters.length())));
        }

        for (int i = 0; i < uppercaseCount; i++) {
            passwordBuilder.append(uppercaseLetters.charAt((int) (Math.random() * uppercaseLetters.length())));
        }

        for (int i = 0; i < numberCount; i++) {
            passwordBuilder.append(numbers.charAt((int) (Math.random() * numbers.length())));
        }

        for (int i = 0; i < symbolCount; i++) {
            passwordBuilder.append(symbols.charAt((int) (Math.random() * symbols.length())));
        }

        while (passwordBuilder.length() < length) {
            passwordBuilder.append(lowercaseLetters.charAt((int) (Math.random() * lowercaseLetters.length())));
        }

        return passwordBuilder.toString();
    }
}
