package com.nt.beans;

import java.util.List;

public class EnggCourse {
	private List<String> subjects;

	public EnggCourse() {
  System.out.println("EnggCourse::0-param Constructor");
	}
    
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "EnggCourse [subjects=" + subjects + "]";
	}
}
