package pr19.T1;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(String error) {
        super(error);
    }
}
