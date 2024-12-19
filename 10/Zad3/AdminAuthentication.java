package Zad3;

public class AdminAuthentication implements Authentication{
    @Override
    public boolean login(String username, String password) {
        if(username != null && password != null){
            return true;
        }
        else
            return false;
    }

    @Override
    public void logout() {
        System.out.println("Wylogowano administratora");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if(username != null && oldPassword != null && newPassword != null){
            return true;
        }
        else
            return false;
    }
}
