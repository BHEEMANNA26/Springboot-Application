package com.mk.karnal.MKbrandAutoMobiles.Service;

import java.util.List;

import com.mk.karnal.MKbrandAutoMobiles.Entity.Emplyoee;

public interface EmplyoeeService {
	List<Emplyoee> getAllEmplyoess();
	
	Emplyoee saveEmplyoee(Emplyoee emplyoee);
	
	Emplyoee getEmplyoeeByid(Long id);
	
	Emplyoee UpdateEmplyoee(Emplyoee emplyoee);
}
