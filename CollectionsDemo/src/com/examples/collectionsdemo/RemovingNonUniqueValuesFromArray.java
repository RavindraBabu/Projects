package com.examples.collectionsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemovingNonUniqueValuesFromArray {

	public static void main(String[] args) {
		String[] names = { "hi", "Ravi", "Ravi", "vivek", "vivek", "Ravi", "kamal", "kamal", "raghu", "arjun" };

		ArrayList<String> list_Of_Names = new ArrayList<>(Arrays.asList(names));

		RemovingNonUniqueValuesFromArray al = new RemovingNonUniqueValuesFromArray();

		System.out.println(list_Of_Names);
		al.removing_Non_Unique_Vaules(list_Of_Names);
	}

	public ArrayList<String> removing_Non_Unique_Vaules(ArrayList<String> list_Of_Names) {

		Collections.sort(list_Of_Names);

		for (int i = 0; i < list_Of_Names.size();) {
			int count = 0;

			for (int j = i; j < list_Of_Names.size(); j++) {
				if (list_Of_Names.get(i).equals(list_Of_Names.get(j))) {
					count++;
				}
			}

			if (count == 1) {
				list_Of_Names.remove(i);
			} else if (count > 1) {
				i = count + i;
			} else {
				i = i + 1;
			}
		}

		System.out.println(list_Of_Names);
		return list_Of_Names;

	}

}
