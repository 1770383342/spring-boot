package com.example.demo;

import com.example.demo.domain.Person;
import com.example.demo.domain.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private Person person;

    @Value("${person.name}")
    private String name;

    @Autowired
    private User user;

    @Test
    void contextLoads() {
        System.out.println(person);
        System.out.println(name);
        System.out.println(user.getEmail());
    }

}
