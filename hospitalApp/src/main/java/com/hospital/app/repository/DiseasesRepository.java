package com.hospital.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.hospital.app.dao.DiseasesRecord;;

public interface DiseasesRepository extends CrudRepository<DiseasesRecord, Long> {

}
