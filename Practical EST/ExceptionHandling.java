public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } 
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } 
        finally {
            System.out.println("Finally block always executes!");
        }
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above");
        } else {
            System.out.println("You are eligible!");
        }
    }
}
