package less19Pattern.abserverнаблюдатель.weatherStationVersion2;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Tom on 07.12.2017.
 */
public class CurrentConditinDisplay implements Observer { //НАБЛЮДАТЕЛЬ
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditinDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }


    @Override
    public void update(Observable o, Object arg) {
        WeatherData weatherData = (WeatherData) o;
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        System.out.println("Current condition: humadity " + humidity + " tempurature " + temperature);

    }
}
