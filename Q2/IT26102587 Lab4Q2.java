import java.util.Scanner;

public class IT26102587 Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double examMarks;
        double labMarks;

        // Read and validate exam marks (0 to 100).
        do {
            System.out.print("Enter exam marks (0-100): ");
            examMarks = input.nextDouble();

            if (examMarks < 0 || examMarks > 100) {
                System.out.println("Invalid marks. Enter a value from 0 to 100.");
            }
        } while (examMarks < 0 || examMarks > 100);

        // Read and validate lab submission marks (0 to 100).
        do {
            System.out.print("Enter lab submission marks (0-100): ");
            labMarks = input.nextDouble();

            if (labMarks < 0 || labMarks > 100) {
                System.out.println("Invalid marks. Enter a value from 0 to 100.");
            }
        } while (labMarks < 0 || labMarks > 100);

        // Read percentages until they add up to 100.
        double examPercentage;
        double labPercentage;

        do {
            System.out.print("Enter percentage for exam marks: ");
            examPercentage = input.nextDouble();

            System.out.print("Enter percentage for lab submission marks: ");
            labPercentage = input.nextDouble();

            if (examPercentage < 0 || labPercentage < 0
                    || examPercentage > 100 || labPercentage > 100
                    || Math.abs((examPercentage + labPercentage) - 100.0) > 0.000001) {
                System.out.println("Invalid percentages. They must be between 0 and 100 and add up to 100.");
            } else {
                break;
            }
        } while (true);

        double finalMark = (examMarks * examPercentage / 100.0)
                         + (labMarks * labPercentage / 100.0);

        System.out.printf("Final mark: %.2f%n", finalMark);

        input.close();
    }
}
