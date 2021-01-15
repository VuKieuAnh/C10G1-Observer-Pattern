import java.util.ArrayList;
import java.util.List;

public class Account implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notification(String mess) {
        for (Observer o: observers
             ) {
            o.update(mess);
        }
    }
}