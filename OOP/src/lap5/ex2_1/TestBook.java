package lap5.ex2_1;

import java.sql.SQLOutput;

public class TestBook {
    public static void main(String[] args) {
        Author anTeck = new Author("Tan An Teck", "ahteck@nowhere", 'm');
        Book book = new Book("Java programming", anTeck, 19.95, 99);
        System.out.println(book);

        book.setPrice(29.95);
        book.setQty(28);
        System.out.println("name is: " + book.getName());
        System.out.println("price is: " + book.getPrice());
        System.out.println("qty is: " + book.getQty());
        System.out.println("Author is: " + book.getAuthor());
        System.out.println("Author's name is: " + book.getAuthor().getName());
        System.out.println("Author's email is: " + book.getAuthor().getEmail());

        Book antherBook = new Book("more java", new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(antherBook);
    }
}
