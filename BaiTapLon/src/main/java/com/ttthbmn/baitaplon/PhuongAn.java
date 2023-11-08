/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttthbmn.baitaplon;
import static com.ttthbmn.baitaplon.CauHinh.sc;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP
 */
public class PhuongAn {
     private String noiDung;
    private boolean dapAn;
    private String giaiThich;

    public PhuongAn() {
    }

    public PhuongAn(String noiDung, boolean dapAn, String giaiThich) {
        this.noiDung = noiDung;
        this.dapAn = dapAn;
        this.giaiThich = giaiThich;
    }

    public void nhapThongTin() {
        System.out.print("-Noi dung: ");
        this.noiDung = sc.nextLine();
        System.out.print("- Dap an dung (0: Dung, 1: Sai): ");
        String dapAn = sc.nextLine();
        this.dapAn = dapAn.equals("0") || dapAn.equalsIgnoreCase("Dung");
        System.out.print("- Giai thich: ");
        this.giaiThich = sc.nextLine();

    }

    public static List<PhuongAn> nhapDsPhuongAn(int soLuong) {
        List<PhuongAn> dsPhuongAn = new ArrayList<>();
        for (int i = 0; i < soLuong; i++) {
            PhuongAn phuongAn = new PhuongAn();
            phuongAn.nhapThongTin();
            dsPhuongAn.add(phuongAn);
        }
        return dsPhuongAn;
    }

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
     * @return the dapAn
     */
    public boolean isDapAn() {
        return dapAn;
    }

    /**
     * @param dapAn the dapAn to set
     */
    public void setDapAn(boolean dapAn) {
        this.dapAn = dapAn;
    }

    /**
     * @return the giaiThich
     */
    public String getGiaiThich() {
        return giaiThich;
    }

    /**
     * @param giaiThich the giaiThich to set
     */
    public void setGiaiThich(String giaiThich) {
        this.giaiThich = giaiThich;
    }

    @Override
    public String toString() {
        return noiDung;
    }
}
