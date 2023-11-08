/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttthbmn.baitaplon;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class CauHinh {
    public static final Scanner sc = new Scanner(System.in);
    public static final SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    public static final GregorianCalendar c = new GregorianCalendar();
    
    public static final QuanLyCauHoi quanLyCauHoi = new QuanLyCauHoi();
    public static final QuanLyDanhMuc quanLyDanhMuc = new QuanLyDanhMuc();
    public static final QuanLyThanhVien quanLyThanhVien = new QuanLyThanhVien();
}
