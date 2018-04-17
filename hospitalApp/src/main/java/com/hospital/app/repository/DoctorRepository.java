package com.hospital.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.hospital.app.dao.DoctorRecord;

public interface DoctorRepository extends CrudRepository<DoctorRecord, Long>{
	DoctorRecord findByFname(String fname);
}

