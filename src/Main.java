import java.util.Scanner;

public class Main {

    // Recursive method
    static void applyRule(int n) {
        // Base case: Terminate the process if the number is 0 or negative
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }

        // Print the number and subtract 5
        System.out.print(n + " ");
        applyRule(n - 5);

        // Print the number and add 5
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.print("Number N: " + n + "\nOutput: ");
        applyRule(n);

        scanner.close();
    }
}
