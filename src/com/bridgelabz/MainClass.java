package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args, Object function) {
		
		 Contact contcat=new Contact("Manju", "Belagvi", "Belagvi");
		
		 List<String> list = contcat.stream().map(function).collect(Collectors.toList());
	     System.out.println(list);
		 
	}
	
}
