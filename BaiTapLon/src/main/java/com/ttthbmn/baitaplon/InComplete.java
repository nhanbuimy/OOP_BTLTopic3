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
public class InComplete extends CauHoi {
    private List<MultipleChoice> dsCauHoi = new ArrayList<>();

    public InComplete() {
    }
    public InComplete(String mucDo, String noiDung, DanhMuc danhMuc, List<MultipleChoice> dsCauHoi) {
        super(mucDo, noiDung, danhMuc);
        this.dsCauHoi = dsCauHoi;
    }

    /**
     * @return the dsCauHoi
     */
    @Override
    public List<MultipleChoice> getDsCauHoi() {
        return dsCauHoi;
    }

    /**
     * @param dsCauHoi the dsCauHoi to set
     */
    public void setDsCauHoi(List<MultipleChoice> dsCauHoi) {
        this.dsCauHoi = dsCauHoi;
    }
}
