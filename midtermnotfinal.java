
import java.util.Scanner;

public class midtermnotfinal  {
    static int num1 = 0, num2 = 0, sum = 0, diff = 0, prod = 0, qou = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        mainMenu();
        choice = menuChoice();

        switch (choice) {
            case 1:
                add();
                break;
            case 2:
                subtract();
                break;
            case 3:
                multiply();
                break;
            case 4:
                divide();
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    static int menuChoice() {
        int choice = 0;

        do {
            System.out.print("\nEnter choice (1-5): ");
            choice = scanner.nextInt();

            if (choice < 1 || choice > 5) {
                choice = 0;
                System.out.println("Invalid Input.");
            } else {
                break;
            }
        } while (true);

        return choice;
    }

    static boolean tryAgain() {
        char retry = ' ';
        boolean isTryAgain = true;

        do {
            System.out.print("Try again? (y/n)");
            retry = scanner.next().charAt(0);

            if (retry != 'n' && retry != 'N' && retry != 'y' && retry != 'Y') {
                System.out.println("Invalid input");
            } else if (retry == 'y' || retry == 'Y') {
                isTryAgain = true;
                break;
            } else {
                isTryAgain = false;
                break;
            }
        } while (true);

        return isTryAgain;
    }

    static void mainMenu() {
        System.out.println("╔══════════════════════╗");
        System.out.println("║      MAIN MENU       ║");
        System.out.println("║══════════════════════║");
        System.out.println("║ 1. Addition          ║");
        System.out.println("║ 2. Subtraction       ║");
        System.out.println("║ 3. Multiplication    ║");
        System.out.println("║ 4. Division          ║");
        System.out.println("║ 5. End Program       ║");
        System.out.println("╚══════════════════════╝");
    }

    static void add() {
        System.out.println("Welcome to Addition");
        userAdd();
        sum = num1 + num2;
        System.out.printf("The sum of %d and %d is %d\n", num1, num2, sum);
        if (tryAgain()) add();
    }

    static void subtract() {
        System.out.println("Welcome to Subtraction");
        userAdd();
        diff = num1 - num2;
        System.out.printf("The difference of %d and %d is %d\n", num1, num2, diff);
        if (tryAgain()) subtract();
    }

    static void multiply() {
        System.out.println("Welcome to Multiplication");
        userAdd();
        prod = num1 * num2;
        System.out.printf("The product of %d and %d is %d\n", num1, num2, prod);
        if (tryAgain()) multiply();
    }

    static void divide() {
        System.out.println("Welcome to Division");
        userAdd();
        qou = num1 / num2;
        System.out.printf("The quotient of %d and %d is %d\n", num1, num2, qou);
        if (tryAgain()) divide();
    }

    static void userAdd() {
        System.out.print("Enter first num: ");
        num1 = scanner.nextInt();
        System.out.print("Enter second num: ");
        num2 = scanner.nextInt();
    }
}

