/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttthbmn.baitaplon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author HP
 */
public class QuanLyThanhVien {
    private List<ThanhVien> dsThanhVien = new ArrayList<>();

    public void themTv(ThanhVien...tv) {
        this.dsThanhVien.addAll(Arrays.asList(tv));
    }

    public void xoaTv(ThanhVien...tv) {
        this.dsThanhVien.removeAll(Arrays.asList(tv));
    }
    
    public void thongKe(ThanhVien tv) {
        tv.hienThiThongTin();
        tv.getThanhTich().hienThiThongTin();
    }

    public void hienThiDS() {
        this.dsThanhVien.forEach(thanhVien -> thanhVien.hienThiThongTin());
    }

    /**
     * tra cuu theo ma thanh vien
     *
     * @param maThanhVien
     * @return học viên tương ứng
     */
    public ThanhVien traCuu(int maThanhVien) {
        return this.dsThanhVien.stream().filter(thanhVien -> thanhVien.getMaThanhVien() == maThanhVien).findFirst().orElse(null);
    }

    /**
     * Tra cuu theo tu khoa
     * @param tuKhoa
     * @return Cac học vien tra cuu duoc
     */
    public List<ThanhVien> traCuu(String tuKhoa) {
        return this.dsThanhVien.stream().filter(thanhVien -> thanhVien.getHoTen().equals(tuKhoa) || thanhVien.getQueQuan().equals(tuKhoa)
                || thanhVien.getGioiTinh().equals(tuKhoa)).collect(Collectors.toList());
    }

    /**
     * tra cuu theo ngay sinh
     * @param ngaySinh
     * @return cac học vien tra cuu duoc
     */
    public List<ThanhVien> traCuu(Date ngaySinh){
        return this.dsThanhVien.stream().filter(thanhVien -> thanhVien.getNgaySinh().equals(ngaySinh)).collect(Collectors.toList());
    }
    /**
     * @return the dsThanhVien
     */
    public List<ThanhVien> getDsThanhVien() {
        return dsThanhVien;
    }

    /**
     * @param dsThanhVien the dsThanhVien to set
     */
    public void setDsThanhVien(List<ThanhVien> dsThanhVien) {
        this.dsThanhVien = dsThanhVien;
    }
}
