package ren.draven.service.impl;

import ren.draven.service.PersonService;

public class PersonServiceBean implements PersonService {

	public void save(String name) {
		throw new RuntimeException("我爱例外");
//		System.out.println("我是save方法");
	}

	public void update(String name, Integer id) {
		System.out.println("我是update方法");
	}

	public String getPersonName(Integer id) {
		System.out.println("我是getPersonName方法");
		return "xxx";
	}

}
