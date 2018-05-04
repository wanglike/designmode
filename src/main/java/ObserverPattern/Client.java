package ObserverPattern;

/**
 * 观察者模式
 * Created by admin on 2018/5/4.
 */
public class Client {

    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject();

        WeatherObserver weatherObserverGirl = new WeatherObserver();
        weatherObserverGirl.setWeatherName("丽丽");
        WeatherObserver weatherObserverMum = new WeatherObserver();
        weatherObserverMum.setWeatherName("老妈");

        weatherSubject.addObserver(weatherObserverGirl);
        weatherSubject.addObserver(weatherObserverMum);
        weatherSubject.setContent("今天天气晴朗");
    }

}
