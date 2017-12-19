package less19Pattern.abserverнаблюдатель.weatherStationVersion1;

/**
 * Created by Tom on 07.12.2017.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditinDisplay currentDisplay = new CurrentConditinDisplay(weatherData);
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(100, 200, 300);
        weatherData.setMeasurements(1, 2, 3);
        weatherData.setMeasurements(10, 20, 30);


    }
}
