package com.mycompany.ch15.first;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LanguageEx {

	public static void main(String[] args) {

		Language language1 = new Language("Korean", 82);
		
//		System.out.println(language.name);
		
//		ArrayList<Language> arrayList = new ArrayList<>();
		
		List<Language> languages = new ArrayList<>();
		
//		list.add("abcdefghi");  // error: language 객체를 넣어야 함
		
		languages.add(language1);
		
		Language language2 = new Language("USA", 10);
		Language language3 = new Language("Japan", 11);
		
		languages.add(language2);
		languages.add(language3);
		
		languages.add(new Language("England", 15));  // 객체 선언하는 동시에 list 상에 넣어줌
		
		
		
		Car car = new Car("Hyundai", 2000);
//		list.add(car);  // error: language 객체만 담을 수 있다.
		
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("Hyundai", 2000));
		cars.add(new Car("BMW", 2000));
		cars.add(new Car("KIA", 3000));
		
		for(int i=0; i<cars.size(); i++) {
//			System.out.println("i: " + i);
//			System.out.println(cars.get(i));
			System.out.println("cars.get("+i+").getName()" + cars.get(i).getName());
		}
		
//		for(Car car: cars) {
//			System.out.println("car.getName:" + car.getName());
//		}
		
		
//		------------------------
		
		languages.get(3).name = "UK";
		
		for(int i=0; i<languages.size(); i++) {
//			System.out.println("i: " + i);
//			System.out.println(list.get(i));
			System.out.println("languages.get("+i+").name: " + languages.get(i).name);
		}
		System.out.println("------------------");
		
		for(Language language: languages) {
			System.out.println("language.name: " + language.name);
		}
		
		
	}

}
