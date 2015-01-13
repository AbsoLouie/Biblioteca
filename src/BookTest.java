import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void shouldProperlyParseTitleAndAuthor() {
        Book book = new Book("A Scanner Darkly", "PKD");
        assertEquals("A Scanner Darkly PKD", book.getTitleAndAuthor());
    }

}