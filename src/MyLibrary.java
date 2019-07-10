import java.util.*;

public class MyLibrary {
    public MyLibrary() {
        List<Book> noBookDay = new ArrayList<>();
        noBookDay.add(new Book());
        List<Book> firstDay = new ArrayList<>();
        firstDay.add(new Book("The Invisible Man", "H.G.Wells"));
        firstDay.add(new Book("Intermezzo", "M.M.Kotsubinskyi"));

        List<Book> secondDay = new ArrayList<>();
        secondDay.add(new Book("Sapiens: A Brief History of Humankind", "Yuval Noah Harari"));

        Map<String, List<Book>> accounting = new HashMap<>();
        accounting.put("2019-07-18", secondDay);
        accounting.put("2019-06-06", firstDay);
        System.out.println("The days when i had taken books were "+ accounting.keySet());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("The books I had taken were  "+ accounting.values());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("On 2019-07-18 I took "+ accounting.get("2019-06-06"));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Which books I have taken on 2019-09-09?"+accounting.getOrDefault("2001-09-09", noBookDay));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Which books I have taken on 2019-07-18?"+accounting.getOrDefault("2019-07-18", Collections.emptyList()));
    }
}
