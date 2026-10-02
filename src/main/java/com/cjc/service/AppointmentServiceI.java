package com.cjc.service;

	import java.util.List;

import com.cjc.model.Appointment;



	public interface AppointmentServiceI  {

		public void addAppointment(Appointment appointment);
		public List<Appointment> getAllAppointments();
		public Appointment getAppointmentById(int appointmentId);
		public void deleteAppointment(int appointmentId);
		public void updateAppointment(int appointmentId, Appointment appointment);
		
	}


