package com.hospital.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.app.dao.PatientRecord;
import com.hospital.app.service.PatientService;
import com.hospital.app.repository.PatientRepository;
import java.util.List;
@CrossOrigin(origins = "http://localhost:8083")
@RestController
public class PatientController {
	@Autowired
	private PatientService patientService;
	PatientRepository patientRepository;
	//Doctor signUp API - (POST REQUEST)
	@RequestMapping(value="/addPatient",method=RequestMethod.POST)
	public ResponseEntity<String> addDoctor(@RequestBody PatientRecord patientRecord){
		HttpHeaders headers = new HttpHeaders();
		patientService.addPatient(patientRecord);
		return new ResponseEntity<String>("{\"MSG\":\"Patient successfully added\"}",HttpStatus.OK);
	}
	
	//Patient Detail API - (GET REQUEST)
	@RequestMapping(value="/getPatient",method=RequestMethod.GET)
	public @ResponseBody Iterable<PatientRecord> getPatient() {
         return patientService.getAllPatient();
    }
}
