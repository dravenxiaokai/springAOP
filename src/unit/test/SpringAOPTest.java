package unit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ren.draven.service.PersonService;

class SpringAOPTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	void interceptorTest() {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		PersonService personService = (PersonService) context.getBean("personService"); 
		personService.save("xxx");
		context.close();
	}

}
