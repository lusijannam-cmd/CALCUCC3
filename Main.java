import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("MDS Calculator");
        System.out.println("1. Multiply");
        System.out.println("2. Divide");
        System.out.println("3. Subtract");
        System.out.print("Choose (1-3): ");

        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        switch (choice) {
            case 1:
               System.out.println("Result: " + (a * b));
                break;
            case 2:
             
                break;
            case 3:
               
                break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }
}

