package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        User u1 = new User(1);
        User u2 = new User(2);

        List<Observer> observerList= new ArrayList<>();
        observerList.add(u1);
        Book book1 = new Book(1,"Atomic Habits","Me",observerList,false);


        List<Observer> observerList2= new ArrayList<>();
        observerList2.add(u1);
        observerList2.add(u2);

        Book book2 = new Book(2,"Habits","Meo",observerList2,false);

        // observerList2.remove(u2);

        book1.setAvailability(true);
        book2.setAvailability(true);

    }
}
