import java.util.Scanner;

public class lunarnewyear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the year you were born in format 'XXXX'.");
        int birthYear = input.nextInt();
        determineChineseZodiac(birthYear);
    }

    public static void determineChineseZodiac(int birthYear) {
        String animal = "";
        String description = "";

        int sign = (birthYear % 12);

        switch (sign) {
            case 0:
                animal = "Monkey";
                description = "sharp, smart, but naughty.";
                break;
            case 1:
                animal = "Rooster";
                description = "observant and hardworking.";
                break;
            case 2:
                animal = "Dog";
                description = "loyal and honest, amiable and kind, cautious and prudent.";
                break;
            case 3:
                animal = "Pig";
                description = "diligent, compassionate, and generous.";
                break;
            case 4:
                animal = "Rat";
                description = "quick-witted, resourceful, and smart but lack courage.";
                break;
            case 5:
                animal = "Ox";
                description = "diligence, dependability, strength and determination.";
                break;
            case 6:
                animal = "Tiger";
                description = "brave, competitive, unpredictable, and confident.";
                break;
            case 7:
                animal = "Rabbit";
                description = "gentle, quiet, elegant, and alert as well as quick, skillful, kind, patient, and very responsible";
                break;
            case 8:
                animal = "Dragon";
                description = "dominant ambitious, as well as aggressive and angry.";
                break;
            case 9:
                animal = "Snake";
                description = "intelligent and wise.";
                break;
            case 10:
                animal = "Horse";
                description = "animated, active and energetic.";
                break;
            case 11:
                animal = "Goat";
                description = "gentle, mild-mannered, shy, stable, sympathetic, amicable, and brimming with a strong sense of kindheartedness and justice";
                break;
        }

        System.out.println("You were born in the year of the" + animal + " and your personality is " + description);
    }
}
