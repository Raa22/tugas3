/**
 * Created by RockStar on 3/31/2015.
 */
public class Circle{
//private
    private double radius;
    private String color;
//konstruktor overloaded
public Circle()

    {
        radius = 1.0;
        color = "blue";
    }
    public Circle(double r)

    {
        radius = r;
        color = "blue";
    }
    public Circle(double r,String c)

    {
        radius = r;
        color = c;
    }
 //public method
public double getRadius (){
    return radius;
}public String getColor(){
        return color;
    }public double getArea(){
        return radius*radius*Math.PI;
    }

}
