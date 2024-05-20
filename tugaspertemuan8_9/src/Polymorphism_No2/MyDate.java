package Polymorphism_No2;
import java.time.LocalDate;

public class MyDate {
    private final LocalDate tanggal;
    
    public MyDate(int tahun, int bulan, int hari) {
        this.tanggal = LocalDate.of(tahun,bulan,hari);
    }

    @Override
    public String toString() {
        return tanggal.toString();
    }
}

