package org.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
	
	@GetMapping(value="/b/s")
	public User abc() {
		System.out.println("cd service_spring");
		User user = new User();
		user.setName("TTTTTTTTTTT");
		return user;
	}

}