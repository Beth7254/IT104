import java.util.Scanner;

public class InputExample
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Please enter your name: ");

        String name = scanner.nextLine();
        
        System.out.println("Hi,"+ name + " have a great day! ");
        scanner.close();
    }
}

