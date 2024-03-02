
    import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of courses: ");
        int numCourses = input.nextInt();

        double totalGradePoints = 0;
        double totalCredits = 0;

        for (int i = 1; i <= numCourses; i++) {
            System.out.printf("Enter the grade point for course %d: ", i);
            double gradePoint = input.nextDouble();

            System.out.printf("Enter the credit for course %d: ", i);
            double credit = input.nextDouble();

            totalGradePoints += gradePoint * credit;
            totalCredits += credit;
        }

        double cgpa = totalGradePoints / totalCredits;

        System.out.printf("Your CGPA is %.2f", cgpa);
    }
}

