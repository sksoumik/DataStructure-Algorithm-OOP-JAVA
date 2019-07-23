package observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    List<Observer> subs = new ArrayList<>();
    String title;

    @Override
    public void subscribe(Observer observer) {
        subs.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        subs.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        for (Observer sub : subs) {
            sub.update();
        }
    }

    @Override
    public void uploadVideo(String videoTitle) {
        this.title = videoTitle;
        notifySubscriber();
    }


}
