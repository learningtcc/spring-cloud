package com.yinhai;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class CloudConfigClientApplicationTests {

	@Test
	public void contextLoads() {
		RestTemplate restTemplate = new RestTemplate();
		String object = restTemplate.postForObject("http://localhost:7001/bus/refresh",null,String.class);
		System.out.println(object);
	}

}
