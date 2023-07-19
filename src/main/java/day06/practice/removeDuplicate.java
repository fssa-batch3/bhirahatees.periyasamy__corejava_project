package day06.practice;

import java.util.*;

public class removeDuplicate {
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
