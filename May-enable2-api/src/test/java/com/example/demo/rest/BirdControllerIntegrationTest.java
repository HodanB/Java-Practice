package com.example.demo.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;



import com.example.demo.entity.Bird;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc // sets up the testing class
@Sql(scripts = {"classpath:bird-schema.sql",
		"classpath:bird-data.sql"}, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
public class BirdControllerIntegrationTest {

	@Autowired
	private MockMvc mvc;

	@Autowired
	private ObjectMapper mapper;


	@Test
	void testCreate() throws Exception {
		Bird testBird = new Bird(2, "Bart", "Pigeon", 114);
		String testBirdAsJSON = this.mapper.writeValueAsString(testBird);
		RequestBuilder req = post("/createBird").content(testBirdAsJSON).contentType(MediaType.APPLICATION_JSON);

		ResultMatcher checkStatus = MockMvcResultMatchers.status().is(201);
		Bird createdDino = new Bird(2, "Bart", "Pigeon", 114);
		String createdDinoAsJSON = this.mapper.writeValueAsString(createdDino);
		ResultMatcher checkBody = MockMvcResultMatchers.content().json(createdDinoAsJSON);

		this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
	}
	
	@Test
	void testRead() throws Exception {
		List<Bird> birds = List.of(new Bird(1, "Lisa", "Seagull", 94));
		this.mvc.perform(get("/getBirds")).andExpect(status().isOk())
				.andExpect(content().json(this.mapper.writeValueAsString(birds)));
	}

	@Test
	void testUpdate() throws Exception {
		Bird updated = new Bird(1, "Homer", "Dodo_bird", 154);
		this.mvc.perform(patch("/updateBird/1?name=Homer&species=Dodo-bird&age=154")).andExpect(status().isOk())
				.andExpect(content().json(this.mapper.writeValueAsString(updated)));
	}

	@Test
	void testDelete() throws Exception {
		this.mvc.perform(delete("/removeBird/1")).andExpect(status().isNoContent());
	}
}


	