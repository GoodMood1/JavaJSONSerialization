package pack;

import com.google.gson.Gson;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Person user = new Person("A", "B", LocalDate.now(), Person.Gender.MALE, true);
        String json = gson.toJson(user);
        System.out.println(json);
        Person jsonUser = gson.fromJson(json, Person.class);
    }
}
