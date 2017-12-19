package less19Pattern.abserverнаблюдатель.weatherStationVersion1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom on 07.12.2017.
 */
public class WeatherData implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(observers.indexOf(o));
    }

    @Override
    public void notifyObservers() {
        for (Observer x : observers) {
            x.update(temperature, humidity, pressure);
        }
    }


    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}

