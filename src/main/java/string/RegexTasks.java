package string;

public class RegexTasks {
    public static void main(String[] args) {

        // Task1 - Napisz metodę walidującą opis zadania. Poprawny opis:
        // ma od 5 do 100 znaków, zawiera tylko litery, cyfry, spacje, kropki i przecinki, nie może zaczynać się ani kończyć spacją.
        String correctText = "Tylko litery, 394,  , ..., oraz ,,,,.";
        String incorrectText = "To jest !!! ,,,,,. ";
        System.out.println("Task 1");
        System.out.println(task1(correctText));
        System.out.println(task1(incorrectText));
        System.out.println();

        // Task2 -  Walidacja adresu e-mail ([a-zA-Z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,})
        String correctMail = "marta@marta.pl";
        String incorrectMail = "marta@marta";
        System.out.println("Task 2");
        System.out.println(task2(correctMail));
        System.out.println(task2(incorrectMail));
        System.out.println();

        // Task 3 - Sprawdzenie, czy hasło ma min. 8 znaków, zawiera cyfrę, dużą literę i znak specjalny.
        String correctPassword = "Haslo12!";
        String incorrectPassword = "Haslo1!";
        System.out.println("Task 3");
        System.out.println(task3(correctPassword));
        System.out.println(task3(incorrectPassword));
        System.out.println();

        // Task 4 - Parsowanie stringów (np. "imię:nazwisko:wiek" → imię, nazwisko, wiek).
        String correctInput = "Jan:Kowalski:33";
        String incorrectInput = "JanKowalski31!";
        System.out.println("Task 4");
        System.out.println(task4(correctInput));
        System.out.println(task4(incorrectInput));
        System.out.println();

        // Task 5 - Zliczanie słów w opisie zadania.
        System.out.println("Task 5");
        String inputNotEmpty = "Opis zadania , gdzie jest zliczona liczba slow -";
        String inputEmpty = "   ";
        System.out.println(task5(inputNotEmpty));
        System.out.println(task5(inputEmpty));
        System.out.println();

        // Task 6 - Liczenie liczby wystąpień danego znaku (np. przecinków).
        System.out.println("Task 6");
        String text1 = ",,To, zdanie ma, , , osiem, przecinków,";
        String text2 = "Tu jest ! aż !! dziecięć !! w!yk!rzyk!nik!ów!";
        System.out.println(task6(text1,','));
        System.out.println(task6(text2,'!'));
    }


    //6. Liczenie liczby wystąpień danego znaku (np. p
    static boolean task1(String text) {
        String regex = "^(?! )[a-zA-Z0-9 .,]{5,100}(?<! )$";
        return text.matches(regex);
    }

    static boolean task2(String text) {
        String regex = "([a-zA-Z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,})";
        return text.matches(regex);
    }

    static boolean task3(String text) {
        if (text == null || text.length() < 8) return false;
        boolean hasDigit = text.matches(".*\\d.*");
        boolean hasUppercase = text.matches(".*[A-Z].*");
        boolean hasSpecial = text.matches(".*[!@#$%^&*()_+=\\-\\[\\]{};:'\"\\\\|,.<>/?].*");
        return hasDigit && hasUppercase && hasSpecial;
    }

    static String task4(String text) {
        String[] parts = text.split(":");
        if (parts.length == 3) {
            String name = parts[0];
            String surname = parts[1];
            String age = parts[2];
            return name + ", " + surname + ", " + age;
        }
        return "Invalid input format";
    }

    static String task4a(String text){
        return text.replaceAll(":", ", ");
    }

    static int task5(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        } else {
            String textClean = text.replaceAll("[^a-zA-Z0-9ąćęłńóśźżĄĆĘŁŃÓŚŹŻ\\s]", "");
            return textClean.trim().split("\\s+").length;
        }
    }

    static int task6(String text, char character) {
        if (text == null) {
            return 0;
        }
        int count = 0;
        for (char c : text.toCharArray()){
            if(c==character){
                count++;
            }
        }
        return count;
    }
}
