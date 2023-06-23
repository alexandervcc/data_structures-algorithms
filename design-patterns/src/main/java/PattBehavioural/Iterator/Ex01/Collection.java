package PattBehavioural.Iterator.Ex01;

//Agreggate
public interface Collection {
    public Iterator createIterator();
}

class NotificationCollection implements Collection{
    static final int MAX_ITEMS=5;
    int numberItems=0;
    Notification[] notificationsList;

    public NotificationCollection() {
        notificationsList=new Notification[MAX_ITEMS];

        addItem("Not 1");
        addItem("Not 2");
        addItem("Not 3");
    }

    private void addItem(String str){
        if(numberItems==MAX_ITEMS){
            System.err.println("Full");
        }else {
            Notification n= new Notification(str);
            notificationsList[numberItems]=n;
            numberItems++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notificationsList);
    }
}