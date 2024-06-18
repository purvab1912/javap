public class solidpatterns {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;

        // rectangle

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // sqaure

        int p = 6;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= p; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // triangle
        int a = 4;

        for (int i = a; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= a - i; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }

        System.out.println();

    }
}
