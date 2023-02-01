import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
    public void findByNameTest(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Vasya", "+79000010110");
        final String expected = "+79000010110";
        String result = phoneBook.findByName("Vasya");
        Assertions.assertEquals(expected,result);
    }
    @Test
    public void findByNumber(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Vasya", "+79000010110");
        final String expected = "Vasya";
        String result = phoneBook.findByName("+79000010110");
        Assertions.assertEquals(expected,result);
    }

}
