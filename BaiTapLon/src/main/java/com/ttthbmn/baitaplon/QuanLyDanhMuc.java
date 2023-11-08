/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttthbmn.baitaplon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author HP
 */
public class QuanLyDanhMuc {
    private List<DanhMuc> dsDanhMuc = new ArrayList<>();

    public List<DanhMuc> getDsDanhMuc() {
        return dsDanhMuc;
    }

    public void themDanhMuc(DanhMuc... dsDanhMuc) {
        this.dsDanhMuc.addAll(Arrays.asList(dsDanhMuc));
    }

    public void xoaDanhMuc(DanhMuc... dsDanhMuc) {
        this.dsDanhMuc.removeAll(Arrays.asList(dsDanhMuc));
    }

    public void hienThiDS() {
        this.dsDanhMuc.forEach(danhMuc -> danhMuc.hienThiThongTin());
    }

    public DanhMuc traCuu(String tenDanhMuc) {
        return this.dsDanhMuc.stream().filter(danhMuc -> danhMuc.getTenDanhMuc().equals(tenDanhMuc)).findFirst().orElse(null);
    }
}
