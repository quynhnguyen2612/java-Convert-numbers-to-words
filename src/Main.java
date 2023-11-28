import java.util.Scanner;

public class Main {
    private static final String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer (up to 3 digits): ");
        int number = scanner.nextInt();
        if (number < 0 || number > 999) {
            System.out.println("Number out of range");
        } else {
            System.out.println(convertToWords(number));
        }
    }

    public static String convertToWords(int number) {
        if (number == 0) {
            return "zero";
        }
        String words = "";
        if (number / 100 > 0) {
            words += units[number / 100] + " hundred ";
            number %= 100;
        }
        if (number > 10 && number < 20) {
            words += teens[number - 10];
        } else {
            words += tens[number / 10];
            words += " " + units[number % 10];
        }
        return words.trim();
    }
}
