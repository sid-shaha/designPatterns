package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        User u1 = new User(1,"Jack");
        User u2 = new User(2,"Sid");


        Book book1 = new Book(1,"Atomic Habits","Me",false);
        book1.addObserver(u1);
        book1.addObserver(u2);

        Book book2 = new Book(2,"Habits","You",false);
        book2.addObserver(u1);

        book1.setAvailability(true);
        book2.setAvailability(true);

    }
}
