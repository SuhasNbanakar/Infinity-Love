package com.xworkz.lovers;

import java.util.HashMap;
import java.util.Map;

public class LoversCalling {

	public static void main(String[] args) {

		Map<String, String> map=new HashMap<String, String>();
		map.put("Sanju","Megh");
		map.put("Sunil", "Chandana");
		map.put("Suhas", "Sunny");
		map.put("Yash", "Laxmi");
		
		System.out.println(map.keySet());
		
		System.out.println(map.values());
		
		System.out.println(map.keySet()+" "+map.values());
	}

}
