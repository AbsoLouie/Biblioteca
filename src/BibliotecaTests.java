import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaTests {

    @Test
    public void shouldPrintWelcomeMessageWhenBibliotecaStarts() {
        PrintStream printStream = mock(PrintStream.class);

        Biblioteca biblioteca = new Biblioteca(printStream);
        biblioteca.printWelcomeMessage();

        verify(printStream).println("Welcome to Biblioteca!");
    }
}
