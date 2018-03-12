package com.springboot.ordermgmt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.ordermgmt.model.Bonus;
import com.springboot.ordermgmt.service.OrderService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrdermgmtApplicationTests {

	OrderService service = new OrderService();
	@Test
	public void contextLoads() {
		
	}

}
