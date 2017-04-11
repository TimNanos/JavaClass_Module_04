package by.epam.nanos;

import java.util.Random;

public class Task3 {
    private static final int totalStudents = 10;
    private static final int totalGrades = 5;
    private static final int maxGrade = 10;

    private Group getRandomGroup(){
        Student3[] student3 = new Student3[totalStudents];
        Random random = new Random();

        // Generate random students
        for (int i = 0; i < student3.length; i++) {
            // Generate random grades
            int[] grades = new int[totalGrades];
            for (int j = 0; j < grades.length; j++) {
                grades[j] = random.nextInt(maxGrade);
            }
            student3[i] = new Student3(grades);
        }
        return new Group(student3);
    }

    Task3(){
        System.out.println("\nTask 3");

        // Generate random students
        Group group = getRandomGroup();

        // Print the group information
        group.print();

        // Get the numbers
        System.out.println("Average group grade: " + group.getAverageGrade() + "\nExcellent students: " + group.getExcellentStudentsCount()
                + "\nStugents with grade \"2\": " + group.getStudentsWithGrade2Count());
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
        for (int i = 0; i < grades.length; i++) {
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
        for (int i = 0; i < grades.length; i++) {
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
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] != 5) {
                result = false;
                break;
            }
        }
        return result;
    }

    // Get grades string
    String getGradesString(){
        String result = new String();
        for (int i = 0; i < grades.length; i++) {
            result += grades[i];
            if (i < grades.length - 1) {
                result += ", ";
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

    // Print group information
    public void print(){// и также следует соблюдать единнобразие, в класе выще все методы без атрибута доступа, а тут уже с атрибутом
        System.out.println("Students group: ");
        for (int i = 0; i < student3s.length; i++) {
            System.out.println("Student " + (i+1) + " grades: " + student3s[i].getGradesString() + ". Average grade: " + student3s[i].getAverageGrade());
        }
    }

    // Get average group grade
    public double getAverageGrade(){
        long gradesSum = 0;
        long totalGrades = 0;
        for (int i = 0; i < student3s.length; i++) {
            gradesSum += student3s[i].getGradesSum();
            totalGrades += student3s[i].getGradesCount();
        }
        return gradesSum / totalGrades;
    }

    public int getExcellentStudentsCount(){
        int result = 0;
        for (int i = 0; i < student3s.length; i++) {
            if (student3s[i].isExcellent()) {
                result++;
            }
        }
        return result;
    }

    public int getStudentsWithGrade2Count(){
        int result = 0;
        for (int i = 0; i < student3s.length; i++) {
            if (student3s[i].hasTwo()) {
                result++;
            }
        }
        return result;
    }
}
