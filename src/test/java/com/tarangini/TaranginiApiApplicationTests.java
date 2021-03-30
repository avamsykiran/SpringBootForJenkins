package com.tarangini;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TaranginiApiApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void shouldFail(){
		fail("fails on purpose")
	}

}
