package string;

public class Task1 {
//Zamiana znaków specjalnych
//Napisz metodę, która otrzymuje String i zamienia wszystkie znaki @ na (at), a # na (hash). Zwraca nowy przekształcony String.
//Przykład:
//Input: "mail@domain.com #tag"
//Output: "mail(at)domain.com (hash)tag"
    public static void main(String[] args) {
        System.out.println(replaceChar("marta@marta"));

    }

    static String replaceChar(String word){
       return word.replace('@','#');
    }
}
