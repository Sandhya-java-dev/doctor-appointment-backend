package com.cjc.model;

	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;

	@Entity
	public class Appointment {

		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		public Integer id;
		public String name;
		public String topic;
		public String details;
		public String date;
		public String time;
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTopic() {
			return topic;
		}
		public void setTopic(String topic) {
			this.topic = topic;
		}
		public String getDetails() {
			return details;
		}
		public void setDetails(String details) {
			this.details = details;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
		@Override
		public String toString() {
			return "Appointment [id=" + id + ", name=" + name + ", topic=" + topic + ", details=" + details + ", date="
					+ date + ", time=" + time + "]";
		}
		
		
	}



