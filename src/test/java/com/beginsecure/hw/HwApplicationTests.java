package com.beginsecure.hw;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class HwApplicationTests {

	@Autowired
	private MockMvc mvc;

	@Test
	public void testHwServiceStatus() throws Exception {
		this.mvc.perform(MockMvcRequestBuilders.get("/api/hw"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string("Hello World"));
	}
}
