package com.grabAJob;

import java.util.Comparator;

public class SalaryCompare implements Comparator<JobApplication> {

	@Override
	public int compare(JobApplication o1, JobApplication o2) {
		
		return o1.getCurrentSal()-o2.getCurrentSal();
	}

}
