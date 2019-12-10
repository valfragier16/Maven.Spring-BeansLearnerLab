package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {
    List<PersonType> personList = new ArrayList<>();

    // Constructor
    public People(List<PersonType> personList){
        this.personList = personList;
    }

    public void add(PersonType person){
        personList.add(person);
    }

    public void remove(PersonType person){
        personList.remove(person);
    }

    public Integer size(){
        return personList.size();
    }

    public void clear(){
        personList.clear();
    }

    public void addAll(Iterable<PersonType> personList){
        this.personList.addAll((Collection<? extends PersonType>) personList);
    }

    public PersonType findById(Long id){
        for (PersonType person : personList) {
            if (person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public void findAll(){
        personList.stream()
                .map(personType -> personList)
                .forEach(System.out::println);
    }

    @Override
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }
}
