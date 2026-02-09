package com.junit.main;

import java.util.ArrayList;
import java.util.List;

public class ListManager {
	private List<Integer> list = new ArrayList<>();

	public void addElement(int element) {
		list.add(element);
	}

	public void removeElement(int element) {
		list.remove(Integer.valueOf(element));
	}

	public int getSize() {
		return list.size();
	}

	public List<Integer> getList() { 
		return list; 
	}
}