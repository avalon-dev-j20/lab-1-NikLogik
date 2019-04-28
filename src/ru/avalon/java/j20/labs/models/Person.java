package ru.avalon.java.j20.labs.models;

import java.util.Comparator;
import java.util.Objects;

/**
 * Представление о человеке.
 */
public class Person implements Comparable<Person>{
    /**
     * Имя.
     */
    private final String name;
    /**
     * Фамилия.
     */
    private final String surname;

    /**
     * Создаёт экземпляр класса на основании имени и даты
     * рождения.
     *
     * @param name имя человека
     * @param surname дата рождения человека
     */
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    /**
     * возвращает имя человека.
     *
     * @return имя человека
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает фамилию человека.
     *
     * @return фамилия человека
     */
    public String getSurname() {
        return surname;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public boolean equals(Object obj) {
        
            if(this == null || getClass() != obj.getClass()) 
                return false;
            if(this == obj) 
                return true;
            Person person = (Person) obj;
                return this.name.equals(person.name) && this.surname.equals(person.surname);
   
    }

    @Override
    public int compareTo(Person o) {
        int result = this.name.compareTo(o.getName());
        if (result!=0) return result;
        result = this.surname.compareTo(o.getSurname());
        return result;
    }
}
