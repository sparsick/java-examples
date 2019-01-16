package com.github.sparsick.java.examples.java8.a09.optional;

import java.util.Objects;

class Driver {
    private String firstName;
    private String lastName;

    public Driver(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Driver driver = (Driver) o;
        return Objects.equals(firstName, driver.firstName) &&
                Objects.equals(lastName, driver.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
