// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        ArrayList<User> userList = new ArrayList<>();

        User user1 = new User();
        user1.Name = "John";
        user1.Age = 55;

        userList.add(user1);

        HashMap<String, User> userHashMap = new HashMap<>();
        userHashMap.put("user_1", user1);

        System.out.println(userHashMap.get("user_1"));

        userHashMap.forEach((key, value) -> System.out.printf("[key]: %s => value: [name: %s, age: %d]\n", key, value.Name, value.Age));

        for (User user:
             userList) {
            System.out.println(user.Name);
        }
    }
}

