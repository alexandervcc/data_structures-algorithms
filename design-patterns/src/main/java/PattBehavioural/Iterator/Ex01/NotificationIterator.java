package PattBehavioural.Iterator.Ex01;

public class NotificationIterator implements Iterator{
    Notification[] notificationsList;

    int pos=0;

    public NotificationIterator(Notification[] notificationsList) {
        this.notificationsList = notificationsList;
    }

    @Override
    public boolean hasNext() {
        if(pos>=notificationsList.length||notificationsList[pos]==null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        Notification notification=notificationsList[pos];
        pos++;
        return notification;
    }
}
