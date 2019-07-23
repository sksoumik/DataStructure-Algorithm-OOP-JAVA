package observer_pattern;

public interface Subject {
    void subscribe(Observer observer);

    void unSubscribe(Observer observer);

    void notifySubscriber();

    void uploadVideo(String videoTitle);
}
