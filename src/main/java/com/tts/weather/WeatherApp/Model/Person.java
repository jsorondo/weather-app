package com.tts.weather.WeatherApp.Model;

import lombok.Data;

import java.util.List;
@Data
public class Person {
    public String FirstName;
    public String LastName;
    public int Age;
    public List<String> FavoriteFoods;

}
