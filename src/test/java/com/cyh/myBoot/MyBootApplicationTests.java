package com.cyh.myBoot;

import com.cyh.myBoot.test.YamlTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyBootApplicationTests {

	@Autowired
	private YamlTest yamlTest;

	@Test
	void contextLoads() {
		System.out.println(yamlTest);
	}

}
