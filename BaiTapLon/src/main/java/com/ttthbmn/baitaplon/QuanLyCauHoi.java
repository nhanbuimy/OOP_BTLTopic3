/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttthbmn.baitaplon;
import static com.ttthbmn.baitaplon.CauHinh.sc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
/**
 *
 * @author HP
 */
public class QuanLyCauHoi {
    private List<CauHoi> dsCauHoi = new ArrayList<>();

    public static int random(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public static List<MultipleChoice> nhapDsMultipleChoice(int soLuong) {
        List<MultipleChoice> dsCauHoi = new ArrayList<>();
        for (int i = 0; i < soLuong; i++) {
            MultipleChoice cauHoi = new MultipleChoice();
            cauHoi.nhapThongTin();
            System.out.print("- Nhap so luong phuong an: ");
            int soLuongPA = Integer.parseInt(sc.next());
            List<PhuongAn> dsPhuongAn = PhuongAn.nhapDsPhuongAn(soLuongPA);
            cauHoi.setDsPhuongAn(dsPhuongAn);
            dsCauHoi.add(cauHoi);
        }
        return dsCauHoi;
    }

    public void themCauHoi(CauHoi... dsCauHoi) {
        this.dsCauHoi.addAll(Arrays.asList(dsCauHoi));
    }

    public void xoaCauHoi(CauHoi... dsCauHoi) {
        this.dsCauHoi.removeAll(Arrays.asList(dsCauHoi));
    }

    public void hienThiDS() {
        this.getDsCauHoi().forEach(cauHoi -> cauHoi.hienThiThongTin());
    }

    public CauHoi traCuuTheoId(int maCauHoi) {
        return this.getDsCauHoi().stream().filter(cauHoi -> cauHoi.getMaCauHoi() == maCauHoi).findFirst().orElse(null);
    }

    /**
     * Tìm kiếm câu hỏi theo nội dung hoặc mức độ
     *
     * @param tuKhoa Nội dung, mức độ
     * @return Danh sách câu hoi thỏa điều kiện
     */
    public List<CauHoi> traCuu(String tuKhoa) {
        return this.getDsCauHoi().stream()
                .filter(cauHoi -> cauHoi.getNoiDung().equalsIgnoreCase(tuKhoa) || cauHoi.getMucDo().equalsIgnoreCase(tuKhoa))
                .collect(Collectors.toList());
    }

    public CauHoi randomCauHoi(String type, String mucDo) throws ClassNotFoundException {
        Class c = Class.forName(type);
        List<CauHoi> ds = this.getDsCauHoi().stream()
                .filter(cauHoi -> c.isInstance(cauHoi) && cauHoi.getMucDo().equalsIgnoreCase(mucDo)).collect(Collectors.toList());
        return ds.get(random(0, ds.size() - 1));
    }

    public List<CauHoi> randomCauHoi(String type, int soLuong) throws ClassNotFoundException {
        List<CauHoi> ds = new ArrayList<>();
        Class c = Class.forName(type);
        for (int i = 0; i < soLuong; i++) {
            CauHoi cauHoi = this.getDsCauHoi().get(random(0, this.getDsCauHoi().size() - 1));
            if (c.isInstance(cauHoi) && !ds.contains(cauHoi)) {
                ds.add(cauHoi);
            }
        }
        return ds;
    }

    public List<CauHoi> getDsCauHoi() {
        return dsCauHoi;
    }

    private Object dsCauHoi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @param dsCauHoi the dsCauHoi to set
     */
    //public void setDsCauHoi(List<CauHoi> dsCauHoi) {
    //    this.dsCauHoi = dsCauHoi;
    //}
}
