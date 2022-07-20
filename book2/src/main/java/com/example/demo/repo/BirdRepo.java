package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Bird;

@Repository
public interface BirdRepo extends JpaRepository<Bird, Integer>{

	Bird findByNameStartingWithIgnoreCase(String name);
}
