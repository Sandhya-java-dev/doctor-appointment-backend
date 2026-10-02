package com.cjc.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Appointment;

@Repository
public interface AppointmentRepositoryI extends CrudRepository<Appointment, Integer> {

}
