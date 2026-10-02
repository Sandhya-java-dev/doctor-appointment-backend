package com.cjc.controller;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Appointment;
import com.cjc.service.AppointmentService;

//	import com.crud.model.Appointment;
//	import com.crud.service.AppointmentService;
	@CrossOrigin("*")
	@RestController
	public class AppointmentController {

		@Autowired
		AppointmentService appointmentService;
		
		@PostMapping("/add")
		public Appointment addAppointment(@RequestBody Appointment appointment) {
			
			appointmentService.addAppointment(appointment);
			return appointment;
		}
		
		@GetMapping("/get")
		public List<Appointment> getAllAppointments() {
			
			List<Appointment> allAppointments = appointmentService.getAllAppointments();
			return allAppointments;
		}
		
		@GetMapping("/getById/{id}")
		public Appointment getAppointmentById(@PathVariable int id) {
			
			Appointment ap = appointmentService.getAppointmentById(id);
			return ap;
		}
		
		@DeleteMapping("/delete/{id}")
		public String deleteAppointment(@PathVariable int id) {
			
			appointmentService.deleteAppointment(id);
			return "Appointment Deleted....! : " +id;
		}
		
		@PutMapping("/update/{id}")
		public Appointment update(@PathVariable int id, @RequestBody Appointment appointment) {
			
			appointmentService.updateAppointment(id, appointment);
			return appointment;
		}
		
	}


