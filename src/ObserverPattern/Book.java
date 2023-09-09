package ObserverPattern;

import java.util.List;

public class Book {
    private int id;
    private String name;
    private String author;

    private List<Observer> observers;

    private boolean availability;

    public int getId() {
        return id;
    }

    public Book(int id, String name, String author, List<Observer> observers, boolean availability) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.observers = observers;
        this.availability = availability;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
        if(availability){
            for (Observer observer : observers) {
                observer.update(this);
            }
        }
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

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }
}
