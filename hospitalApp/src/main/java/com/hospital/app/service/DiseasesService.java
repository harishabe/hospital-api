package com.hospital.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.app.dao.DiseasesRecord;
import com.hospital.app.repository.DiseasesRepository;

@Service
public class DiseasesService {
	@Autowired
	private DiseasesRepository diseasesRepository;
	public void addDiseasesDetail(DiseasesRecord diseasesRecord) {
		diseasesRepository.save(diseasesRecord);
	}
}
