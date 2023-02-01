import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;

public class PhoneBookTest {
    @Test
    public void addTestTrue() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Petya", "+79000010110");
        final boolean expected = true;
        boolean result = phoneBook.add("Vasya", "+79000010110");
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void addTestFalse() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Vasya", "+79000010110");
        final boolean expected = false;
        boolean result = phoneBook.add("Vasya", "+79000010110");
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void findByNameTest() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Vasya", "+79000010110");
        final String expected = "+79000010110";
        String result = phoneBook.findByName("Vasya");
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void findByNumberTest() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Vasya", "+79000010110");
        final String expected = "Vasya";
        String result = phoneBook.findByNumber("+79000010110");
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void printAllNamesTest() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Borya", "2");
        phoneBook.add("Petya", "3");
        phoneBook.add("Denis", "4");
        phoneBook.add("Anya", "1");

        Set<String> result = phoneBook.printAllNames();
        String[] expected = {"Anya", "Borya", "Denis", "Petya"};
        assertThat(result.toArray(), Matchers.equalTo(expected));
    }


}
