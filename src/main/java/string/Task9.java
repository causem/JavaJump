package string;

import java.util.List;
import java.util.regex.Pattern;

//9. Cenzura słów
//Dla zadanego tekstu i listy „brzydkich słów” napisz funkcję, która zamienia każde z tych słów na ***.
//Przykład:
//Input: tekst = "To jest głupi pomysł", brzydkie = ["głupi"]
//Output: "To jest *** pomysł"
public class Task9 {

    public static void main(String[] args) {
        List<String> badWords = List.of("brzydki", "głupi", "zły");
        String s = "Ten tekst jest brzydki, zły, niefajny i głupi!";
        System.out.println(censorText(s, badWords));

    }

    static String censorText(String text, List<String> badWords) {
        for(String word : badWords){
            text = text.replaceAll("(?i)\\b" + word + "\\b", "***");
        }
        return text;
    }
}
