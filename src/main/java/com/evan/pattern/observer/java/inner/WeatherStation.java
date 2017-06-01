package com.evan.pattern.observer.java.inner;

import com.evan.pattern.observer.version2.CurrentConditionDisplay;
import com.evan.pattern.observer.version2.WeatherData;

/**
 * Created by wangzhen318 on 2017/5/15.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.3f);
        weatherData.setMeasurements(78,90,30.4f);
    }
}
