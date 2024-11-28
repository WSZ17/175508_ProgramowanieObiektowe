package Zad5;

public record BankAccount(String numerKonta, int saldo) {

    public BankAccount(String nr){
        this(nr,0);
    }
}
