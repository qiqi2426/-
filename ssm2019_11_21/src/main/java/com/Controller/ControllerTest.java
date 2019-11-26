package com.Controller;

import com.domain.People;
import com.service.PeopleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class ControllerTest {

    @Resource(name = "peopleServiceImpl")
    PeopleService peopleService;

    @RequestMapping("/testone")
    public String testone() {
        People people = new People();
        people.setName("王六三");
        people.setCityid(14);
        peopleService.insertSelective(people);
        System.out.println("加入成功");
        return "";
    }
}
