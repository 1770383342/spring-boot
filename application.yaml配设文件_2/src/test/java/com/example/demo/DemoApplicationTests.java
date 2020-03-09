package com.example.demo;

import com.example.demo.config.DBConnector;
import com.example.demo.config.MyService;
import com.example.demo.domain.MyProperties;
import com.example.demo.domain.Person;
import com.example.demo.domain.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
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

    @Autowired
    private MyProperties myProperties;

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void contextLoads() {
//        System.out.println(person);
//        System.out.println(name);
//        System.out.println(user.getEmail());
//        System.out.println(myProperties);
//        MyService myService = (MyService) applicationContext.getBean("myService1");
//        System.out.println(myService);
    }

    @Autowired
    private DBConnector dbConnector;

    @Test
    public void dbtest(){
        dbConnector.configure();
    }

    @Value("${my.number.less.than.ten}")
    private String secret;

    @Test
    public void randomTest(){
        System.out.println(secret);
    }

    @Value("${tom.description}")
    private String description;

    @Test
    public void placeholderTest(){
        System.out.println(description);
    }

}
