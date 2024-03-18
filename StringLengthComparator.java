import java.util.Scanner;

public class StringLengthComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("String 1: ");
        String string1 = scanner.nextLine();

        System.out.print("String 2: ");
        String string2 = scanner.nextLine();

        int length1 = string1.length();
        int length2 = string2.length();

        System.out.println((length1 > length2) ? (string1 + " is larger than " + string2) : (length1 < length2) ? (string2 + " is larger than " + string1) : "Both strings are of equal length.");

    }
}