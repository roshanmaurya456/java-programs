import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversed = reverseDigits(number);
        System.out.println("Reversed number: " + reversed);
        scanner.close();
    }

    private static int reverseDigits(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;
    }
}