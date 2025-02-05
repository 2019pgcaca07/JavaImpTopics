package com.SerializableExample;

import java.io.Serializable;

public class Person implements Serializable {
    String name;  // Instance field (serialized)
    int age;      // Instance field (serialized)
    transient int ssn; // transient field (not serialized)

    public Person(String name, int age, int ssn) {
        this.name = name;
        this.age = age;
        this.ssn = ssn;
    }

    public void greet() {
        System.out.println("Hello, " + name);
    }
}
