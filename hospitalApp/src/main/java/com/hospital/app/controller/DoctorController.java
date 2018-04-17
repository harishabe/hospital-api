package com.hospital.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.hospital.app.dao.DoctorRecord;
import com.hospital.app.service.DoctorService;

//@CrossOrigin(origins = "http://localhost:8083")
@RestController
public class DoctorController {
	@Autowired
	private DoctorService doctorService;
	/*@RequestMapping(value="/signUp",method=RequestMethod.POST)
	public void addDoctor(@RequestBody DoctorRecord doctorRecord) {
		doctorService.addDoctor(doctorRecord);
	}*/
	
	//Doctor signUp Api - (POST REQUEST)
	//@CrossOrigin(origins="http://localhost:8083")
	@RequestMapping(value="/signUp",method=RequestMethod.POST)
	public ResponseEntity<String> addDoctor(@Valid DoctorRecord doctorRecord,BindingResult bindingResult){
		HttpHeaders headers = new HttpHeaders();
		DoctorRecord doctorExists = doctorService.findDoctorRecordByFname(doctorRecord.getFname());
		System.out.println(doctorExists);
		if(doctorExists != null) {
			bindingResult
			.rejectValue("doctor", "error.user",
					"There is already a doctor registered with the email provided");

		}
			doctorService.addDoctor(doctorRecord);
			return new ResponseEntity<String>("{\"MSG\":\"Doctor Added\"}",HttpStatus.OK);
		
		
	}
	
	//Patient Detail Api - (GET REQUEST)
	
	
}
