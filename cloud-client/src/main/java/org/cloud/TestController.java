package org.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(value="/a/test")
	public void abc() {
		System.out.println("cd tt_spring a");
		restTemplate.getForObject("http://cloud-server/b/s", User.class);
	}
	
	@GetMapping(value="s.s.s.ss")
	public void abc2() {
		System.out.println("cd tt_springssssss");
	}

}
