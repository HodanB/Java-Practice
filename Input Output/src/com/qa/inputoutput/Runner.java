package com.qa.inputoutput;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
	public static void main(String[] args) {

		Person Hodan = new Person("Hodan", 24, "London");

		System.out.println(Hodan);

		Person Amy = new Person("Amy", 28, "Glasgow");
		Person John = new Person("John", 54, "Birmingham");
		Person Harry = new Person("Harry", 34, "Paris");
		
		

		List<Person> listPerson = new ArrayList<>();

		listPerson.add(Hodan);
		listPerson.add(Amy);
		listPerson.add(John);
		listPerson.add(Harry);


		String nameOfPerson = "Hodan";

		List<Person> findSpecific = listPerson.stream().filter(n -> n.getName().equals(nameOfPerson))
				.collect(Collectors.toList());

		System.out.println(findSpecific);

		listPerson.stream().forEach(n -> InOut.writeFile(n.toString()));
		
		InOut.readFile();
	
	}
}

