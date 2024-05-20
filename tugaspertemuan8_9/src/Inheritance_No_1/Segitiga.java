package Inheritance_No_1;

public class Segitiga extends ObjekGeometris{
    double side1, side2, side3;
    
    Segitiga(){
        side1=1;
        side2=1;
        side3=1;
    }
    
    Segitiga(double sisi1, double sisi2, double sisi3){
        this.side1=sisi1;
        this.side2=sisi2;
        this.side3=sisi3;
    }
    
    public double getSide1(){
        return side1;
    }
    
    public void setSide1(double side1){
        this.side1=side1;
    }
    
    public double getSide2(){
        return side2;
    }
    
    public void setSide2(double side2){
        this.side2=side2;
    }
    
    public double getSide3(){
        return side3;
    }
    
    public void setSide3(double side3){
        this.side3=side3;
    }
    
    double getArea(){
        double s = (side1+side2+side3)*0.5;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    
    double getPerimeter(){
        return side1+side2+side3;
    }
    
    @Override
    public String toString(){
        return "Segitiga: sisi1 = " + side1 + " sisi2= " + side2+ " sisi3 = "+side3;
    }
    
}
