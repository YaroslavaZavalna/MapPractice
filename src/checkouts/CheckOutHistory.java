package checkouts;

import java.util.*;

public class CheckOutHistory {
    public CheckOutHistory() {
        seeCheckOutHistory();
    }
    private void seeCheckOutHistory(){
        borrowedBookes();
        List<Book> firstCheckOut = new ArrayList<>();
        List<Book> secondCheckOut = new ArrayList<>();
        secondCheckOut.add(borrowedBookes().get(0));
        secondCheckOut.add(borrowedBookes().get(1));
        List<Book> thirdCheckOut = new ArrayList<>();
        thirdCheckOut.add(borrowedBookes().get(2));

        Map<String, List<Book>> accounting = new HashMap<>();
        accounting.put("2019-07-14", firstCheckOut);
        accounting.put("2019-07-18", thirdCheckOut);
        accounting.put("2019-06-06", secondCheckOut);
        System.out.println("The days when i had taken books were "+ accounting.keySet());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("The books I had taken were  "+ accounting.values());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("On 2019-07-14 I took "+ accounting.get("2019-07-14"));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("On 2019-07-18 I took "+ accounting.get("2019-06-06"));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Which books I have taken on 2019-09-09?"+accounting.getOrDefault("2001-09-09", firstCheckOut));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Which books I have taken on 2019-07-18?"+accounting.getOrDefault("2019-07-18", Collections.emptyList()));
    }
    private List<Book> borrowedBookes(){
        List<Book>borrowedBookes = new ArrayList<>();
        Book book1 = new Book("The Invisible Man", "H.G.Wells");
        Book book2 = new Book("Intermezzo", "M.M.Kotsubinskyi");
        Book book3 = new Book("Sapiens: A Brief History of Humankind", "Yuval Noah Harari");
        borrowedBookes.add(book1);
        borrowedBookes.add(book2);
        borrowedBookes.add(book3);
        return borrowedBookes;
    }
}
