package Inheritance_No_1;

public class ObjekGeometris {
    String color = "white";
    boolean filled;
    
    ObjekGeometris(){        
    }
    
    ObjekGeometris(String color, boolean filled){
        this.color = color;
        this.filled=filled;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public Boolean isFilled(){
        return filled;
    }
    
    public void setFilled(Boolean filled){
        this.filled=filled;
    }
    
    public String toString(){
        return "color: " + color + "and filled: " + filled;
    }
    
}
