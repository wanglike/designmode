package ObserverPattern;

import java.util.Observable;

/**
 * 天气服务目标
 * Created by admin on 2018/5/4.
 */
public class WeatherSubject extends Observable {

    private String content;



    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.setChanged();
        this.notifyObservers();
    }
}
