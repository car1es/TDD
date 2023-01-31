import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    @Test
    public void addTestTrue() {
        PhoneBook phoneBook = new PhoneBook();
        final boolean expected = true;
        boolean result = phoneBook.add("Vasya", "+79000010110");
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void addTestFalse() {
        PhoneBook phoneBook = new PhoneBook();
        final boolean expected = false;
        boolean result = phoneBook.add("Vasya", "+79000010110");
        Assertions.assertEquals(expected, result);
    }
}
