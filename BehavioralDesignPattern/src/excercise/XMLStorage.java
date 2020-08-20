package excercise;

public class XMLStorage implements UserStorage {
    @Override
    public void store(Object user) {
        System.out.println("XML store: " + user.toString());
    }
}
