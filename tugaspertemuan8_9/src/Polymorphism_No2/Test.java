package Polymorphism_No2;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama = getInput(input, "Masukkan nama orang umum: ");
        String alamat = getInput(input, "Masukkan alamatnya: ");
        String telpon = getInput(input, "Masukkan nomor telepon: ");
        String email = getInput(input, "Masukkan alamat emailnya: ");
        Person orang = new Person(nama, alamat, telpon, email);
        
        String namaSiswa = getInput(input, "Masukkan nama siswa: ");
        String alamatSiswa = getInput(input, "Masukkan alamatnya: ");
        String telponSiswa = getInput(input, "Masukkan nomor telepon: ");
        String emailSiswa = getInput(input, "Masukkan alamat emailnya: ");
        int statusSiswa = Integer.parseInt(getInput(input, "Masukkan status "
                + "(1=mahasiswa baru,2=mahasiswa tahun kedua, 3=junior, 4=senior) : "));
        Student siswa = new Student(namaSiswa, alamatSiswa, telponSiswa, 
                emailSiswa, statusSiswa);
        
        String namaKaryawan = getInput(input, "Masukkan nama karyawan: ");
        String alamatKaryawan = getInput(input, "Masukkan alamatnya: ");
        String telponKaryawan = getInput(input, "Masukkan nomor telepon: ");
        String emailKaryawan = getInput(input, "Masukkan alamat emailnya: ");
        String kantorKaryawan = getInput(input, "Masukkan nama kantor: ");
        int gajiKaryawan = Integer.parseInt(getInput(input, "Masukkan gaji: "));
        System.out.println("Masukkan tanggal diperkerjakan : (tahun, bulan, tanggal)");
        int tahun = input.nextInt();
        int bulan = input.nextInt();
        int tanggal = input.nextInt();
        input.nextLine();
        MyDate hiredate = new MyDate(tahun, bulan, tanggal);     
        Employee karyawan = new Employee(namaKaryawan, alamatKaryawan, 
                telponKaryawan, emailKaryawan, kantorKaryawan, gajiKaryawan, 
                hiredate);
        
        String namaDosen = getInput(input, "Masukkan nama Dosen: ");
        String alamatDosen = getInput(input, "Masukkan alamatnya: ");
        String telponDosen = getInput(input, "Masukkan nomor telepon: ");
        String emailDosen = getInput(input, "Masukkan alamat emailnya: ");
        String kantorDosen = getInput(input, "Masukkan nama kantor: ");
        int gajiDosen = Integer.parseInt(getInput(input, "Masukkan gaji: "));
        String jam_kerja = getInput(input, "Masukkan jam kerja: ");
        String pangkat = getInput(input, "Masukkan panngkat: ");
        System.out.println("Masukkan tanggal diperkerjakan : (tahun, bulan, tanggal)");
        int tahunDosen = input.nextInt();
        int bulanDosen = input.nextInt();
        int tanggalDosen = input.nextInt();
        input.nextLine();
        MyDate bekerjaDosen = new MyDate(tahunDosen, bulanDosen, tanggalDosen); 
        Faculty dosen = new Faculty(namaDosen, alamatDosen, telponDosen, 
                emailDosen, kantorDosen, gajiDosen,bekerjaDosen,jam_kerja, pangkat);
        
        String namaStaff = getInput(input, "Masukkan nama staff: ");
        String alamatStaff = getInput(input, "Masukkan alamatnya: ");
        String telponStaff = getInput(input, "Masukkan nomor telepon: ");
        String emailStaff = getInput(input, "Masukkan alamat emailnya: ");
        String kantorStaff = getInput(input, "Masukkan nama kantor: ");
        int gajiStaff = Integer.parseInt(getInput(input, "Masukkan gaji: "));
        String gelar = getInput(input, "Masukkan gelar: ");
        System.out.println("Masukkan tanggal diperkerjakan : (tahun, bulan, tanggal)");
        int tahunStaff = input.nextInt();
        int bulanStaff = input.nextInt();
        int tanggalStaff = input.nextInt();
        input.nextLine();
        MyDate bekerjaStaff = new MyDate(tahunStaff, bulanStaff, tanggalStaff); 
        Staff staf = new Staff(namaStaff, alamatStaff, telponStaff, emailStaff, 
                kantorStaff, gajiStaff, bekerjaStaff, gelar);
        
        System.out.println(orang);
        System.out.println("");
        System.out.println(siswa);
        System.out.println("");
        System.out.println(karyawan);
        System.out.println("");
        System.out.println(dosen);
        System.out.println("");
        System.out.println(staf);
    }
    
    public static String getInput(Scanner input, String message) {
        System.out.println(message);
        return input.nextLine();
    }
}
