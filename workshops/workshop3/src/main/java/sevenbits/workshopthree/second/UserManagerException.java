package sevenbits.workshopthree.second;

public class UserManagerException extends Exception {
    public UserManagerException(String s) {
        super(s);
    }

    public UserManagerException(String message, Throwable cause) {
        super(message, cause);
    }
}