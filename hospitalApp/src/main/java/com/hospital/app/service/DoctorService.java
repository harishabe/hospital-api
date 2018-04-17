package com.hospital.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.app.dao.DoctorRecord;
import com.hospital.app.repository.DoctorRepository;

@Service
public class DoctorService {
	@Autowired
	private DoctorRepository doctorRepository;
	public void addDoctor(DoctorRecord doctorRecord) {
		doctorRepository.save(doctorRecord);
	}
	
	public DoctorRecord findDoctorRecordByFname(String fname) {
		return doctorRepository.findByFname(fname);
	}
}
