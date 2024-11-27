import java.util.Scanner;

// Custom exception class for wrong age input
class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}

// Father class
class Father {
    private int age;

    // Constructor for Father class
    public Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Father's age cannot be negative.");
        }
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}

// Son class that extends Father
class Son extends Father {
    private int sonAge;

    // Constructor for Son class
    public Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge); // Calls the Father's constructor

        if (sonAge < 0) {
            throw new WrongAge("Son's age cannot be negative.");
        }

        // Check if son's age is greater than or equal to father's age
        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age cannot be greater than or equal to Father's age.");
        }

        this.sonAge = sonAge;
    }

    public int getSonAge() {
        return this.sonAge;
    }
}

// Main class to test the program with user input
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking user input for father's age
            System.out.print("Enter Father's age: ");
            int fatherAge = scanner.nextInt();

            // Taking user input for son's age
            System.out.print("Enter Son's age: ");
            int sonAge = scanner.nextInt();

            // Create Father and Son objects with the user input
            Father father = new Father(fatherAge);
            Son son = new Son(fatherAge, sonAge);

            System.out.println("Father's age: " + father.getAge());
            System.out.println("Son's age: " + son.getSonAge());

        } catch (WrongAge e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close(); // Close the scanner to prevent resource leak
        }
    }
}
