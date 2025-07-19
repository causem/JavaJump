package string;
//6. Zliczanie słów
//Napisz metodę, która zlicza, ile słów zawiera String. Słowa są oddzielone spacjami, tabulatorami lub znakami nowej linii.
public class Task6 {

    public static void main(String[] args) {
        String s = "Siała baba mak i nie wiedziała jak";
        System.out.println("Liczba słów: " + countWords(s));
    }

    static int countWords(String text){
        if(text==null || text.trim().isEmpty()){
            return 0;
        }

        String[] words = text.trim().split("\\s+");
        return words.length;
    }
}
