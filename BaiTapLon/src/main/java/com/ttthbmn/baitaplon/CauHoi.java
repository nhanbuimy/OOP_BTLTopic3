/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttthbmn.baitaplon;

import static com.ttthbmn.baitaplon.CauHinh.sc;
import java.util.List;
import java.util.Objects;
/**
 *
 * @author HP
 */
public abstract class CauHoi {
    private static int dem = 0;
    private final int maCauHoi;
    private String mucDo;
    private String noiDung;
    private DanhMuc danhMuc;

    {
        maCauHoi = ++dem;
    }

    public CauHoi() {
    }

//    public CauHoi(String mucDo, String noiDung) {
//        this.mucDo = mucDo;
//        this.noiDung = noiDung;
//
//    }

    public CauHoi(String mucDo, String noiDung, DanhMuc danhMuc) {
        this.mucDo = mucDo;
        this.noiDung = noiDung;
        this.danhMuc = danhMuc;
    }

    public void nhapThongTin() {
        System.out.print(" - Muc do (De / Trung binh / Kho) : ");
        this.mucDo = sc.nextLine();
        System.out.print("- Noi dung: ");
        this.noiDung = sc.nextLine();

    }

    public void hienThiThongTin() {
        System.out.printf("\n====THONG TIN CAU HOI %d ====\n", maCauHoi);
        System.out.printf("- Muc do: %s\t\t", mucDo);
        System.out.printf("- Danh muc: %s\n", danhMuc.getTenDanhMuc());
        System.out.printf("- Noi dung: %s\n", noiDung);
    }

    public abstract List<MultipleChoice> getDsCauHoi();

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

    /**
     * @return the maCauHoi
     */
    public int getMaCauHoi() {
        return maCauHoi;
    }

    /**
     * @param maCauHoi the maCauHoi to set
     */
   
    /**
     * @return the noiDung
     */
    public String getNoiDung() {
        return noiDung;
    }

    /**
     * @param noiDung the noiDung to set
     */
    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    /**
     * @return the mucDo
     */
    public String getMucDo() {
        return mucDo;
    }

    /**
     * @param mucDo the mucDo to set
     */
    public void setMucDo(String mucDo) {
        this.mucDo = mucDo;
    }

    /**
     * @return the danhMuc
     */
    public DanhMuc getDanhMuc() {
        return danhMuc;
    }

    /**
     * @param danhMuc the danhMuc to set
     */
    public void setDanhMuc(DanhMuc danhMuc) {
        this.danhMuc = danhMuc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;

        }
        CauHoi cauHoi = (CauHoi) o;
        return maCauHoi == cauHoi.maCauHoi;

    }

    @Override
    public int hashCode() {
        return Objects.hash(maCauHoi);
    }

//    @Override
//    public String toString() {
//        return String.format("- Muc do: %s\t\t-Danh muc: %s\n-noi dung: %s", getMucDo(), danhMuc.getTenDanhMuc(), noiDung);
//    }

}
