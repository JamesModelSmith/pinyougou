package com.imooc.ssh.service;

import com.imooc.ssh.dao.PersonDAO;
import com.imooc.ssh.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service//用于标注业务层组件
public class PersonService {
    //进行自动装配，而无需get set方法
    @Autowired
    private PersonDAO personDAO;
    public List<Person> getPersons(){

        return personDAO.getPersons();
    }
    public void addPerson(Person person){
        personDAO.addPerson(person);
    }
    public void updatePerson(Person person){
        personDAO.updatePerson(person);
    }
    public void deletePersonById(String id){
        personDAO.deletePerson(id);
    }
    public Person getPersonById(String id){
        return  personDAO.getPersonById(id);
    }
}
