package kenny.thirtydays;

import java.util.Scanner;

public class Day4ClassVSInstance {
    public static class Person {
        private int age;

        public Person(int initialAge) {
            // Add some more code to run some checks on initialAge
            if (initialAge < 0) {
                System.out.println("Age is not valid, setting age to 0.");
            }
            this.age = initialAge;
        }

        public void amIOld() {
            // Write code determining if this person's age is old and print the correct statement:
            if (age >= 13 && age <18) {
                System.out.println("You are a teenager.");
            } else if (age < 13) {
                System.out.println("You are young.");
            } else {
                System.out.println("You are old.");
            }
        }

        public void yearPasses() {
            // Increment this person's age.
            age++;
        }
    }
}
