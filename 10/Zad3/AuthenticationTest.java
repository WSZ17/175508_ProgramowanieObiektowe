package Zad3;

public class AuthenticationTest{
    public static void main(String[] args) {
        UserAuthentication ua = new UserAuthentication();
        AdminAuthentication aa = new AdminAuthentication();

        ua.logout();
        aa.logout();

        System.out.println(ua.login("Zbyszek455", "wfjAIgwhai"));
        System.out.println(aa.login("AnetkaKa",null));

        System.out.println(ua.resetPassword("Zbyszek455","ehushdguoe", null));
        System.out.println(aa.resetPassword("AnetkaKa", "eafhuieahgqeg", "fuhuoeghouqeg"));

    }
}
