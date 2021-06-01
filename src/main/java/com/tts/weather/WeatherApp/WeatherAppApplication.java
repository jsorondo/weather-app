package com.tts.weather.WeatherApp;

import com.tts.weather.WeatherApp.Model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class WeatherAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherAppApplication.class, args);
//		Person person = new Person();
//		person.FirstName="John";
//		person.LastName="Doe";
//		person.Age=45;
//		person.FavoriteFoods= Arrays.asList("Pizza", "Steak", "Pie");
//
//		System.out.println(person);
	}

}
