



package com.cjc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Appointment;
import com.cjc.repo.AppointmentRepositoryI;


	

	@Service
	public class AppointmentService implements AppointmentServiceI{

		@Autowired
		AppointmentRepositoryI appointmentRepository;
		
		@Override
		public void addAppointment(Appointment appointment) {
			
			appointmentRepository.save(appointment);
		}

		@Override
		public List<Appointment> getAllAppointments() {
			
			List<Appointment> list = (List<Appointment>) appointmentRepository.findAll();
			return list;
		}

		@Override
		public Appointment getAppointmentById(int appointmentId) {
			
			Optional<Appointment> ap = appointmentRepository.findById(appointmentId);
			if(ap.isPresent()) {
				Appointment a = ap.get();
				return a;
			}
			return null;
		}

		@Override
		public void deleteAppointment(int appointmentId) {
		
			appointmentRepository.deleteById(appointmentId);
		}

		@Override
		public void updateAppointment(int appointmentId, Appointment appointment) {
			
			Optional<Appointment> ap = appointmentRepository.findById(appointmentId);
			if(ap.isPresent()) {
				Appointment a = ap.get();
				a.setName(appointment.getName());
				a.setTopic(appointment.getTopic());
				a.setDetails(appointment.getDetails());
				a.setDate(appointment.getDate());
				a.setTime(appointment.getTime());
				appointmentRepository.save(a);
			}
		}
	}
