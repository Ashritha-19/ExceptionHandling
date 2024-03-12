package src;

public class InValidInputException extends Exception{
    private String code;

    public InValidInputException(String code,String message){
        super(message);
        this.code=code;
    }

    public String getCode() {
        return code;
    }
}
