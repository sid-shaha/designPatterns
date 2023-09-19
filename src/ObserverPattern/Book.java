package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Book implements Subject{
    private int id;
    private String name;
    private String author;

    private List<Observer> observers;

    private boolean availability;


    public Book(int id, String name, String author, boolean availability) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.availability = availability;
        this.observers = new ArrayList<>();
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
        availabilityChanged();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public void availabilityChanged(){
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index>=0){
            observers.remove(index);
        }
    }
}
