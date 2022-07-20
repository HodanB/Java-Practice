package com.example.demo.animal;


import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bird;
import com.example.demo.service.BirdService;

@CrossOrigin
@RestController
public class BirdController {

	

	@Autowired
	private BirdService service; // dependency


	@GetMapping("/demoBird")
	public Bird getDemoBird() {
		return new Bird(1, "Lisa", "Seagul", 94);
	}

	@GetMapping("/getBird/{id}")
	public Bird getById(@PathVariable int id) {
		return this.service.getById(id);
	}
	@GetMapping("/getBirdByName/{name}")
	public Bird getByName(@PathVariable String name) {
		return this.service.findByName(name);
	}

	@GetMapping("/getBirds")
	public List<Bird> getAll() {
		return this.service.getAll();
	}

	@PostMapping("/createBird")
	public ResponseEntity<Bird> create(@RequestBody Bird bird) {
		System.out.println("Created: " + bird);
		Bird created = this.service.create(bird);

		return new ResponseEntity<Bird>(created, HttpStatus.CREATED);
	}

	@PatchMapping("/updateBird/{id}")
	public Bird update(@PathVariable("id") int id, @PathParam("name") String name,
			@PathParam("species") String species, @PathParam("age") Integer age) {
		return this.service.update(id, name, species, age);
	}

	// id = 1234
	@DeleteMapping("/removeBird/{id}")
	public ResponseEntity<?> delete(@PathVariable int id) {
		this.service.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}