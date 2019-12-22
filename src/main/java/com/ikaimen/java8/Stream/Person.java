package com.ikaimen.java8.Stream;

import lombok.Data;

/**
 * @Auther: ASUS
 * @Date: 2018/12/23 19:57
 * @Description:
 */
@Data
public class Person {

    private String firstName, lastName, job, gender;
    private int salary, age;

    public Person(String firstName, String lastName, String job,
                  String gender, int age, int salary)       {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.job = job;
        this.salary = salary;
    }
}
