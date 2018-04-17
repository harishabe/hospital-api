package com.hospital.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.app.dao.DiseasesRecord;
import com.hospital.app.service.DiseasesService;

@CrossOrigin(origins = "http://localhost:8083")
@RestController
public class DiseasesController {
	@Autowired
	private DiseasesService diseasesService;
	@RequestMapping(value="/addDiseasesDetail",method=RequestMethod.POST)
	public ResponseEntity<String> addDiseases(@RequestBody DiseasesRecord diseasesRecord){
		HttpHeaders headers = new HttpHeaders();
		diseasesService.addDiseasesDetail(diseasesRecord);
		return new ResponseEntity<String>("{\"MSG\":\"Diseases added\"}",HttpStatus.OK);
	}
	
}
