package ua.kiev.prog;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;



public class Main implements Serializable {

    public static void main(String[] args) {

//        String path = "d:\\jsonser.txt";
        String path = "e:\\jsonser.txt";

        try {
            String jsonObject = new String(Files.readAllBytes(Paths.get(path)));
            System.out.println(jsonObject);
            Gson gson = new GsonBuilder().create();
            Person person = gson.fromJson(jsonObject, Person.class);
            System.out.println(person);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}



