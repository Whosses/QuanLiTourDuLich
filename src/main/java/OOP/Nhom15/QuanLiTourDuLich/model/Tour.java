package OOP.Nhom15.QuanLiTourDuLich.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Tour {
    //Bắt đầu khởi tạo biến nè
    private String maTour;
    private String tenTour;
    private String diaDiem;
    private double giaTour;
    private int soNgay;
    private String phuongTien;
    private String huongDanVien;
    private LocalDate ngayBatDau;
    private LocalDate ngayKetThuc;

    //Formatter cho LocalDate đây nhé ai cần giải thích thì note vào
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/mm/yyyy");

    //==================== CONSTRUCTORS ====================
    public Tour() {}

    public Tour(String maTour, String tenTour, String diaDiem, double giaTour, int soNgay, String phuongTien, String huongDanVien, LocalDate ngayBatDau, LocalDate ngayKetThuc) {
        this.maTour = maTour;
        this.tenTour = tenTour;
        this.diaDiem = diaDiem;
        this.giaTour = giaTour;
        this.soNgay = soNgay;
        this.phuongTien = phuongTien;
        this.huongDanVien = huongDanVien;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    //Cái này là CONSTRUCTOR sao chép nhe
    public Tour(Tour other) {
        this.maTour = other.maTour;
        this.tenTour = other.tenTour;
        this.diaDiem = other.diaDiem;
        this.giaTour = other.giaTour;
        this.soNgay = other.soNgay;
        this.phuongTien = other.phuongTien;
        this.huongDanVien = other.huongDanVien;
        this.ngayBatDau = other.ngayBatDau;
        this.ngayKetThuc = other.ngayKetThuc;
    }
 
}
