package Exercitii.Ex1phone;

import java.util.List;

public class PhoneBook {

    public static List<String> filterContacts(List<String> allContacts, List<String> blackList) {
        for (String blackListContact : blackList) {
            if (blackList.contains(blackListContact)) {
                allContacts.remove(blackListContact);
            }
        }
            return allContacts;
        }
    }

