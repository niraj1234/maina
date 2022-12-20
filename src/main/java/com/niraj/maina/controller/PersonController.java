package com.niraj.maina.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@GetMapping("/niraj")
	public Person getPerson(){		
        Person person = new Person("Niraj", "niraj@gmail.com", "8873675654");		
		return person;
	}
	

	@GetMapping("/all")
	public List<Person> getAllPerson(){		
        Person person1 = new Person("Niraj", "niraj@gmail.com", "8873675654");		
        Person person2 = new Person("Raju", "raju@yoyo.com", "7777777777");		
        Person person3 = new Person("Sefali", "sefali@bollywood.com", "5555555555");		

        List<Person> personList = new ArrayList<Person>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        
        return personList;
	}
	

	@GetMapping("/all/{number}")
	public List<Person> getPersonByNumber(@PathVariable("number") int number){		
        Person person = null;
        List<Person> personList = new ArrayList<Person>();
       
        try {
            if(number > 200) {
            	System.out.println("Requested data exceeds limit of 200 | Current count is ==> " + number);
            	throw new RuntimeException("Too many data requested");            	
            }        	
            for(int i =1 ; i<number ;i++) {
            	person = new Person("Niraj "+i, "niraj"+i+"@gmail.com", "88736"+i+""+i);
            	personList.add(person);
            }
        }catch(Exception ex) {
        	person = new Person("No Data", "No Data", "No Data");
        	personList.add(person);
        	System.out.println("Too many data requested");
        }        
        return personList;
	}
	

	
	
}

