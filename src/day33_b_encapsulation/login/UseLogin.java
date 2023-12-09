package day33_b_encapsulation.login;

public class UseLogin {
    public static void main(String[] args) {

        Login obj = new Login();
        System.out.println(obj.username); // public vars
        System.out.println(obj.password); // public vars

        obj.setPrivateUsername("Taras");
        obj.setPrivatePassword("Qwerty123@");

        System.out.println(obj.getPrivateUsername());
        System.out.println(obj.getPrivatePassword());


    }



}
