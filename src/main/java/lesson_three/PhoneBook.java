package lesson_three;

import java.util.*;

public class PhoneBook {

    private Map<String, ArrayList<String>> map;

    PhoneBook(){
        this.map = new HashMap<>();
    }

    void add (String lastName, String phoneNumber){
        ArrayList<String> phones;
        if(map.containsKey(lastName)){
            phones = map.get(lastName);
        } else {
            phones = new ArrayList<>();
        }
        phones.add(phoneNumber);
        map.put(lastName, phones);
    }

    ArrayList<String> get(String lastName){
        return map.get(lastName);
    }



}
