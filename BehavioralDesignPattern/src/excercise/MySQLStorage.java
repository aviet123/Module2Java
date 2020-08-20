package excercise;

public class MySQLStorage implements UserStorage {
    @Override
    public void store(Object user) {
        System.out.println("SQL store: " + user.toString());
    }
}
