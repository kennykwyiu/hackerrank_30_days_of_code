package kenny.thirtydays;

import java.util.Scanner;

public class Day12Inheritance {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber);
    }

}

class Student extends Person {
    String firstName;
    String lastName;
    int idNumber;
    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] scores) {
        super(firstName, lastName, identification);
        this.testScores = scores;
    }

    public char calculate() {
        int sum = 0;
        for (int score : testScores) {
            sum += score;
        }
        int avgScore = sum / testScores.length;

        if (avgScore >= 90 && avgScore <= 100) {
            return 'O';
        } else if (avgScore >= 80 && avgScore < 90) {
            return 'E';
        } else if (avgScore >= 70 && avgScore < 80) {
            return 'A';
        } else if (avgScore >= 55 && avgScore < 70) {
            return 'P';
        } else if (avgScore >= 40 && avgScore < 55) {
            return 'D';
        } else {
            return 'T';
        }
    }

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
}