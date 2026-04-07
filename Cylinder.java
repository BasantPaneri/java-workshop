import java.util.*;
import java.math.*;

class Cylinder{
    private double radius,height;

    double getRadius(){
        return radius;
    }
    double getHeight(){
        return height;
    }
    void setRadius(double r){
        if(r>0)
            radius=r;
        else
            radius=0;
    }
    void setHeight(double h){
        if(h>0)
            height=h;
        else
            height=0;
    }
    void setDimensions(double r,double h){
        if(r>0)
            radius=r;
        else
            radius=0;
        if(h>0)
            height=h;
        else
            height=0;
    }
    public Cylinder(double h,double r){
        radius=r;
        height=h;
    }
    static double area(double r,double h){
        double a=(2*Math.PI*r*h)+(2*Math.PI*r*r);
        return a;
    }

}

class Test{
    public static void main(String[] args) {
        Cylinder c=new Cylinder(10, 20);
            System.out.println(c.area(c.getRadius(),c.getHeight()));
        
    }
}