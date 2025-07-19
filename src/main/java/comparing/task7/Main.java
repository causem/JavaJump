package comparing.task7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Iga Świątek", 24);
        Person p2 = new Person("Roger Federer", 43);
        Person p3 = new Person("Jannik Sinner", 23);
        Person p4 = new Person("Carlos Alcaraz", 22);
        Person p5 = new Person("Novak Djokovic", 38);

        List<Person> tennisPlayers = List.of(p1, p2, p3, p4, p5);

        List<Person> tennisPlayersSortByAge = new ArrayList<>(tennisPlayers);

        tennisPlayersSortByAge.sort(Comparator.comparing(Person::getAge));

        tennisPlayersSortByAge.forEach(System.out::println);

    }
}
