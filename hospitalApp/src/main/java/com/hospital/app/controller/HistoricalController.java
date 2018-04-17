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

import com.hospital.app.dao.Historical;
import com.hospital.app.service.HistoricalService;

//@CrossOrigin(origins = "http://localhost:8083")
@RestController
public class HistoricalController {
	@Autowired
	private HistoricalService historicalService;
	@RequestMapping(value="/addHistorical",method=RequestMethod.POST)
	public ResponseEntity<String> addHistorical(@RequestBody Historical historical){
		HttpHeaders headers = new HttpHeaders();
		historicalService.addHistorical(historical);
		return new ResponseEntity<String>("{\"MSG\":\"Historical Data added\"}",HttpStatus.OK);
	}
}
