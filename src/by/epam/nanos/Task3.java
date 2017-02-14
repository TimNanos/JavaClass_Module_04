package by.epam.nanos;

public class Task3 {
    private static final int totalStudents = 30;
    private static final int totalGrades = 5;

    Task3(){
        System.out.println("Task 3");

        // Generate random students
        Student3[] student3s = new Student3[totalStudents];
        // TODO here!
    }
}

class Student3{
    private int[] grades;

    Student3(int[] grades){
        this.grades = grades;
    }

    // Get the sum of all grades
    double getGradesSum(){
        double result = 0;
        for (int i=0; i<grades.length; i++) {
            result = result + grades[i];
        }
        return result;
    }

    // Get the amount of all grades
    int getGradesCount(){
        return grades.length;
    }

    // Count average grade
    double getAverageGrade(){
        return getGradesSum() / getGradesCount();
    }

    // Check if the student has "2" grade
    boolean hasTwo() {
        boolean result = false;
        for (int i=0; i<grades.length; i++) {
            if (grades[i] == 2) {
                result = true;
                break;
            }
        }
        return result;
    }

    // Check if the student has only "5" grades
    boolean isExcellent() {
        boolean result = true;
        for (int i=0; i<grades.length; i++) {
            if (grades[i] != 5) {
                result = false;
                break;
            }
        }
        return result;
    }
}

class Group {
    private Student3[] student3s;

    Group(Student3[] student3s){
        this.student3s = student3s;
    }
}