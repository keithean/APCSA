import java.util.Scanner;

public class PasswordMaker {
    public static void main(String[] args) {
        PasswordMaker passwordMaker = new PasswordMaker();
        passwordMaker.start();
    }

    public void start() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the password: ");
        int passwordLength = input.nextInt();

        if (passwordLength < 10) {
            System.out.println("Password length must be at least 10 characters.");
        } else {
            String password = generateRandomPassword(passwordLength);
            System.out.println("Generated password: " + password);
        }

        input.close();
    }

    public String generateRandomPassword(int length) {
        String[] letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] symbols = {"@","#","%","$","`","~","!","^","&","*","–","_","?","<",">"};

        StringBuilder passwordBuilder = new StringBuilder();
        passwordBuilder.append((letters[(int)(Math.random() * 26)]).toUpperCase());

        for (int i = 1; i < length - 2; i++) {
            passwordBuilder.append(letters[(int)(Math.random() * 26)]);
        }

        passwordBuilder.append(symbols[(int)(Math.random() * 15)]);

        return passwordBuilder.toString();
    }
}
