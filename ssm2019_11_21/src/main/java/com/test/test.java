package com.test;

import com.domain.People;
import com.service.PeopleService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        PeopleService peopleService = (PeopleService) classPathXmlApplicationContext.getBean("peopleServiceImpl");
        People people = peopleService.selectByPrimaryKey(1);
        System.out.println(people.getName());
    }
}
