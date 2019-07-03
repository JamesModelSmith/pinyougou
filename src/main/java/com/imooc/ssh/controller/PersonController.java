package com.imooc.ssh.controller;

import com.imooc.ssh.entity.Person;
import com.imooc.ssh.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
//用于告诉服务器，这个类是Spring MVC 中的控制层，这个类可以接收和处理用户请求
@Controller
//用来请求地址映射
@RequestMapping(value="/person")
public class PersonController {
    @Autowired
    private PersonService personService;
    @RequestMapping("/getPersonById")
    @ResponseBody
    public Person getPersonById(String id){
        return personService.getPersonById(id);
    }
    public List<Person> getPersons(){

        return personService.getPersons();
    }
    @RequestMapping("/addPerson")
    public void addPerson(Person person){
        personService.addPerson(person);

    }
    @RequestMapping("/updatePerson")
    public void updatePerson(Person person){
        personService.updatePerson(person);
    }
    public void deletePerson(String id){
        personService.deletePersonById(id);
    }
}
