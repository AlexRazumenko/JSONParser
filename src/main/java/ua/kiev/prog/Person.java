package ua.kiev.prog;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String surname;
    private String[] phones;
    private String[] sites;
    private Address address;

    public Person() {};

    @Override
    public String toString() {
        return "Person " + name + " " + surname + ", \n phones: " + this.arrayToString(phones) + "\n sites: " + this.arrayToString(sites) + "\n" +  address + "\n";
    }

    public String arrayToString (String[] strings) {
        String result = "";
        for (String str: strings) {
            result += str + " , ";
           // System.out.println(str);
        }
        return result;
    }
}
