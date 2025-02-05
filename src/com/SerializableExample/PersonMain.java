package com.SerializableExample;

import java.io.*;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30, 123456789);

        // Serialize the object
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            out.writeObject(person);
            System.out.println("Object serialized!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person deserializedPerson = (Person) in.readObject();
            System.out.println("Object deserialized: " + deserializedPerson.name + ", " + deserializedPerson.age);
            deserializedPerson.greet(); // Method is still available after deserialization
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
