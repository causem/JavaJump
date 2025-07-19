package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Zlicz, ile razy występuje dane imię w liście.
//➤ Map<String, Integer>, containsKey, put
public class Task5 {
//5.  Zlicz, ile razy występuje dane imię w liście.
//➤ Map<String, Integer>, containsKey, put
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Beata");
        names.add("Agata");
        names.add("Karolina");
        names.add("Karolina");
        names.add("Anna");


        Map<String, Integer> countNames = new HashMap<>();
        for(String n:names){
            countNames.put(n, countNames.getOrDefault(n,0)+1);
        }
        System.out.println(countNames);
    }
}
