package com.infogain.maindemo;

public class Job {
	String title;
	long minSal;
	long maxSal;
	@Override
	public String toString() {
		return "Job [title=" + title + ", minSal=" + minSal + ", maxSal=" + maxSal + "]";
	}
	public Job(String title, long minSal, long maxSal) {
		super();
		this.title = title;
		this.minSal = minSal;
		this.maxSal = maxSal;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getMinSal() {
		return minSal;
	}
	public void setMinSal(long minSal) {
		this.minSal = minSal;
	}
	public long getMaxSal() {
		return maxSal;
	}
	public void setMaxSal(long maxSal) {
		this.maxSal = maxSal;
	}
	
}
