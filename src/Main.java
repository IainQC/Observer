public class Main {
    public static void main(String[] args) {
        MessageSubscriberOne s1 = new MessageSubscriberOne(); //Observer 1
        MessageSubscriberOne s2 = new MessageSubscriberOne();

        MessagePublisher p = new MessagePublisher();

        p.attach(s1);
        p.attach(s2);

        p.notifyUpdate(new Message("Premier message"));
        p.detach(s1);
    }
}