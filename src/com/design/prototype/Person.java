package com.design.prototype;

import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable{

	private List<String> sehirler;
	
	public Person() {
		sehirler=new ArrayList<>();
	}
	
	private Person(List<String> list) {
		this.sehirler=list;
	}

	public void Fill() {
		sehirler.add("Ahmet");
		sehirler.add("Mehmet");
		sehirler.add("Ýsmail");
	}
	
	public List<String> getList(){
		return sehirler;
	}
	

	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> temp=new ArrayList<>();
		for (String item : sehirler) {
			temp.add(item);
		}
		return new Person(temp);
	}
	
}
