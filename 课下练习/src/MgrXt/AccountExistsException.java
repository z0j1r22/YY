package MgrXt;

public class AccountExistsException extends RuntimeException {
    public  AccountExistsException(String message){
        super(message);
    }
}
