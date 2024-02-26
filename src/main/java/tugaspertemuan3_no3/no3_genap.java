package tugaspertemuan3_no3;
import java.util.Scanner;
public class no3_genap {
    public static void main(String[] args) {
        int jam_masuk;
        int jam_keluar;
        int temp;
        int durasi;
        int parkir = 1500;
        int tambahan;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jam Masuk Kendaraan : ");
        jam_masuk = input.nextInt();
        System.out.println("Masukkan Jam Keluar Kendaraan : ");
        jam_keluar = input.nextInt();
        
        if(jam_keluar<jam_masuk){
            durasi = (jam_keluar + 12) - jam_masuk;
        }else{
            durasi = jam_keluar - jam_masuk;
        }
        
        if(durasi>2){
            temp = durasi-2;
            tambahan = temp*1000;
            parkir = parkir + tambahan;           
        }
        
        System.out.println("Durasi parkir Anda : "+durasi+ " jam, tarif parkir Anda = Rp "+parkir);
    }
}
