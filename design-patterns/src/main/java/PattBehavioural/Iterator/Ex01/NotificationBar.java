package PattBehavioural.Iterator.Ex01;

public class NotificationBar {
    NotificationCollection notificationCollection;

    public NotificationBar(NotificationCollection notificationCollection) {
        this.notificationCollection = notificationCollection;
    }

    public void printNotifications(){
        Iterator iterator=notificationCollection.createIterator();
        System.out.println("-----NOTIFICATION BAR-----");
        while (iterator.hasNext()){
            Notification n=(Notification) iterator.next();
            System.out.println(n.getNotification());
        }
    }
}
