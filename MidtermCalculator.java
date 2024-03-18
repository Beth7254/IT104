import java.util.Scanner;

public class MidtermCalculator {
   static Scanner scanner = new Scanner(System.in);

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
      boolean continueCalculating = true;

      while (continueCalculating) {
         int choice = 0;
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
               System.out.println("Wrong Input. Please enter a number between 1 and 5.");
            } else {
               break;
            }
         } while (true);

         switch (choice) {
            case 1:
               Addition();
               break;
            case 2:
               Subtraction();
               break;
            case 3:
               Multiplication();
               break;
            case 4:
               Division();
               break;
            case 5:
               System.out.println("Sayonara, soshite arigato");
               continueCalculating = false;
               break;
         }

         if (continueCalculating) {
            System.out.print("\nDo you want to enter another operation? (Y/N): ");
            String tryAgain = scanner.next().toLowerCase();

            if (!tryAgain.equals("Y")) {
               continueCalculating = false;
               break;
            }
         }
      }
   }

   static void Addition() {
      System.out.println("Welcome to Addition");
      userAdd();
      System.out.print("Enter your first value: ");
      int num1 = scanner.nextInt();
      System.out.print("Enter your second value: ");
      int num2 = scanner.nextInt();

      int sum = num1 + num2;

      System.out.printf("The sum of %d and %d is %d\n", num1, num2, sum);
      if (tryAgain())
         Addition();

   }

   static void Subtraction() {
      System.out.println("Welcome to Subtraction");
      userAdd();
      System.out.print("Enter your first value: ");
      int num1 = scanner.nextInt();
      System.out.print("Enter your second value: ");
      int num2 = scanner.nextInt();

      int diff = num1 - num2;

      System.out.printf("The difference of %d and %d is %d\n", num1, num2, diff);
      if (tryAgain())
         Subtraction();
   }

   static void Multiplication() {
      System.out.println("Welcome to Multiplication");
      userAdd();
      System.out.print("Enter your first value: ");
      int num1 = scanner.nextInt();
      System.out.print("Enter your second value: ");
      int num2 = scanner.nextInt();

      int prod = num1 * num2;

      System.out.printf("The product of %d and %d is %d\n", num1, num2, prod);
      if (tryAgain())
         Multiplication();
   }

   static void Division() {
      System.out.println("Welcome to Division");
      userAdd();
      System.out.print("Enter your first value: ");
      int num1 = scanner.nextInt();

      int num2;
      do {
         System.out.print("\nEnter your second value (non-zero): ");
         num2 = scanner.nextInt();

         if (num2 == 0) {
            System.out.println("Cannot be divided by 0.");
         }
      } while (num2 == 0);

      int quo = num1 / num2;
      System.out.printf("The quotient of %d and %d is %d\n", num1, num2, quo);
      if (tryAgain())
         Division();
   }

   static void userAdd() {
      System.out.print("Enter first num: ");
      num1 = scanner.nextInt();
      System.out.print("Enter second num: ");
      num2 = scanner.nextInt();
   }

}
