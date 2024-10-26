package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.tododao;
import com.demo.model.todo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class serviceImpl implements service{
	@Autowired
	public tododao td;

	@Override
	public todo save(todo t) {
		// TODO Auto-generated method stub
		return td.save(t);
	}

	@Override
	public List<todo> findAll() {
		// TODO Auto-generated method stub
		return td.findAll();
	}

	@Override
	public todo deleteById(int id) {
		// TODO Auto-generated method stub
		return td.deleteById(id);
	}
	
	
	
	

}
