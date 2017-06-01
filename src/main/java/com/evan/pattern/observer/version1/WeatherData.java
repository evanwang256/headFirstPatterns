package com.evan.pattern.observer.version1;

/**
 * Created by wangzhen318 on 2017/5/10.
 */
public class WeatherData {
     void measurementsChanged() {
         CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();
         StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
         ForecastDisplay forecastDisplay = new ForecastDisplay();

         float temp = getTemperature();
         float humidity = getHumidity();
         float pressure = getPressure();
         currentConditionDisplay.update(temp,humidity, pressure);
         statisticsDisplay.update(temp, humidity, pressure);
         forecastDisplay.update(temp, humidity, pressure);

     }

    float getTemperature() {
        return 0;
    }

    float getHumidity() {
        return 0;
    }

    float getPressure() {
        return 0;
    }
}
