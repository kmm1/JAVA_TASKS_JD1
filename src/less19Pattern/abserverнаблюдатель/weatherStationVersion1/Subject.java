package less19Pattern.abserverнаблюдатель.weatherStationVersion1;

/**
 * Created by Tom on 07.12.2017.
 */
public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
