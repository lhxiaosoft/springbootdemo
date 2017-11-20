package com.xlh.springboot.dao;

import com.xlh.springboot.domain.Person;

public class PersonDao {

	public PersonDao() {
		super();
		System.out.println(" 我是 PersonDao，我被实例化了 ");
	}

	public Person getPerson() {
		return new Person("张三", " 合肥 ");
	}

}
