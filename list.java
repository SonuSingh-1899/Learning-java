import java.util.*;
import java.util.stream.*;

public class list {
    public static void main(String[] args) {

        List<User> users = Arrays.asList(
            new User("Sonu", true),
            new User("Rahul", false),
            new User("Amit", true),
            new User("Neha", false)
        );

        List<User> activeUsers = users.stream()
                .filter(User::isActive) 
                .collect(Collectors.toList());

        activeUsers.forEach(System.out::println);
    }

}
class User {
private String name;
private boolean isActive;

public User(String name, boolean isActive) {
    this.name = name;
    this.isActive = isActive;
}

public String getName() {
    return name;
}

public boolean isActive() {
    return isActive;
}

@Override
public String toString() {
    return name + " (Active: " + isActive + ")";
}
}