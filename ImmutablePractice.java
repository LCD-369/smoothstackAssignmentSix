package com.louis;

import java.util.Date;
import java.util.HashMap;

public final class ImmutablePractice {
	
	private final String name;
	private final int id;
	private final Date d;
	private final HashMap<Integer, String> practiceMap;
	
	public ImmutablePractice(String name, int id, HashMap<Integer, String >practiceMap, Date d) {
		this.name = name;
		this.id = id;
		this.practiceMap = practiceMap;
		this.d = d;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	public HashMap<Integer, String> getPracticeMap() {
		
		HashMap<Integer, String> clone = (HashMap<Integer, String>) practiceMap;
		return clone;
	}
	public Date getDate() {
		return (Date) d.clone();
		
	}
}
