
package src;
import src.observable;
import src.observer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
public static void main(String[] args) {
    
  observable lux=new observableimpl("lux coziii");
   //lux.setdata(3);
  observable vix=new observableimpl("vicks ki goliiii");
   //vix.setdata(3);
  observable crax=new observableimpl("craxxxxxxx kurkureee");
  // crax.setdata(3);



  observer o1 =new observerimpl("Ankit");
  observer o2 = new observerimpl("Bhadruuuu");
  observer o3 =new observerimpl("ramu");
  observer o4 = new observerimpl("Biramprasad");
  observer o5 =new observerimpl("Naimsingh");
  observer o6 = new observerimpl("bedparkash");

  lux.add(o1);
  lux.add(o2);
  lux.add(o6);
  lux.add(o3);

  vix.add(o1);
  vix.add(o5);
  vix.add(o4);

  crax.add(o1);
  crax.add(o2);
  crax.add(o3);
  crax.add(o4);
  crax.add(o5);
  crax.add(o6);

//   crax.setdata(5);
//   vix.remove(o1);
//   lux.remove(o3);
// crax.remove(o6);

   for(int i=0;i<10;i++){
    

    
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        String s1 = sc1.nextLine();
        if(s1.equals("lux")){
            lux.setdata(x);
        }
        else if(s1.equals("vix")){
            vix.setdata(x);
        }
        else{
            crax.setdata(x);
        }
           
   
        



    }
    
   }

}

