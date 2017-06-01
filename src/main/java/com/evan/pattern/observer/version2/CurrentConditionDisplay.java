package com.evan.pattern.observer.version2;

/**
 * Created by wangzhen318 on 2017/5/10.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    /**
     * 保存Subject的引用。如果取消注册会比较方便
     */
    private Subject weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
