package com.demo.service;

import java.util.List;

import com.demo.model.todo;

public interface service {
	public todo save(todo t);
	public List<todo> findAll();
	public todo deleteById(int id);
}
