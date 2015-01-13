import java.io.PrintStream;

public class Biblioteca {
    private PrintStream printStream;

    public Biblioteca(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void printWelcomeMessage() {
        printStream.println("Welcome to Biblioteca!");
    }
}
