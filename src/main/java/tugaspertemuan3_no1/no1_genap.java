package tugaspertemuan3_no1;
import java.util.Scanner;
public class no1_genap {
    public static void main(String[] args) {
        int angka;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Bilangan : ");
        angka = input.nextInt();
        
        if(angka/1000<10 && angka/1000>=1){
            System.out.println("Angka yang diinputkan yaitu "+angka+" merupakan angka ribuan");
        }else{
            System.out.println("Angka yang diinputkan yaitu "+angka+" bukan merupakan angka ribuan");
        }
    }
}
