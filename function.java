import java.util.Scanner;

public class function {

    public static int average(int a, int b, int c) {
        int average = (a + b + c) / 3;
        return average;
    }

    public static void main(String[] args) {
        Scanner number1 = new Scanner(System.in);
        int a = number1.nextInt();
        int b = number1.nextInt();
        int c = number1.nextInt();

        int result = ((a + b + c) / 3);

        System.out.println(result);

    }

}
