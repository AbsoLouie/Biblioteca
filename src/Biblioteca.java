import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private PrintStream printStream;
    private List<Book> library = new ArrayList<Book>();

    public Biblioteca(PrintStream printStream, List<Book> library) {
        this.printStream = printStream;
        this.library = library;
    }

    public void printWelcomeMessage() {
        printStream.println("Welcome to Biblioteca!");
    }

    public void printAllTitlesInLibrary() {
        for(Book book:library) {
            printStream.println(book.getTitle());
        }
    }

    public void printDetailsOfBooksInLibrary() {
        for(Book book:library) {
            printStream.println(book.getTitleAndAuthor());
        }
    }
}
