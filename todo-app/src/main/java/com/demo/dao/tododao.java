package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.todo;

@Repository
public interface tododao extends JpaRepository<todo,Integer>{

	public todo save(todo t);
	public List<todo> findAll();
	public todo deleteById(int id);
}
