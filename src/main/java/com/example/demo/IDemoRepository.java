package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.DemoModel;

public interface IDemoRepository extends JpaRepository<DemoModel, Integer>{

}
