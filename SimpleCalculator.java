import java.io.IOException;
import java.util.Scanner;

public class SimpleCalculator {
   static Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) throws IOException, InterruptedException {
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      mainMenu();
   }

   static void mainMenu() {
      boolean continueCalculating = true;

      while (continueCalculating) {
         int choice = 0;
         clear();
         System.out.println("╔══════════════════════╗");
         System.out.println("║      MAIN MENU       ║");
         System.out.println("║══════════════════════║");
         System.out.println("║ 1. Addition          ║");
         System.out.println("║ 2. Subtraction       ║");
         System.out.println("║ 3. Multiplication    ║");
         System.out.println("║ 4. Division          ║");
         System.out.println("║ 5. Exit Program      ║");
         System.out.println("╚══════════════════════╝");

         do {
            System.out.print("\nEnter choice: ");
            while (!scanner.hasNextInt()) {

               System.out.println("Invalid input. Please enter a number.");
               scanner.next();
            }
            choice = scanner.nextInt();

            if (choice < 1 || choice > 5) {
               System.out.println("Invalid Input. Please enter a number between 1 and 5.");
            } else {
               break;
            }
         } while (true);

         switch (choice) {
            case 1:
               performAddition();
               break;
            case 2:
               performSubtraction();
               break;
            case 3:
               performMultiplication();
               break;
            case 4:
               performDivision();
               break;
            case 5:
               System.out.println("Ciao");
               continueCalculating = false;
               break;
         }

         if (continueCalculating) {
            System.out.print("\nDo you want to try another operation? (yes/no): ");
            String tryAgain = scanner.next().toLowerCase();

            if (!tryAgain.equals("yes")) {
               clear();
               continueCalculating = false;
            }
         }
      }
   }

   static void performAddition() {
      System.out.print("Enter first number: ");
      int num1 = scanner.nextInt();
      System.out.print("Enter second number: ");
      int num2 = scanner.nextInt();

      int sum = num1 + num2;

      System.out.printf("The sum of %d and %d is %d\n", num1, num2, sum);
   }

   static void performSubtraction() {
      System.out.print("Enter first number: ");
      int num1 = scanner.nextInt();
      System.out.print("Enter second number: ");
      int num2 = scanner.nextInt();

      int diff = num1 - num2;

      System.out.printf("The difference of %d and %d is %d\n", num1, num2, diff);
   }

   static void performMultiplication() {
      System.out.print("Enter first number: ");
      int num1 = scanner.nextInt();
      System.out.print("Enter second number: ");
      int num2 = scanner.nextInt();

      int prod = num1 * num2;

      System.out.printf("The product of %d and %d is %d\n", num1, num2, prod);
   }

   static void performDivision() {
      System.out.print("Enter first number: ");
      int num1 = scanner.nextInt();

      int num2;
      do {
         System.out.print("\nEnter second number (non-zero): ");
         num2 = scanner.nextInt();

         if (num2 == 0) {
            System.out.println("Cannot be divided by 0.");
         }
      } while (num2 == 0);

      int quo = num1 / num2;
      System.out.printf("The quotient of %d and %d is %d\n", num1, num2, quo);
   }

   static void clear() {
      try {
         ClearScreen.clearScreen();
      } catch (IOException | InterruptedException e) {
         e.printStackTrace();
      }
   }

   class ClearScreen {
      public static void clearScreen() throws IOException, InterruptedException {
         new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      }
   }
}



