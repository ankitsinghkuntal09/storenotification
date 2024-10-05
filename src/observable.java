package src;
import src.observable;
import src.observer;
import java.util.ArrayList;
import java.util.List;

public interface observable {
    void add(observer obj);
    void remove(observer obj);
    void notifyall();
    void setdata(int x);
}


