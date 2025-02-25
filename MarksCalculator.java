import java.util.Scanner;

public class MarksCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSubjects = 5;
        int[] marks = new int[totalSubjects];
        int totalMarks = 0;

        // Input marks for 5 subjects
        for (int i = 0; i < totalSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        // Calculate percentage
        double percentage = (double) totalMarks / (totalSubjects * 100) * 100;

        // Display results
        System.out.println("Total Marks: " + totalMarks + " out of " + (totalSubjects * 100));
        System.out.println("Percentage: " + percentage + "%");

        scanner.close();
    }
}
