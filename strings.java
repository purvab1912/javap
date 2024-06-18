import java.util.Scanner;

public class strings {

    public static void main(String[] args) {

        String firstName = "Purva";
        String secondName = "Bhokare";

        String fullName = firstName + " " + secondName;
        System.out.println(fullName); // concatenation

        System.out.println(fullName.length());// lenght

        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        System.out.println(fullName.substring(0, 6)); // substring

        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

        int number1 = 123;
        String str1 = Integer.toString(number);
        System.out.println(str.length());

    }

}
