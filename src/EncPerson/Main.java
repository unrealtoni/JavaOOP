package EncPerson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        ArrayList<Person> persons = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            String[] input = reader.readLine().split("\\s+");
            Person person = new Person(input[0],input[1],Integer.parseInt(input[2]));
            /*person.setFirstName(input[0]);
            person.setLastName(input[1]);
            person.setAge(Integer.parseInt(input[2]));*/
            persons.add(person);
        }
        /*Collections.sort(persons,(firstPerson, secondPerson)->{
            int sComp = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());
            if (sComp!=0){
                return sComp;
            }else {
                return Integer.compare(firstPerson.getAge(),secondPerson.getAge());
            }
        });*/
        persons.sort((fp1, fp2)-> {
            int sComp=fp1.getFirstName().compareTo(fp2.getFirstName());
            if (sComp!=0){
                return sComp;
            }else {
                return Integer.compare(fp1.getAge(),fp2.getAge());
            }
    });
        persons.forEach(p -> System.out.println(p.toString()));
        /*for (Person person : persons) {
            System.out.println(person.toString());
        }*/
    }
}
