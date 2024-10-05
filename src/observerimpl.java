package src;
import src.observable;
import src.observer;
import java.util.ArrayList;
import java.util.List;


public class observerimpl implements observer {
    public String name;
    public observerimpl(String name){
       this.name=name;
    }
    public void update(String objname){
        System.out.println("hey "+this.name+" !!! we have restocked "+objname+" go and  purchase");
    }

}
