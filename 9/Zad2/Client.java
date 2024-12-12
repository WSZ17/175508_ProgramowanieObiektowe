package Zad2;


import Zad1.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
public class Client implements Comparable<Client>{
    String name;
    int clientNumber;
    Date lastLogin;

    public Client(String name, int clientNumber, Date lastLogin) {
        this.name = name;
        this.clientNumber = clientNumber;
        this.lastLogin = lastLogin;
    }

    @Override
    public String toString() {
        return  name + ", " + clientNumber + ", " + lastLogin;
    }

    @Override
    public int compareTo(Client o) {
        return o.lastLogin.compareTo(this.lastLogin);
    }

    public static void main(String[] args) {
        ArrayList<Client> klienci = new ArrayList<>();
        klienci.add(new Client("Anna",1936748205, new Date(2000-2024,3,13)));
        klienci.add(new Client("Maciej",1738406285, new Date(2000-2024,8,11)));
        klienci.add(new Client("Bartosz", 1294051783, new Date(2000-2024,7,9)));
        klienci.add(new Client("Tymoteusz", 1203648166, new Date(2000-2024,5,8)));
        klienci.add(new Client("Karolina", 1039285739, new Date(2000-2024,1,3)));

        System.out.println(klienci);
        Collections.sort(klienci);
        System.out.println(klienci);

    }
}
