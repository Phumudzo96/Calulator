import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class calculator {

    public static void main(String[] args) {
        System.out.println("Welcome! You'll be entering the first and second numbers");   // we are welcoming the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");      // Asking the user to enter the first number
        int num1 = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter second number: ");       // Asking the user to enter the second number
        int num2 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println(
                "Enter your selection: 1 for Addition, 2 for substraction 3 for Multiplication and 4 for division:");
        int choose = scanner2.nextInt();    // Asking the user what they'd love to do between adding, subtracting, multipling abd dividing
        
        // writing the equation in a text file
        switch (choose) {
            case 1:
                System.out.println(add(num1, num2));
                try {
                    String file_name = "calculations.txt";
                    FileWriter myWriter = new FileWriter(file_name);
                    myWriter.write(num1 + " + " + num2 + " = " + add(num1, num2));  
                    myWriter.close();
                } catch (Exception e) {
                    System.out.println("An error has ocurred");
                }
                break;
            case 2:
                System.out.println(sub(num1, num2));
                try {
                    String file_name = "calculations.txt";
                    FileWriter myWriter = new FileWriter(file_name);
                    myWriter.write(num1 + " - " + num2 + " = " + sub(num1, num2));
                    myWriter.close();
                    System.out.println("Successfully entered!!!");
                } catch (Exception e) {
                    System.out.println("An error has ocurred");
                }
                break;
            case 3:
                System.out.println(mult(num1, num2));
                try {
                    String file_name = "calculations.txt";
                    FileWriter myWriter = new FileWriter(file_name);
                    myWriter.write(num1 + " * " + num2 + " = " + mult(num1, num2));
                    myWriter.close();
                } catch (Exception e) {
                    System.out.println("An error has ocurred");
                }
                break;
            case 4:
                try {
                    System.out.println(div(num1, num2)); // throw Exception
                }
                catch (ArithmeticException e) {
                    // Exception handler
                    System.out.println(
                        "You divided by zero, and that cannot be possible");
                }
                try {
                    String file_name = "calculations.txt";
                    FileWriter myWriter = new FileWriter(file_name);
                    myWriter.write(num1 + " / " + num2 + " = " + div(num1, num2));
                    myWriter.close();
                } catch (Exception e) {
                    System.out.println("An error has ocurred");
                }
                break;
            default:
                System.out.println("Incorrection Operation");
        }

    }
        // reutrning the results of the equation
        public static int add(int num1, int num2) {
            int result = num1 + num2;
            return result;
        }

        public static int sub(int num1, int num2) {
            int result = num1 - num2;
            return result;
        }

        public static int mult(int num1, int num2) {
            int result = num1 * num2;
            return result;
        }
    
        public static int div(int num1, int num2) {
            int result = num1 / num2;
            return result;
            
        }
}
