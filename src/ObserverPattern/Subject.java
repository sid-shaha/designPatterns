package ObserverPattern;

public interface Subject {
    public void addObserver(Observer observer);
    public void notifyObservers();
    public void removeObserver(Observer observer);

}
