package day06.test;

import java.util.ArrayList;

public class TestRemoveDuplicates {

	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<>();

		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");

		System.out.println(cityList);
		ArrayList<String> uniques = new ArrayList<>();

		for (String city : cityList) {
			if (!uniques.contains(city)) {
				uniques.add(city);
			}
		}

		System.out.println(uniques);

	}
}
