package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * 订阅天气服务的观察对象
 * Created by admin on 2018/5/4.
 */
public class WeatherObserver implements Observer {

    private String weatherName;
    private String reminding;

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(weatherName+"拉取天气服务的消息为："+((WeatherSubject)o).getContent());
    }

    public String getWeatherName() {
        return weatherName;
    }

    public void setWeatherName(String weatherName) {
        this.weatherName = weatherName;
    }


    public String getReminding() {
        return reminding;
    }

    public void setReminding(String reminding) {
        this.reminding = reminding;
    }
}
