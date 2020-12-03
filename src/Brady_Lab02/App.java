
public class App {

    public static void main(String args[]) {
        final int AmtOfSemesters = 8;
        int StartingSemester = 1;
        double totalGPAs = 0.00;

        Student student1 = new Student("Jenna", "Plot's", 20, 3.55);

        double[] averages = new double[AmtOfSemesters];

        System.out.println("Report for the GPA History for All Semesters:");
        System.out.println("");

        for (int count = 0; count < AmtOfSemesters; count++) {
            student1.setGPA(student1.SemesterGPA());
            averages[count] = student1.getGPA();
            System.out.printf("Semester %d GPA for %s: %.2f\n", StartingSemester, student1.getName(), averages[count], "\n");
            totalGPAs = totalGPAs + student1.getGPA();
            StartingSemester++;
        }

        double AverageGPAs = totalGPAs / AmtOfSemesters;

        student1.setGPA(AverageGPAs);

        System.out.println("");

        System.out.printf("%s / Student's Average GPA: %.2f\n", student1.getInfo(), AverageGPAs);

    }
}
