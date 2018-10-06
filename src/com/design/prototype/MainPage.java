package com.design.prototype;

import java.util.List;

public class MainPage {

	public static void main(String[] args) throws CloneNotSupportedException {

		// Orjinal List
		Person p = new Person();
		p.Fill();
		System.out.println("Orjinal : " + p.getList());

		// Clone - 1
		Person p1 = (Person) p.clone();
		List<String> p1_list = p1.getList();
		p1_list.add("Mehmet");
		System.out.println("Clone - 1 : " + p1.getList());

		// Clone - 2
		Person p2 = (Person) p.clone();
		List<String> p2_list = p2.getList();
		p2_list.remove("Ahmet");
		System.out.println("Clone - 2 : " + p2.getList());
		
		System.out.println("Orjinal : " + p.getList());

	}
}
