package string;
//Skracanie imion
//Dla listy pełnych imion (np. "Jan Kowalski"), wyodrębnij inicjały i wypisz w formacie: J.K.
//Przykład:
//Input: "Jan Kowalski"
//Output: "J.K."
public class Task4 {

    public static void main(String[] args) {
        String name = "jan euzebiusz kowalski";
        System.out.println(getInitials(name));
    }

    static String getInitials(String fullName){
        String[] parts = fullName.trim().split("\\s+");
        String initials = "";
        for(String part : parts){
            if(!part.isEmpty()) {
                initials = initials + part.charAt(0) + ".";
            }
        }
        return initials.toUpperCase();
    }
}
