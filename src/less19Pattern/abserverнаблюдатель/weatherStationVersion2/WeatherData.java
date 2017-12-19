package less19Pattern.abserverнаблюдатель.weatherStationVersion2;


import java.util.Observable;

/**
 * Created by Tom on 07.12.2017.
 */
public class WeatherData extends Observable { //НАБЛЮДАЕМЫЙ
    private float temperature;
    private float humidity;
    private float pressure;

    public float getTemperature() {  // get используются наблюдателями для получения состояния объекта
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void measurmentsChanged() {
        setChanged(); //перед вызовом notifyObservers надо вызвать setChanged
        notifyObservers(); // модель ЗАПРСА данных
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurmentsChanged();
    }
}

