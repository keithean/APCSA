import java.util.Scanner;

public class writingmethods {
    public static void main(String[] args) {
        scenario1();

        scenario2();

        scenario3();

        scenario4();

        scenario5();
    }

    //1
    public static void scenario1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        greeting(name);
    }


    public static void greeting(String name) {
        System.out.println("Greetings, " + name);
    }

    //2
    public static void scenario2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();
        fullName(firstName, lastName);
    }


    public static void fullName(String fName, String lName) {
        System.out.println(fName + " " + lName);
    }

    //3
    public static void scenario3() {
        String string = " hello there ";
        String stringNoSpace = removeSpace(string);
        System.out.println(stringNoSpace);
    }


    public static String removeSpace(String string) {
        return string.replaceAll("\\s", "");
    }

    //4
    public static void scenario4() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = input.nextLine();
        int length = totalCharacters(string);
        System.out.println("The string has " + length + " character(s).");
    }


    public static int totalCharacters(String string) {
        return string.length();
    }

    //5
    public static void scenario5() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();
        formatName(firstName, lastName);
    }


    public static void formatName(String firstName, String lastName) {
        System.out.println(lastName + ", " + firstName);
    }
}
