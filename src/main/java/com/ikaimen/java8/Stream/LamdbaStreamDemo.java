package com.ikaimen.java8.Stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Auther: ASUS
 * @Date: 2018/12/23 20:04
 * @Description:
 */
public class LamdbaStreamDemo {

    List<Person> javaProgrammers = new ArrayList<Person>() {
        {
            add(new Person("Elsdon", "Jaycob", "Java programmer", "male", 43, 2000));
            add(new Person("Tamsen", "Brittany", "Java programmer", "female", 23, 1500));
            add(new Person("Floyd", "Donny", "Java programmer", "male", 33, 1800));
            add(new Person("Sindy", "Jonie", "Java programmer", "female", 32, 1600));
            add(new Person("Vere", "Hervey", "Java programmer", "male", 22, 1200));
            add(new Person("Maude", "Jaimie", "Java programmer", "female", 27, 1900));
            add(new Person("Shawn", "Randall", "Java programmer", "male", 30, 2300));
            add(new Person("Jayden", "Corrina", "Java programmer", "female", 35, 1700));
            add(new Person("Palmer", "Dene", "Java programmer", "male", 33, 2000));
            add(new Person("Addison", "Pam", "Java programmer", "female", 34, 1300));
        }
    };

    List<Person> phpProgrammers = new ArrayList<Person>() {
        {
            add(new Person("Jarrod", "Pace", "PHP programmer", "male", 34, 1550));
            add(new Person("Clarette", "Cicely", "PHP programmer", "female", 23, 1200));
            add(new Person("Victor", "Channing", "PHP programmer", "male", 32, 1600));
            add(new Person("Tori", "Sheryl", "PHP programmer", "female", 21, 1000));
            add(new Person("Osborne", "Shad", "PHP programmer", "male", 32, 1100));
            add(new Person("Rosalind", "Layla", "PHP programmer", "female", 25, 1300));
            add(new Person("Fraser", "Hewie", "PHP programmer", "male", 36, 1100));
            add(new Person("Quinn", "Tamara", "PHP programmer", "female", 21, 1000));
            add(new Person("Alvin", "Lance", "PHP programmer", "male", 38, 1600));
            add(new Person("Evonne", "Shari", "PHP programmer", "female", 40, 1800));
        }
    };

    @Test
    public void  demo(){
        javaProgrammers.forEach((person)-> System.out.println(person.getFirstName()+":"+person.getLastName()+":"+person.getSalary()));

        System.out.println("给Java程序员增加5%的工资......");

        Consumer<Person> giveRaise = e -> e.setSalary(e.getSalary()/100*5+e.getSalary());
        javaProgrammers.forEach(giveRaise);
        javaProgrammers.forEach((person)-> System.out.println(person.getFirstName()+":"+person.getLastName()+";"+person.getSalary()));
        System.out.println("遍历工资低于1500工资的程序员......");
        javaProgrammers.stream()
                .filter((person)-> person.getSalary()<1500)
                .forEach((person)-> System.out.println(person.getFirstName()+":"+person.getLastName()+";"+person.getSalary()));
    }
}
