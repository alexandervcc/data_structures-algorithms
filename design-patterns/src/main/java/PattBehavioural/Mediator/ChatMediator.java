package PattBehavioural.Mediator;

import java.util.ArrayList;
import java.util.List;

public interface ChatMediator {
    public void sendMessage(String msg, User usr);
    void addUser(User usr);
}

class ChatMediatorImpl implements ChatMediator{
    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User usr) {
        for(User user:users){
            if(user!=usr){
                user.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User usr) {
        this.users.add(usr);
    }
}