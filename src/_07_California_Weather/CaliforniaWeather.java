package _07_California_Weather;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

/*
 * OBJECTIVE:
 * 1. Create a program that allows the user to search for the weather
 * conditions of a given city in California. Use the example program below
 * and the Utilities class inside this project to get the temperature data
 * from a day in December 2020.
 * Example: User: Encinitas
 *          Program: Encinitas is Overcast with a tempeature of 59.01 ?F
 * 
 * 2. Create a way for the user to specify the weather condition and then
 * list the cities that have those conditions.
 * Example: User: Mostly Cloudy
 *          Program: Long Beach, Pomona, Oceanside, ...
 * 
 * 3. Create a way for the user to enter a minimum and maximum temperature
 * and then list the cities that have temperatures within that range
 * Example: User: minimum temperature ?F = 65.0, max temperature ?F = 70.0
 *          Program: Fortana, Glendale, Escondido, Del Mar, ...
 *          
 * EXTRA:
 * Feel free to add pictures for specific weather conditions or a thermometer
 * for the temperature. Also If you want your program to get the current day's
 * temperature, you can get a free API key at: https://openweathermap.org/api 
 */

public class CaliforniaWeather {
	
	void start() {
		String input = JOptionPane.showInputDialog("Do you want to get a City's Weather or see what cities have a specific Weather condition, or type in Tempature to find what cities are in a certain tempature range.");
		if (input.equals("City")) {
			getCityWeather();
		}
		if (input.equals("Weather")) {
			getWeatherCondition();
		}
		if (input.equals("Tempature")) {
			getCityTempature();
		}
	}
	
	void getWeatherCondition() {
		String weather = JOptionPane.showInputDialog("Type in a weather condition to see what cities have that weather");
        HashMap<String, WeatherData> weatherData = Utilities.getWeatherData();
        ArrayList <String> cities = new ArrayList<>();
        
        // All city keys have the first letter capitalized of each word
        for(String city : weatherData.keySet()) {
    		if (weatherData.get(city).weatherSummary.equals(weather)) {
				cities.add(city);
			}
    	}
        System.out.println(cities);
//        WeatherData datum = weatherData.get(cityName);
//        if( datum == null ) {
//            System.out.println("Unable to find weather data for: " + cityName);
//        } else {
//            System.out.println(cityName + " is " + datum.weatherSummary + " with a temperature of " + datum.temperatureF + " F");
//        }
	}
	
    void getCityWeather() {
    	String city = JOptionPane.showInputDialog("Type in a city to see it's weather");
        HashMap<String, WeatherData> weatherData = Utilities.getWeatherData();
        
        // All city keys have the first letter capitalized of each word
        String cityName = Utilities.capitalizeWords( city );
        WeatherData datum = weatherData.get(cityName);
        
        if( datum == null ) {
            System.out.println("Unable to find weather data for: " + cityName);
        } else {
            System.out.println(cityName + " is " + datum.weatherSummary + " with a temperature of " + datum.temperatureF + " F");
        }
    }
    
    void getCityTempature() {
    	int minTempature = Integer.parseInt(JOptionPane.showInputDialog("Type in a minmimum tempature"));
    	int maxTempature = Integer.parseInt(JOptionPane.showInputDialog("Type in a maximum tempature"));
    	HashMap<String, WeatherData> weatherData = Utilities.getWeatherData();
    	ArrayList <String> cities = new ArrayList();
    	for(String city : weatherData.keySet()) {
    		if (weatherData.get(city).temperatureF < maxTempature && weatherData.get(city).temperatureF > minTempature) {
				cities.add(city);
				
			}
    	}
    	System.out.println(cities);
    }
}
