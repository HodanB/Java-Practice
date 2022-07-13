package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Bird;
import com.example.demo.repo.BirdRepo;

@Service
@Primary
public class BirdServiceDB implements BirdService {
	
	@Autowired
	private BirdRepo repo; 

	@Override
	public Bird getById(int id) {
		
		return this.repo.findById(id).get();
	}

	@Override
	public List<Bird> getAll() {

		return this.repo.findAll();
	}

	@Override
	public Bird create(Bird bird) {
	
		return this.repo.save(bird);
	}

	@Override
	public Bird update(int id, String name, String species, Integer age) {
		
		Bird toUpdate = this.getById(id);
		if (name != null)
			toUpdate.setName(name);
		if (age != null)
			toUpdate.setAge(age);
		if (species != null)
			toUpdate.setSpecies(species);
		return this.repo.save(toUpdate);
	}

	@Override
	public void delete(int id) {
		this.repo.deleteById(id);

	}

	@Override
	public Bird findByName(String name) {
		
		return this.repo.findByNameStartingWithIgnoreCase(name);
	}

}