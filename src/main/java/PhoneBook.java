import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, String> map = new HashMap<>();

    public boolean add(String name, String number) {
        if (!map.containsKey(name)) {
            map.put(name, number);
            System.out.println("Количество контактов в телефонной книке " + map.size());
            return true;
        }
        System.out.println("Такое имя уже есть в телефонной книге, размер книги остался прежним: " + map.size());
        return false;
    }

    public String findByName(String name) {
        return map.get(name);
    }

    public String findByNumber(String number) {
        for (String key : map.keySet()) {
            if (map.get(key).equals(number)) {
                return key;
            }
        }
        return null;
    }

    public Set<String> printAllNames() {
        return null;
    }

}
