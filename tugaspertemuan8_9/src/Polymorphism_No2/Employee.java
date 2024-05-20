
package Polymorphism_No2;

public class Employee extends Person{
    protected String kantor;
    protected double gaji;
    protected MyDate tanggalDiperkerjakan;
    
    public Employee(String nama, String alamat, String nomor_telepon, 
            String alamat_email, String kantor, double gaji, MyDate hiredate){
        super(nama, alamat, nomor_telepon, alamat_email);
        this.kantor=kantor;
        this.gaji=gaji;
        this.tanggalDiperkerjakan=hiredate;
    }
    
    @Override
public String toString() {
    return super.toString()+
           ", Gaji: " + gaji +
           ", Tanggal Diperkerjakan: " + tanggalDiperkerjakan.toString();
}

}
