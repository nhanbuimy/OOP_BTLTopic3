/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttthbmn.baitaplon;
import static com.ttthbmn.baitaplon.CauHinh.c;
import static com.ttthbmn.baitaplon.CauHinh.f;
import static com.ttthbmn.baitaplon.CauHinh.sc;
import java.text.ParseException;
import java.util.Date;
import java.util.Objects;
/**
 *
 * @author HP
 */
public class ThanhVien {
    private static int dem = 0;
    private final int maThanhVien;
    private String hoTen;
    private String queQuan;
    private String gioiTinh;
    private Date ngaySinh;
    private Date ngayGiaNhap;
    private ThanhTich thanhTich;

    {
        ngayGiaNhap = c.getTime();
        maThanhVien =++dem ;
    }

    public ThanhVien() {
    }

    public ThanhVien(String hoTen, String queQuan, String gioiTinh, Date ngaySinh) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }

    public ThanhVien(String hoTen, String queQuan, String gioiTinh, Date ngaySinh, Date ngayGiaNhap, ThanhTich thanhTich) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.ngayGiaNhap = ngayGiaNhap;
        this.thanhTich = thanhTich;
    }
    
    public ThanhVien(String hoTen, String queQuan, String gioiTinh, String ngaySinh) throws ParseException {
        this(hoTen, queQuan, gioiTinh, f.parse(ngaySinh));
    }

    
    public void nhapThongTin() throws ParseException {
        System.out.print("Ho va ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Que quan: ");
        this.queQuan = sc.nextLine();
        System.out.print("Gioi tinh: ");
        this.gioiTinh = sc.nextLine();
        System.out.print("Ngay sinh: ");
        this.ngaySinh = f.parse(sc.nextLine());
    }

    public void hienThiThongTin() {
        System.out.printf("\n== THONG TIN THANH VIEN %d ==\n", getMaThanhVien());
        System.out.printf("- Ho ten: %s\n", hoTen);
        System.out.printf("- Que quan: %s\n", queQuan);
        System.out.printf("- Gioi tinh: %s\n", gioiTinh);
        System.out.printf("- Ngay sinh: %s\n", f.format(ngaySinh));
    }
    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the ngaySinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the ngayGiaNhap
     */
    public Date getNgayGiaNhap() {
        return ngayGiaNhap;
    }

    /**
     * @param ngayGiaNhap the ngayGiaNhap to set
     */
    public void setNgayGiaNhap(Date ngayGiaNhap) {
        this.ngayGiaNhap = ngayGiaNhap;
    }

    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param aDem the dem to set
     */
    public static void setDem(int aDem) {
        dem = aDem;
    }

    public ThanhTich getThanhTich() {
        return thanhTich;
    }

    public void setThanhTich(ThanhTich thanhTich) {
        this.thanhTich = thanhTich;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ThanhVien thanhVien = (ThanhVien) o;
        return getMaThanhVien() == thanhVien.getMaThanhVien();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaThanhVien());
    }

    public String toString() {
        return String.format("- Ho ten: %s\n- Que quan: %s\n- Gioi tinh: %s\n- Ngay sinh: %s", hoTen, queQuan, gioiTinh,
                f.format(ngaySinh));
    }


    /**
     * @return the maThanhVien
     */
    public int getMaThanhVien() {
        return maThanhVien;
    }

    /**
     * @param maThanhVien the maThanhVien to set
     */
}
