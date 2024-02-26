package tugaspertemuan3_no2;
import java.util.Scanner;
public class no2_genap {
    public static void main(String[] args) {
        int bilangan1;
        int bilangan2;
        int bilangan3;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan pertama : ");
        bilangan1 = input.nextInt();
        System.out.println("Masukkan bilangan kedua : ");
        bilangan2 = input.nextInt();
        System.out.println("Masukkan bilangan ketiga : ");
        bilangan3 = input.nextInt();
        
        if(bilangan1>bilangan2 && bilangan1>bilangan3){
            System.out.println(bilangan1+" merupakan bilangan terbesar, karena lebih besar dari  "+bilangan2+" dan "+bilangan3);
        }else if(bilangan1==bilangan2 && bilangan1>bilangan3){
            System.out.println("Terdapat dua bilangan yang bernilai sama yaitu "+bilangan1+"dan kedua bilangan tersebut lebih besar daripada "+bilangan3+" Maka "+bilangan1+" merupakan bilangan terbesar");
        }else if(bilangan1==bilangan3 && bilangan1>bilangan2){
            System.out.println("Terdapat dua bilangan yang bernilai sama yaitu "+bilangan1+" dan kedua bilangan tersebut lebih besar daripada "+bilangan2+" Maka "+bilangan1+" merupakan bilangan terbesar");
        }else if(bilangan2==bilangan3 && bilangan2>bilangan1){
            System.out.println("Terdapat dua bilangan yang bernilai sama yaitu "+bilangan2+" dan kedua bilangan tersebut lebih besar daripada "+bilangan1+" Maka "+bilangan2+" merupakan bilangan terbesar");
        }else if(bilangan2>bilangan1 && bilangan2>bilangan3){
            System.out.println(bilangan2+" merupakan bilangan terbesar, karena lebih besar dari "+bilangan1+" dan "+bilangan3);
        }else if(bilangan3>bilangan1 && bilangan3>bilangan2){
            System.out.println(bilangan3+" merupakan bilangan terbesar, karena lebih besar dari "+bilangan1+" dan "+bilangan2);
        }else{
            System.out.println("Tidak ada bilangan terbesar, semua bilangan yang diinput bernilai sama");
        }
        
    }
    
}
