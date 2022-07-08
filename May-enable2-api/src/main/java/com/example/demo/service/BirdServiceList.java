package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Bird;


@Service
public class BirdServiceList implements BirdService {

	private List<Bird> birds = new ArrayList<>();

	@Override
	public Bird getById(int id) {
		return this.birds.get(id);

	}

	@Override
	public List<Bird> getAll() {
		return this.birds;
	}

	@Override
	public Bird create(Bird bird) {
		this.birds.add(bird);
		return this.birds.get(this.birds.size() - 1);

	}

	@Override
	public Bird update(int id, String name, String species, Integer age) {
		Bird toUpdate = this.birds.get(id);
		if (name != null)
			toUpdate.setName(name);
		if (age != null)
			toUpdate.setAge(age);
		if (species != null)
			toUpdate.setSpecies(species);
		return toUpdate;
	}

	@Override
	public void delete(int id) {
		this.birds.remove(id);
	}

	@Override
	public Bird findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}