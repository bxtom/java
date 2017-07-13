/*
* 10. (Poziom 2) Utwórz klasę User z polem String email. Dodaj do niej metodę setEmail,
* która w trakcie działania wyrzuca wyjątek BadEmailException, kiedy w podanym napisie nie znajdzie się znak '@'.
* */

public class Main {

    public static void main(String[] args) {
        User user = new User("Tomek");
        try {
            user.setEmail("tomek#gmail.com");
        } catch (BadEmailException e) {
            System.out.println(e.getMessage());
        } 
    }
}
