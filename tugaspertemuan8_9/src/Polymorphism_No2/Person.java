package Polymorphism_No2;

public class Person {
    String nama;
    String alamat;
    String nomor_telepon;
    String alamat_email;
    
    Person(){
    }
    
    Person(String nama, String alamat, String nomor_telepon, String alamat_email){
        this.nama = nama;
        this.alamat = alamat;
        this.nomor_telepon = nomor_telepon;
        this.alamat_email = alamat_email;
    }
    
    public String toString(){
        return "Nama: " + nama + 
           ", Alamat: " + alamat + 
           ", Nomor Telepon: " + nomor_telepon + 
           ", Alamat Email: " + alamat_email;
    }
}
