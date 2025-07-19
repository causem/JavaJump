package string;

import java.util.Set;

//iczanie samogłosek
//Napisz metodę, która zlicza, ile w podanym Stringu znajduje się samogłosek (a, e, i, o, u, y – bez względu na wielkość liter).
public class Task3 {

    public static void main(String[] args) {
        System.out.println(countVowels("AbraKadabra"));
    }

    static int countVowels(String text){
        int count = 0;
        String vowels = "aeiouąęó";

        String textToCheck = text.toLowerCase();

        for(char c: textToCheck.toCharArray()){
                if(vowels.indexOf(c) != -1) {
                    count++;
                }
    }
        return count;
    }

    public static int countVowels1(String text) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'ą', 'ę', 'ó');
        int count = 0;

        for (char c : text.toLowerCase().toCharArray()) {
            if (vowels.contains(c)) {
                count++;
            }
        }

        return count;
    }

}
