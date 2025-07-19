package string;

import java.sql.PreparedStatement;
import java.util.HashSet;
import java.util.Set;

//7. Usuwanie powtórzeń liter
//Usuń wszystkie powtarzające się litery w Stringu, zachowując pierwsze wystąpienie każdej litery.
//Przykład:
//Input: "programowanie"
//Output: "progamniew"
public class Task7 {

    public static void main(String[] args) {
        String s = "programowanie";
        System.out.println(removeDuplicates(s));
    }

    static String removeDuplicates(String text){

        StringBuilder result = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for (char c : text.toCharArray()){
            if(!seen.contains(c)){
                seen.add(c);
                result.append(c);
            }
        }
        return result.toString();
    }


}
