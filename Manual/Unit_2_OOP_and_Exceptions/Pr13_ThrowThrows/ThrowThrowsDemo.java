package Manual.Unit_2_OOP_and_Exceptions.Pr13_ThrowThrows;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class ThrowThrowsDemo {
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Valid age for registration");
    }

    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (InvalidAgeException ex) {
            System.out.println("Handled: " + ex.getMessage());
        }
    }
}
