package ua.kiev.prog;

import java.io.Serializable;

public class Address implements Serializable {
    public String country;
    public String city;
    public String street;

    public Address() {};

    @Override
    public String toString() {
        return "Address: \n Country: " + country + ", city: " + city + ", street: " + street + ". \n";
    }
}
