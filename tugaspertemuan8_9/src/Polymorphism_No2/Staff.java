
package Polymorphism_No2;

public class Staff extends Employee{
    private String gelar;
    public Staff(String nama, String alamat, String nomor_telepon, String alamat_email, 
            String kantor, double gaji, MyDate TanggalDiperkerjakan, String gelar) {
        super(nama, alamat, nomor_telepon, alamat_email, kantor, gaji, TanggalDiperkerjakan);
        this.gelar = gelar;
    }
    
     @Override
    public String toString(){
        return super.toString()+
               "Gelar : "+gelar;
    }
}
