package com.kandl.ropgame.model;

import java.util.HashMap;
import java.util.Map;

import com.badlogic.gdx.utils.Array;

public class Day {
	private final int dayMax;
	private final int dayConcurrent;
	private final Array<String> dayNotes;
	private final boolean showInfo;
	
	public static final Map<Integer, Day> dayMapper = new HashMap<Integer, Day>();
	static {
		/*dayMapper.put(1, new Day(3,1,true,(String[]) null));
		dayMapper.put(3, new Day(4,1,true,"One more person is coming today."));
		dayMapper.put(4, new Day(5,2,true,"Another person is coming today.","Two groups are coming at a time, now."));
		dayMapper.put(5, new Day(6,2,true,"Six people are going to visit today."));
		dayMapper.put(6, new Day(6,3,false,"Three groups are coming at a time.","Visitor names won't be on recipes anymore."));
		dayMapper.put(7, new Day(7,3,false,"Another person is visiting today."));
		dayMapper.put(8, new Day(8,3,false,"One more person is coming today."));
		dayMapper.put(9, new Day(9,3,false,"Nine people are visiting today."));
		dayMapper.put(10, new Day(10,4,false,"Ten people are visiting today.","Four groups are coming at a time!","Today's the last day!"));*/
		
		// This is for quick demos
		dayMapper.put(1, new Day(4,2,true,(String[]) null));
		dayMapper.put(2, new Day(5,2,true,"One more person is coming today."));
		dayMapper.put(3, new Day(6,3,true,"Another person is coming today.","Three groups are coming at a time."));
		dayMapper.put(4, new Day(8,4,true,"Two more people are coming today.","Four groups are arriving at the same time."));
		dayMapper.put(5, new Day(10,4,false,"Ten people are going to visit today.","The names of people won't be on recipes."));
	}
	
	public Day(int dayMax, int dayConcurrent, boolean showInfo, String... dayNotes) {
		this.dayMax = dayMax;
		this.dayConcurrent = dayConcurrent;
		this.showInfo = showInfo;
		if (dayNotes != null) { this.dayNotes = new Array<String>(dayNotes); }
		else { this.dayNotes = new Array<String>(0); }
	}
	
	public int getDayMax() {
		return dayMax;
	}
	
	public int getDayConcurrent() {
		return dayConcurrent;
	}
	
	public Array<String> getDayNotes() {
		return dayNotes;
	}

	public boolean isShowInfo() {
		return showInfo;
	}
}
