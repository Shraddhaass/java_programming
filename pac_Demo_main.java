package Shape;
public class pac_Demo_main{
    public static void main(String[] args){
        Square square=new Square();
        Triangle triangle=new Triangle();
        Circle circle=new Circle();
        square.getData((float)5.5);
        System.out.println("area of Square"+square.area());
        triangle.getData((double)20.56,(double)23.90);
        System.out.println("The area of Trianle is:"+triangle.area());
        circle.getData((double)5.5);
        System.out.println("The area of Circle is:"+circle.area());
    }
}