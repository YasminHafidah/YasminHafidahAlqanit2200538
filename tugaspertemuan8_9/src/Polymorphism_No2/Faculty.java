package Polymorphism_No2;

public class Faculty extends Employee{
     private String Jam_Kerja;
     private String pangkat;
     
    Faculty(String nama, String alamat, String nomor_telepon, String alamat_email, 
            String kantor, double gaji, MyDate TanggalDiperkerjakan,String Jam_Kerja, 
            String pangkat) {
        super(nama, alamat, nomor_telepon, alamat_email, kantor, gaji, TanggalDiperkerjakan);
        this.Jam_Kerja=Jam_Kerja;
        this.pangkat=pangkat;
    }
    
    @Override
    public String toString(){
        return super.toString()+
                "Jam Kerja : "+Jam_Kerja+
                "pangkat    : "+pangkat;
    }
    
}
