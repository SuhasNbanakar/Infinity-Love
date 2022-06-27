package com.xworkz.computer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ComputerBoost {

	public static void main(String[] args) {

		List<String> brands = new ArrayList<String>();
		brands.add("LG");
		brands.add("Sony");
		brands.add("Asus");
		brands.add("Dell");
		brands.add("Apple");
		brands.add("Hp Envy");
		brands.add("Lenovo");
		brands.add("MacBook");
		brands.add("Elite Book");
		brands.add("NetBook");

		Iterator<String> itr = brands.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
			 System.out.println("**************find all brand with length greater than 4************");
			List<String> computer=brands.stream().filter(temp -> temp.length() > 4).collect(Collectors.toList());
			System.out.println(computer);
		
			System.out.println("*************brands in Uppercase**************");
		List<String> computer1=brands.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(computer1);
	}

}
