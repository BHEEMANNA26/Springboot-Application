package com.mk.karnal.MKbrandAutoMobiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mk.karnal.MKbrandAutoMobiles.Entity.Emplyoee;
import com.mk.karnal.MKbrandAutoMobiles.Repositry.EmplyoeeRepositry;

@SpringBootApplication
public class MKbrandAutoMobilesApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MKbrandAutoMobilesApplication.class, args);
	}

	@Autowired
	private EmplyoeeRepositry emplyoeeRepositry;
	@Override
	public void run(String... args) throws Exception {
//	  Emplyoee emplyoee1=new Emplyoee("Pramoda", "Karnal", "pramoda@123gmail.com");
//	  emplyoeeRepositry.save(emplyoee1);
//	  
//	  Emplyoee emplyoee2=new Emplyoee("Vinayaka","Kn","vinayakkn@1gmail.com");
//	  emplyoeeRepositry.save(emplyoee2);
//	  
//	  Emplyoee emplyoee3=new Emplyoee("kirana", "ks", "kirana@123gmail.com");
//	  emplyoeeRepositry.save(emplyoee3);
//	  
//	  Emplyoee emplyoee4=new Emplyoee("Avinash", "NV", "Avinash@123gmail.com");
//	  emplyoeeRepositry.save(emplyoee4);
		
	}

}
