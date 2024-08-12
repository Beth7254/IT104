import java.util.Scanner;

public class NumericalInputs
 {
    public static void main(String[] args) {
        int num1;
        int num2;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            num2 = scanner.nextInt();
        }
        int Sum = num1 + num2;
        int Difference = num1 - num2;
        int Product = num1 * num2;
        double Qoutient = num1 / num2;

        System.out.println(sum(num1, num2));
        System.out.println(difference(num1, num2));
        System.out.println(product(num1, num2));
        System.out.println(qoutient(num1, num2));

    }

    private static String sum(int num1, int num2)
        {
            return "The sum of " + num1 + " and " + num2 + " is " + (num1 + num2);
        }

    private static String difference(int num1, int num2)
        {
            return "The difference of " + num1 + " and " + num2 + " is " + (num1 - num2);
        }

    private static String qoutient(int num1, int num2)
        {
            return "The qoutient of " + num1 + " and " + num2 + " is " + (num1 / num2);
        }

    private static String product(int num1, int num2)
       {
            return "The product of "+ num1 + " and " + num2 + " is " + (num1 * num2);
       }
       
}