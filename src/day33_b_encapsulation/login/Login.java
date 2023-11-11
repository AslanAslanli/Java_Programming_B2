package day33_b_encapsulation.login;

public class Login {

    public String username;
    public String password;
    private String privateUsername;
    private String privatePassword;

    public void setPrivateUsername(String privateUsername){
        this.privateUsername = privateUsername;
    }

    public void setPrivatePassword(String privatePassword){
        this.privatePassword = privatePassword;
    }

    public String getPrivateUsername() {
        return privateUsername;
    }

    public String getPrivatePassword() {
        return privatePassword;
    }



}
