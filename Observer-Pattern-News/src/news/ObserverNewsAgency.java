package news;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class ObserverNewsAgency extends Observable {
    private String news;

    public void setNews(String news) {
        this.news = news;
        setChanged();
        notifyObservers(news);
    }
}