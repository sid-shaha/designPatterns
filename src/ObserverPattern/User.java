package ObserverPattern;

public class User implements Observer{

    int id;
    public User(int id) {
        this.id = id;
    }

    @Override
    public void update(Book book) {
        System.out.println("Thanks for the update, book "+book.getName()+" is available now for user "+this.id);
    }
}
