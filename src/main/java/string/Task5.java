package string;

//5. Zamiana wielkości liter co drugi znak
//Napisz metodę, która zmienia co drugi znak w Stringu na wielką literę, zaczynając od indeksu 0 jako mała, 1 jako wielka itd.
//Przykład:
//Input: "programowanie"
//Output: "pRoGrAmOwAnIe"
public class Task5 {

    public static void main(String[] args) {
        String s = "programowanie";
        System.out.println(alternateCase(s));
    }

    static String alternateCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (i % 2 == 0) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
        }
        return result.toString();
    }
}
