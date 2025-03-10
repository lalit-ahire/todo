package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.todo;
import com.demo.service.service;
@RestController
public class controller {
   @Autowired
	private service s;
	@PostMapping("/insert")
	public todo inserttodo(@RequestBody todo t)
	{
		return s.save(t);
	}
	
	@GetMapping("/todos")
	public List<todo> alltodo()
	{
		return s.findAll()
;	}
	
	@DeleteMapping("delete")
	public todo deletetodo(@PathVariable int id)
	{
		return s.deleteById(id);
	}
}
