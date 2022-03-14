package model;

import java.io.Serializable;

public class Person implements Serializable {
    
    private String firstName;
    private String lastName;
    private String address;
    private String gender;
    private byte age;

    /**
     * public Constructor, no args
     */
    public Person() {}

    /**
     * public Constructor that initializes the private fields {@code firstName}, {@code lastName}, and {@code address}
     * @param firstName the first name of a person
     * @param lastName the last name of a person
     * @param age the age of a person
     * @param address the address of a person
     */
    public Person(String firstName, String lastName, byte age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    /**
     * Method that sets the first name of a person.
     * @param firstName the first name of the person.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Method that sets the last name of a person.
     * @param lastName the last name of a person.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Method that sets the address of a person.
     * @param address the address of a person.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Method that sets the gender of a person.
     * @param gender the gender of a person.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Method that sets the age of a person.
     * @param age the age of a person.
     */
    public void setAge(byte age) {
        this.age = age;
    }

    /**
     * Method that returns the first name of a person.
     * @return {@code firstName}
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Method that returns the last name of a person.
     * @return {@code lastName}
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Method that returns the address of a person.
     * @return {@code address}
     */
    public String getAddress() {
        return address;
    }

    /**
     * Method that returns the gender of a person.
     * @return {@code gender}
     */
    public String getGender() {
        return gender;
    }

    /**
     * Method that returns the age of a person.
     * @return {@code age}
     */
    public byte getAge() {
        return age;
    }
}
