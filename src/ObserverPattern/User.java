package ObserverPattern;

public class User implements Observer{

    int id;

    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public void update(Book book) {
        System.out.println("Thanks for the update, book "+book.getName()+" is available now for user "+this.name);
    }
}
