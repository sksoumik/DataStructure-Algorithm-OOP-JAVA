package observer_pattern;

public class Subscriber implements Observer {
    private String name;
    private Channel channel = new Channel();


    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Hey " + name + ", new video uploaded: " + channel.title);
    }

    @Override
    public void subscribeChennel(Channel ch) {
        channel = ch;
    }


}
