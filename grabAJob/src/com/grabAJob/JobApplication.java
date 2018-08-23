package com.grabAJob;

public class JobApplication {
	String username;
	int yearOfExperience;
	int CurrentSal;
	int ExpectedSal;
	String skill;
	
	
	public JobApplication(String username, int yearOfExperience, int currentSal, int expectedSal, String skill) {
		super();
		this.username = username;
		this.yearOfExperience = yearOfExperience;
		CurrentSal = currentSal;
		ExpectedSal = expectedSal;
		this.skill = skill;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getYearOfExperience() {
		return yearOfExperience;
	}
	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}
	public int getCurrentSal() {
		return CurrentSal;
	}
	public void setCurrentSal(int currentSal) {
		CurrentSal = currentSal;
	}
	public int getExpectedSal() {
		return ExpectedSal;
	}
	public void setExpectedSal(int expectedSal) {
		ExpectedSal = expectedSal;
	}

	public JobApplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "JobApplication [username=" + username + ", yearOfExperience=" + yearOfExperience + ", CurrentSal="
				+ CurrentSal + ", ExpectedSal=" + ExpectedSal + ", skill=" + skill + "]";
	}
	
	
	
}
