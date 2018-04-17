package com.hospital.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.hospital.app.dao.PatientRecord;

//public interface PatientRepository extends CrudRepository<PatientRecord, Long>{
//	
//}

public interface PatientRepository extends JpaRepository<PatientRecord, Long> {

}