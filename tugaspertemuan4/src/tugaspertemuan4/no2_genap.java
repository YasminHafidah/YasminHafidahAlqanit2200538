
package tugaspertemuan4;
import java.util.Scanner;
public class no2_genap {
    public static void main(String[] args) {
        int batasAwal;
        int batasAkhir;
        int i;
        int jumlah = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Batas Awal = ");
        batasAwal=input.nextInt();
        System.out.println("Batas Akhir = ");
        batasAkhir=input.nextInt();
        
        if(batasAwal%2==0 || batasAkhir%2==0){
            batasAwal=batasAwal+1;
            batasAkhir=batasAkhir-1;
        }
        
        for(i=batasAwal;i<=batasAkhir;i++){
            if(i%2!=0){
                continue;
            }
            jumlah = jumlah + i;
        }
        
        System.out.println("Jumlah deret bilangan genap = "+jumlah);
    }
    
}
