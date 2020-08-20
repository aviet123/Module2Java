package excercise;

public class UserController {
    private UserStorage userStorage;
    private Users user = new Users(1,"nam");

    public UserController(UserStorage userStorage) {
        this.userStorage = userStorage;
    }
    public void store(){
        userStorage.store(user);
    }

    public static void main(String[] args) {
        UserController userController = new UserController(new XMLStorage());
        userController.store();
    }
}
