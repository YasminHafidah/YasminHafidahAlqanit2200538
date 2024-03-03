
package tugaspertemuan4;
import java.util.Scanner;
public class no3_genap {

    public static void main(String[] args) {
        int a;
        int b;
        int i;
        int max; 
        int PBT=0;
        
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        
        if(a>b){
            max=b;
        }else if(b>a){
            max=a;
        }else{
            max=a;
        }
        
        for(i=1;i<=max;i++){
            if(a%i==0 && b%i==0){
                if(PBT<i){
                    PBT=i;
                }
            }      
        } 
        System.out.println(PBT);
    }
    
}
