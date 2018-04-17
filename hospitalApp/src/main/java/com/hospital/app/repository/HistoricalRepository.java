package com.hospital.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.hospital.app.dao.Historical;

public interface HistoricalRepository extends CrudRepository<Historical, Long>{
	
}

