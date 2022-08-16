
class Const_Over{
    double l;
    double b;
    double h;
    Const_Over(double l){
        this.l=this.b=this.h=l;
    }
    Const_Over(double l,double b,double h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    double volume(){
        return l*b*h;
    }
    void print(){
        System.out.println("Demostrate Constractor overloading and method overloading");
    }
    void print(double v){
        System.out.println("Volume"+v);
    }
}

public class program1 {
    public static void main(String[] args) {
       Const_Over ob=new Const_Over(10);
       double v1=ob.volume();
       ob.print();
       ob.print(v1);
       Const_Over ob1=new Const_Over(10,20,10);
       double v2=ob1.volume();
       ob1.print();
       ob1.print(v2);
    } 

}
