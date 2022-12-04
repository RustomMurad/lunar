package qa.pragmatic.novalunium;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NovaluniumApplicationTests {

	@Autowired
	private User user;

	@Test
	void contextLoads() {
		user.printDetailes();
	}

	/*
		Address address=new Address();
		Salary salary=new Salary();

		User user=new User(address,salary);
		user.printDetais();
	 */

}
