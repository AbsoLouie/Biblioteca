import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class BibliotecaTests {

    private PrintStream printStream;
    private Biblioteca biblioteca;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);

        List<Book> library = new ArrayList<Book>();
        Book book1 = new Book("A Scanner Darkly", "PKD");
        Book book2 = new Book("Harry Potter", "JKR");
        library.add(book1);
        library.add(book2);

        biblioteca = new Biblioteca(printStream, library);
    }

    @Test
    public void shouldPrintWelcomeMessageWhenBibliotecaStarts() {

        biblioteca.printWelcomeMessage();

        verify(printStream).println("Welcome to Biblioteca!");
    }

    @Test
    public void shouldPrintAllBookTitlesInLibrary() {
        biblioteca.printAllTitlesInLibrary();
        verify(printStream, times(2)).println(anyString());

    }

    @Test
    public void shouldPrintDetailsOfAllBooksInLibrary() {
        biblioteca.printDetailsOfBooksInLibrary();
        verify(printStream, times(2)).println(anyString());
    }




}
