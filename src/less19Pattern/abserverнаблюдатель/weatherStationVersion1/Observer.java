package less19Pattern.abserverнаблюдатель.weatherStationVersion1;

/**
 * Created by Tom on 07.12.2017.
 */
public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
