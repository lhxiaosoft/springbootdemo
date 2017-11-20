package com.xlh.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xlh.springboot.dao.PersonDao;
import com.xlh.springboot.domain.Person;

@Service
public class PersonService {

	@Autowired
	private PersonDao personDao;

	public PersonService() {
		System.out.println(" 我是 PersonService，我被实例化了 ");
	}

	public Person getPerson() {
		return personDao.getPerson();
	}

}
