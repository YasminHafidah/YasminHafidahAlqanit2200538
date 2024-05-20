package Inheritance_No_1;
import java.util.Scanner;
public class Main_Inheritance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan sisi1 : ");
        double side1 = input.nextDouble();
        System.out.println("Masukkan sisi2 : ");
        double side2 = input.nextDouble();
        System.out.println("Masukkan sisi3 : ");
        double side3 = input.nextDouble();
        System.out.println("Masukkan warna : ");
        String color = input.next();
        System.out.println("Apakah segitiga terisi (true/false) : ");
        boolean fill = input.nextBoolean();
        
        Segitiga segitigaBaru = new Segitiga(side1,side2,side3);
        segitigaBaru.setColor(color);
        segitigaBaru.setFilled(fill);
        
        System.out.println("");
        System.out.println(segitigaBaru);
        System.out.println("Luas : "+segitigaBaru.getArea());
        System.out.println("Keliling : "+segitigaBaru.getPerimeter());
        System.out.println("Warna : "+segitigaBaru.getColor());
        System.out.println("Apakah terisi atau tidak : "+segitigaBaru.isFilled());    
    }
    
}