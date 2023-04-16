package com.mk.karnal.MKbrandAutoMobiles.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mk.karnal.MKbrandAutoMobiles.Entity.Emplyoee;
import com.mk.karnal.MKbrandAutoMobiles.Repositry.EmplyoeeRepositry;
import com.mk.karnal.MKbrandAutoMobiles.Service.EmplyoeeService;

@Service
public class EmplyoeeServiceEmpl implements EmplyoeeService{
	private EmplyoeeRepositry emplyoeeRepositry;
	
	

	public EmplyoeeServiceEmpl(EmplyoeeRepositry emplyoeeRepositry) {
		super();
		this.emplyoeeRepositry = emplyoeeRepositry;
	}



	@Override
	public List<Emplyoee> getAllEmplyoess() {
		
		return emplyoeeRepositry.findAll();
	}



	@Override
	public Emplyoee saveEmplyoee(Emplyoee emplyoee) {
		
		return emplyoeeRepositry.save(emplyoee);
	}



	@Override
	public Emplyoee getEmplyoeeByid(Long id) {
		
		return emplyoeeRepositry.findById(id).get();
	}



	@Override
	public Emplyoee UpdateEmplyoee(Emplyoee emplyoee) {
		// TODO Auto-generated method stub
		return emplyoeeRepositry.save(emplyoee);
	}



	
	

	 
}
