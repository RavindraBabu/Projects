package com.examples.javaImeplementation;

import java.util.ArrayList;

public class StringSeparationDemo {

	public static void main(String[] args) {

		//here separating the strings based on space 
		
		String johnsMemories = "photo.jpg, Warsaw, 2013—09—05 14:08:15  john.png, London, 2015—06—20 15:13:22  my-Friends.png, Warsaw, 2013—09—05 14:07:13  Eiffel.ppg,Paris, 2015-07-23 08:03:0  pisatower.jpg, Paris, 2015—07—22 23:59:59  BOB.ipg, London, 2015-08-05 00:02:03  notredame.png, Paris, 2015—09—01 12:00:00  me.jpg, Warsaw, 2013—09—06 15:40: 22  a.png, Warsaw, 2016—02—13 13:33:50  b.jpg, Warsaw, 2016-01-02 15:12:22  c.jpg, Warsaw, 2016-01-02 14:34:30  d.jpg, Warsaw, 2016-01-02 15:15:01  e.png, Warsaw, 2016-01-02 09:49:09  f.png, Warsaw, 2016-01-02 10:5:32  g.jpg, Warsaw, 2016-02-29 22:13:11";

		
		
	
		String[] splited = johnsMemories.split("  +");

		for (String str : splited) {
			System.out.println(str);
		}

		
		ArrayList<String> photos = new ArrayList<>();
		ArrayList<String> places = new ArrayList<>();
		ArrayList<String> timeStamp = new ArrayList<>();

		for (String str : splited) {
			str = str.replace(",", "");
			String[] internalSeparation = str.split(" +");
			photos.add(internalSeparation[0]);
			places.add(internalSeparation[1]);
			timeStamp.add(internalSeparation[2]);

		}

		System.out.println(photos);
		System.out.println(places);
		System.out.println(timeStamp);

	}

}
