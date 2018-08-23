package com.grabAJob;

import java.util.Comparator;

public class YearCompare implements Comparator<JobApplication> {

	@Override
	public int compare(JobApplication arg0, JobApplication arg1) {
		
		return arg0.getYearOfExperience()-arg1.getYearOfExperience();
		
	}
	
}
