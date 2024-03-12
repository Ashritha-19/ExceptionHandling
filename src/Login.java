package src;

public class Login {
    private String validUserName;
    private String validPassword;

    public Login(String validUserName, String validPassword) {
        this.validUserName = validUserName;
        this.validPassword = validPassword;
    }

    public boolean login(String userName,String password) throws InvalidCredentialsException{
        if(userName.equals(validUserName) && password.equals(validPassword)){
            System.out.println("Login Successfull");

        }else {
            throw new InvalidCredentialsException(ErrorCodes.Login_Failed.getCode(),
                    ErrorCodes.Login_Failed.getMessage());
        }return false;
    }
}
