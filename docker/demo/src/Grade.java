public class Grade {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java GradeCalculator <marks for Course 1> <marks for Course 2> <marks for Course 3>");
            return;
        }

        int course1Marks = Integer.parseInt(args[0]);
        int course2Marks = Integer.parseInt(args[1]);
        int course3Marks = Integer.parseInt(args[2]);

        int totalMarks = course1Marks + course2Marks + course3Marks;
        double percentage = (double) totalMarks / 3;

        System.out.println("Percentage Obtained: " + percentage + "%");

        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Grade: " + grade);
    }
}