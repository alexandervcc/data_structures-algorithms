package Principles.InterfaceSegregation;

public class Restaurant {
}


interface RestaurantInterface{
    void acceptOnlineOrder();
    void takeTelephoneOrder();
    void payOnline();
    void walkCustomerOrder();
    void payPerson();
}

class onlineClientImpl implements RestaurantInterface{
    @Override
    public void acceptOnlineOrder() {

    }

    @Override
    public void takeTelephoneOrder() {

    }

    @Override
    public void payOnline() {

    }

    @Override
    public void walkCustomerOrder() {

    }

    @Override
    public void payPerson() {

    }
}