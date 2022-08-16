
interface Rectangle{
    float area_rect(float x,float y);
}
interface Triangle{
    float area_tr(float x,float y);
}
class Area implements Rectangle,Triangle{
    public float area_rect(float x,float y){
        return (x*y);
    }
    public float area_tr(float x,float y){
        return((x*y)/2);
    }
}
public class program4 {
    public static void main(String[] args) {
        Area a=new Area();
        System.out.println("Area of Rectangle:"+a.area_rect(10,20));
        System.out.println("Area of Triangle:"+a.area_tr(10,20));
    }
}
