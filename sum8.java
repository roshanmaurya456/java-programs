public class sum8 {

    public static void main(String[] args) {
        int number = 1;

        for (int i = 1; i <= 13; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%4d", number);
                number++;
            }
            System.out.println();
        }
    }
}