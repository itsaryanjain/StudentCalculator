import java.util.Scanner;

class Studentcalculator {

    // Method to determine grade based on average
    static String getGrade(double average) {
        if (average >= 90) {
            return "A+";
        } else if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter number of subjects: ");
        int subjectCount = scanner.nextInt();

        int[] marks = new int[subjectCount];
        int total = 0;

        System.out.println("Enter marks for each subject:");
        for (int i = 0; i < subjectCount; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            total += marks[i];
        }

        double average = (double) total / subjectCount;
        String grade = getGrade(average);

        System.out.println("\n--- Result ---");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
