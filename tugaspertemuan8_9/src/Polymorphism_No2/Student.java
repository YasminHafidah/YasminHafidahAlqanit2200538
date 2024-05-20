package Polymorphism_No2;


public class Student extends Person{
    public static final int mahasiswa_baru = 1;
    public static final int mahasiswa_tahun2 = 2;
    public static final int junior = 3;
    public static final int senior = 4;
    
    private int status;
    
    Student(String nama, String alamat, String nomor_telepon, String alamat_email, int status){
        super(nama, alamat, nomor_telepon, alamat_email);
        this.status=status;
    }
    
     public String getStatusString() {
        return switch (status) {
            case 1 -> "Mahasiswa Baru";
            case 2 -> "Mahasiswa Tahun 2";
            case 3 -> "Junior";
            case 4 -> "Senior";
            default -> "Unknown";
        };
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Status: " + getStatusString();
    }
}
