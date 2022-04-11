package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Contact;
import com.example.demo.repository.ContactRepository;

@RestController
@RequestMapping("/contacts")
public class ContactController {

	@Autowired
	ContactRepository contactRepository;
	
	@GetMapping
	public List<Contact> get() {
		return contactRepository.findAll();
	}
	
		
	@PostMapping("/addBulk")
	public void addBulk(@RequestBody List<Contact> contacts){
		contactRepository.saveAll(contacts);
	}
	
	@PostMapping
	public void add(@RequestBody Contact contact){
		contactRepository.save(contact);
	}
	
	@GetMapping("/{code}/{number}")
	public Contact findByNumber(@PathVariable("number") String number,@PathVariable("code") String code){
		
		List<Contact>  contacts = contactRepository.findAll();
		
		for(Contact c: contacts) {
			if(c.getNumber().equals(number) && c.getCountry().equals(code)) {
				return c;
			}
		}
		
		return null;
		
	}
	
}
