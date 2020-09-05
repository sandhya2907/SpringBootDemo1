package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.DemoModel;

public interface IDemoRepository extends JpaRepository<DemoModel, Integer>{
	//changes for KIT-786
Optional<DemoModel>findByEmail(String email);

}
