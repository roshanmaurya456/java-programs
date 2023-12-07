import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int factorial = computeFactorial(number);
        System.out.println("Factorial of the number: " + factorial);
        scanner.close();
    }

    private static int computeFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}