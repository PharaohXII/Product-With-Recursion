import java.util.Scanner;

public class RecursiveProduct {

    // Recursive method to calculate the product
    public static int calculateProduct(int[] numbers, int index) {
        // Base case: if index is 0, return the first number
        if (index == 0) {
            return numbers[0];
        }
        // Recursive case: multiply the current number by the product of previous numbers
        return numbers[index] * calculateProduct(numbers, index - 1);
    }

    // Method to get user input recursively
    public static void getNumbers(int[] numbers, int index, Scanner scanner) {
        if (index == numbers.length) {
            return; // All numbers have been entered
        }
        System.out.print("Enter number " + (index + 1) + ": ");
        numbers[index] = scanner.nextInt();
        getNumbers(numbers, index + 1, scanner); // Recursive call to get the next number
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numbers = new int[5]; // Array to store the five numbers
            
            System.out.println("Please enter 5 numbers:");
            getNumbers(numbers, 0, scanner); // Get numbers using recursion
            
            int product = calculateProduct(numbers, numbers.length - 1); // Calculate product recursively
            
            System.out.println("The product of the entered numbers is: " + product);
        } // Array to store the five numbers
    }
}
