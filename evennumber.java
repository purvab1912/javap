import java.util.Scanner;

public class evennumber {
    public static void main(String[] args) {
        int n;
        // int number;

        Scanner number = new Scanner(System.in);
        System.out.print("Type a number:");
        n = number.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

}
