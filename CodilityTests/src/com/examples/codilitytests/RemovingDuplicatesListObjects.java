package com.examples.codilitytests;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class RemovingDuplicatesListObjects {

	public static void main(String[] args) {

		ArrayList<student> students_List = new ArrayList();

		students_List.add(new student(1, "hyd"));
		students_List.add(new student(2, "ch"));
		students_List.add(new student(3, "hyd"));
		students_List.add(new student(4, "ch"));
		students_List.add(new student(5, "bng"));
		students_List.add(new student(6, "mumbai"));
		students_List.add(new student(7, "hyd"));

		for(student student:students_List){
			System.out.println(student.getSt_ID()+"=="+student.getcity_Name());
		}

		Set set = new TreeSet<>(new Comparator<student>() {

			@Override
			public int compare(student o1, student o2) {
				// TODO Auto-generated method stub
				if (o1.getcity_Name().equalsIgnoreCase(o2.getcity_Name())) {
					return 0;
				}
				return 1;
			}
		});
		set.addAll(students_List);

		System.out.println("\n***** After removing duplicates *******\n");

		ArrayList<student> newList = new ArrayList(set);

		for(student student:newList){
			System.out.println(student.getSt_ID()+"=="+student.getcity_Name());
		}

	}

}

class student {
	private int st_ID;
	private String city_Name;

	public student(int st_ID, String name) {
		this.st_ID = st_ID;
		this.city_Name = name;

	}

	public int getSt_ID() {
		return st_ID;
	}

	public String getcity_Name() {
		return city_Name;
	}

}