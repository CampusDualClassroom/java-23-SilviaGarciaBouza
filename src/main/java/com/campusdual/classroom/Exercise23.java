package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Exercise23 {

    public static Map<String, Person> createHashMap() {
        Map<String, Person> myMap= new HashMap<>();
        myMap.put("person", new Person("John","Smith"));
        myMap.put("teacher", new Teacher("María","Montessori", "Educación"));
        myMap.put("police", new PoliceOfficer("Jake","Peralta","B-99"));
        myMap.put("doctor", new Doctor("Gregory","House", "Nefrología e infectología"));

        return myMap;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        map.put(key,value);
        return map.get(key);
    }

    public static void printMapValues(Map<String, Person> map) {
        for(Map.Entry<String, Person> element:map.entrySet()){
            Person person = element.getValue();
            System.out.println("Nombre completo: " + person.getName() + " " + person.getSurname());
        }
    }
    
}
