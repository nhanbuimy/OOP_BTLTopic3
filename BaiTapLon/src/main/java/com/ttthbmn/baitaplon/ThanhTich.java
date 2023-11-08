/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttthbmn.baitaplon;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP
 */
public class ThanhTich {
    private int soLanLam;
    private List<Double> dsDiem;

    public ThanhTich() {
        this.soLanLam = 0;
        this.dsDiem = new ArrayList<>();
    }

    public ThanhTich(int soLanLam, List<Double> dsDiem) {
        this.soLanLam = soLanLam;
        this.dsDiem = dsDiem;
    }

    public void themDiem(double diem) {
        this.dsDiem.add(diem);
    }

    public double getDiemTrungBinh() {
        return this.dsDiem.stream().mapToDouble(diem -> diem).average().getAsDouble();
    }

    public void hienThiThongTin() {
        System.out.printf("- So lan lam: %d\n", soLanLam);
        this.hienThiDsDiem();
        System.out.printf("- Diem trung binh: %.2f\n", this.getDiemTrungBinh());
    }

    public void hienThiDsDiem() {
        for (int i = 0; i < this.dsDiem.size(); i++) {
            System.out.printf("- Diem lan thu %d: %.2f\n", i + 1, this.dsDiem.get(i));
        }
    }

    /**
     * @return the soLanLam
     */
    public int getSoLanLam() {
        return soLanLam;
    }

    /**
     * @param soLanLam the soLanLam to set
     */
    public void setSoLanLam(int soLanLam) {
        this.soLanLam = soLanLam;
    }

    /**
     * @return the dsDiem
     */
    public List<Double> getDsDiem() {
        return dsDiem;
    }

    /**
     * @param dsDiem the dsDiem to set
     */
    public void setDsDiem(List<Double> dsDiem) {
        this.dsDiem = dsDiem;
    }
}
