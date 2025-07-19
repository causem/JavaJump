package exceptions.Task2;

public class Registration {


    public static void registerPerson(int age) throws TooYoungException {
        if (age < 18) {
            throw new TooYoungException("To young to register, person is " + age + " years old.");
        }
        System.out.println("Registration is complete");
    }

    public static void main(String[] args) {

        int age = 17;

        try {
            registerPerson(age);
        } catch (TooYoungException e) {
            System.out.println("Error of registration: " + e.getMessage());
        }
    }
}
