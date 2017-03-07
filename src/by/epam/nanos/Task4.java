package by.epam.nanos;

import java.util.Random;

public class Task4 {
    private static final int totalAbiturients = 100;
    private static final int totalGrades = 5;
    private static final int maxGrade = 10;
    private static final double passGrade = 6.5;
    private static final int abiturientsToPass = 25;

    Abiturient[] getRandomAbiturients(){
        Abiturient[] abiturients = new Abiturient[totalAbiturients];
        Random random = new Random();
        // Generate random abiturients
        for (int i = 0; i < abiturients.length; i++) {
            // Generate random grades
            int[] grades = new int[totalGrades];
            for (int j = 0; j < grades.length; j++) {
                grades[j] = random.nextInt(maxGrade);
            }
            abiturients[i] = new Abiturient(grades);
        }
        return abiturients;
    }

    Task4() {
        System.out.println("\nTask 4");

        // Generate random abiturients
        Abiturient[] abiturients = getRandomAbiturients();

        int passedAbiturients = 0;
        // Check if any of the abiturients pass
        for (int i = 0; i < abiturients.length; i++) {
            if (abiturients[i].getAverageGrade() >= passGrade && passedAbiturients < abiturientsToPass) {
                System.out.println("Abiturient #" + i + " passed.");
                passedAbiturients++;
            }
        }
    }
}

class Abiturient {
    private int[] grades;

    Abiturient(int[] grades) {
        this.grades = grades;
    }

    double getAverageGrade(){
        if (grades.length == 0) {
            return 0;
        }
        long gradesSum = 0;
        for (int i = 0; i < grades.length; i++) {
            gradesSum += grades[i];
        }
        return gradesSum / grades.length;
    }
}
