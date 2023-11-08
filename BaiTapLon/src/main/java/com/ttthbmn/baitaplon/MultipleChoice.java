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
public class MultipleChoice extends CauHoi {
    private List<PhuongAn> dsPhuongAn = new ArrayList<>();

    public MultipleChoice() {
    }

//    public MultipleChoice(String mucDo, String noiDung, List<PhuongAn> dsPhuongAn) {
//        super(mucDo, noiDung);
//        this.dsPhuongAn = dsPhuongAn;
//    }

    public MultipleChoice(String mucDo, String noiDung, DanhMuc danhMuc, List<PhuongAn> dsPhuongAn) {
        super(mucDo, noiDung, danhMuc);
        this.dsPhuongAn = dsPhuongAn;
    }

     public void hienThiDsPhuongAn() {
        for (int i = 0; i < this.getDsPhuongAn().size(); i++) {
            System.out.println("\t" + this.getDsPhuongAn().get(i));
        }
    }
   
    /**
     * @return the dsPhuongAn
     */
    public List<PhuongAn> getDsPhuongAn() {
        return dsPhuongAn;
    }

    /**
     * @param dsPhuongAn the dsPhuongAn to set
     */
    public void setDsPhuongAn(List<PhuongAn> dsPhuongAn) {
        this.dsPhuongAn = dsPhuongAn;
    }
     @Override
    public List<MultipleChoice> getDsCauHoi() {
        return null;
    }
}
