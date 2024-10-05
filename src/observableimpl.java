

package src;
import src.observable;
import src.observer;
import java.util.ArrayList;
import java.util.List;


public class observableimpl implements src.observable {
        public  List<observer>olist;
        public int counter;
        public String name;
        public  observableimpl(String name){
            super();
            this.counter=0;
            this.olist=new ArrayList<>();
             this.name=name;
         }

     public void add(observer obj){
             this.olist.add(obj);
     };
    public void remove(observer obj){
        this.olist.remove(obj);
        if(counter>this.olist.size()){
            this.notifyall();
     }
    }
    public void notifyall(){
        for(observer obsr:olist){
            obsr.update(this.name);
        }
    };
    public void setdata(int x){
        counter+=x;
        if(this.counter>this.olist.size()){
               this.notifyall();
        }
    };


}
