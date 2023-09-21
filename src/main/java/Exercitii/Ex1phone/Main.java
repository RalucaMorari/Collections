package Exercitii.Ex1phone;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        List<String> allContacts = new ArrayList<>();
        allContacts.add("123");
        allContacts.add("234");
        allContacts.add("345");
        allContacts.add("456");

        List<String> blackList = new ArrayList<>();
        blackList.add("123");
        blackList.add("345");

        System.out.println(PhoneBook.filterContacts(allContacts, blackList));
    }
}


