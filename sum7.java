public class sum7 {

    public static void main(String[] args) {
        System.out.printf("%8s", "Number");
        for (int i = 0; i <= 9; i++) {
            System.out.printf("%8.1f", i / 10.0);
        }
        System.out.println();

        for (int i = 0; i <= 9; i++) {
            System.out.printf("%8.1f", i / 10.0);
            for (int j = 0; j <= 9; j++) {
                System.out.printf("%8.4f", Math.sqrt(i /10.0 * j / 10.0));
            }
            System.out.println();
        }
    }
}