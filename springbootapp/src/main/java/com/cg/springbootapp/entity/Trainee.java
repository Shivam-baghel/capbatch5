package com.cg.springbootapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainee_tbl")
public class Trainee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="trainee_id")
	private int traineeId;
	
	@Column(name="trainee_name",length = 30)
	private String traineeName;
	
	@Column(name="trainee_domain", length = 20)
	private String traineeDomain;
	
	@Column(name="trainee_location", length = 30)
	private String traineeLocation;
	
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getTraineeDomain() {
		return traineeDomain;
	}
	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}
	public String getTraineeLocation() {
		return traineeLocation;
	}
	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}	
	
}
