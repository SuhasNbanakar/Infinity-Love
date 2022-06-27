package com.xworkz.states;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StatesRunner {

	public static void main(String[] args) {

		List<String> states = new ArrayList<String>();
		states.add("Karnatka");
		states.add("Goa");
		states.add("Tamli nadu");
		states.add("Gujrat");
		states.add("Dheli");
		states.add("Kerala");
		states.add("Maharastra");
		states.add("Madhya Pradesh");
		states.add("Utrakhand");
		states.add("Andhra Pradesh");

		System.out.println("*************states in Ascending order*********");
		List<String> temp = states.stream().sorted().collect(Collectors.toList());
		System.out.println(temp);

		System.out.println("*************states in descending order*********");

		List<String> temp1 = states.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
		System.out.println(temp1);

	}
}
