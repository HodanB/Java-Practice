package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Bird;

public interface BirdService {
	
	Bird getById(int id);

	List<Bird> getAll();
	
	Bird findByName(String name);

	Bird create(Bird bird);

	Bird update(int id, String name, String species, Integer age);

	void delete(int id);


}
