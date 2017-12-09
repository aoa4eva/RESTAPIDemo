package me.afua.restdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    PersonRepository repo;

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Running the application");

        System.out.println("Inserting data...");

        Person p = new Person();
        p.setFirstName("Frodo");
        p.setLastName("Baggins");
        repo.save(p);
        System.out.println("Frodo Baggins created");

        p = new Person();
        p.setFirstName("Oliver");
        p.setLastName("Twist");
        repo.save(p);
        System.out.println("Oliver Twist created");

        p = new Person();
        p.setFirstName("Snow");
        p.setLastName("White");
        repo.save(p);
        System.out.println("Snow White created");



    }
}
