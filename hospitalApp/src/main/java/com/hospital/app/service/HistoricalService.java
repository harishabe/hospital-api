package com.hospital.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.app.dao.Historical;
import com.hospital.app.repository.HistoricalRepository;

@Service
public class HistoricalService {
	@Autowired
	private HistoricalRepository historicalRepository;
	public void addHistorical(Historical historical) {
		historicalRepository.save(historical);
	}
}
