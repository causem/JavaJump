package string;

import java.util.Map;

//8. Zamiana cyfr na słowa
//Napisz metodę, która zamienia wszystkie cyfry w tekście na ich słowne odpowiedniki (tylko 0–9). Użyj switch lub Map.
//Przykład:
//Input: "Mam 2 psy i 3 koty"
//Output: "Mam dwa psy i trzy koty"
public class Task8 {

    public static void main(String[] args) {

        String s = "Mam 2 psy, 3 koty, 4 papugi i 9 chomików";
        System.out.println(changeDigitsToWords(s));
    }

    static String changeDigitsToWords(String text){

        Map<Character,String> digitWords = Map.of(
                '0',"zero",
                '1',"jeden",
                '2',"dwa",
                '3',"trzy",
                '4',"cztery",
                '5',"pięć",
                '6',"sześć",
                '7',"siedem",
                '8',"osiem",
                '9',"dziewięć");

        StringBuilder result = new StringBuilder();

        for(char c : text.toCharArray()){
            if(digitWords.containsKey(c)) {
                result.append(digitWords.get(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();

    }
}
