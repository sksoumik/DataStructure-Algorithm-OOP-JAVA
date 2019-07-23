package observer_pattern;
// Ref: https://youtu.be/98DiwRp-KZk 

public class Youtube {
    public static void main(String[] args) {
        Channel programming = new Channel();
        Observer s1 = new Subscriber("Tamim");
        Observer s2 = new Subscriber("Shakib");
        Observer s3 = new Subscriber("Mashrafee");
        Observer s4 = new Subscriber("Mushfiq");
        Observer s5 = new Subscriber("Riad");

        // All subscriber subscribed to the channel called programming
        programming.subscribe(s1);
        programming.subscribe(s2);
        programming.subscribe(s3);
        programming.subscribe(s4);
        programming.subscribe(s5);

        s1.subscribeChennel(programming);
        s2.subscribeChennel(programming);
        s3.subscribeChennel(programming);
        s4.subscribeChennel(programming);
        s5.subscribeChennel(programming);

        // channel programming uploaded a video
        programming.uploadVideo("How to learn Design patterns");

        //Now, Shakib unsubscribed the channel
        programming.unSubscribe(s2);

        //Now, Shakib will not be notified
        System.out.println("\nAfter Shakib unsubscribed");
        programming.uploadVideo("How to learn Algorithms");









    }
}
