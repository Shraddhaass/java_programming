
class Q{
    int n;
    boolean valueSet=false;
    synchronized int get(){
        while(!valueSet)
        try{
            wait(100);
        }
        catch(InterruptedException e){
            System.out.println("Interrrupted exception caught");
        }
        System.out.println("Got"+n);
        valueSet=false;
        notify();
        return n;
    }
    synchronized void put(int n){
        while(valueSet)
        try{
            wait(100);
        }
        catch(InterruptedException e) {
            System.out.println("Interrrupted exception caught");
        }  
        this.n=n;
        valueSet=true;
        System.out.println("Put:"+n);
        notify();
         }
}
class Producer implements Runnable{
Q q;
Producer(Q q){
this.q=q;
new Thread(this,"producer").start();

}
public void run(){
    int i=0;
    while(true){
    q.put(i++);
}
}
}
class Consumer implements Runnable{
    Q q;
    Consumer(Q q){
    this.q=q;
    new Thread(this,"producer").start();
    
    }
    public void run(){
        while(true){
        q.get();
    }
    }
    }

public class synchrprg6 {
    public static void main(String[] args) {
        Q q=new Q();
        new Producer(q);
        new Consumer(q);
        System.out.println("Press the control to stop");

    }
}
