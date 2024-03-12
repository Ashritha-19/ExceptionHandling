package src;

public class InsufficientbalanceException extends Exception{
    private String code;

    public InsufficientbalanceException(String code,String message){
        super(message);
        this.code=code;
    }

    public String getCode() {
        return code;
    }
}
