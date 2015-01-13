import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String [] args) {
            List<Book> library = addBooks();
            Biblioteca biblioteca = new Biblioteca(System.out, library);
            biblioteca.printWelcomeMessage();
            biblioteca.printAllTitlesInLibrary();

        }

    private static ArrayList<Book> addBooks() {

        ArrayList<Book> library = new ArrayList<Book>();
        Book book1 = new Book("A Scanner Darkly", "PKD");
        Book book2 = new Book("Harry Potter", "JKR");
        library.add(book1);
        library.add(book2);
        return library;
    }
}