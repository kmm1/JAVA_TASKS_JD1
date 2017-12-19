package less19Pattern.abserverнаблюдатель.weatherStationVersion1;

/**
 * Created by Tom on 07.12.2017.
 */
public class CurrentConditinDisplay implements Observer {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditinDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        // display();
        System.out.println("Current condition: humadity " + humidity + " tempurature " + temperature);


    }

//    @Override
//    public void display() {
//        System.out.println("Current condition: humadity " + humidity + " tempurature " + temperature);
//    }
}
