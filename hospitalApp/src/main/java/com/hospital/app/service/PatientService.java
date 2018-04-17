package com.hospital.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hospital.app.dao.PatientRecord;
import com.hospital.app.repository.PatientRepository;

@Service
public class PatientService {
	@Autowired
	private PatientRepository patientRepository;
	public void addPatient(PatientRecord patientRecord) {
		patientRepository.save(patientRecord);
	}
	
	public List<PatientRecord> getAllPatient() {
	    return patientRepository.findAll();
	}
	
}
