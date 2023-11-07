/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class QuanLyNhanVien {
    ArrayList<NhanVien> listNhanVien = new ArrayList<>();
    public QuanLyNhanVien(){
         listNhanVien.add(new NhanVien("NV001","Le Trung Hieu",18,"hieult@fpt.edu.vn",20000000));
        listNhanVien.add(new NhanVien("NV002","To Minh Hoang",18,"hoanglt@fpt.edu.vn",30000000));
        listNhanVien.add(new NhanVien("NV003","Luu Tien Dat",18,"datlt@fpt.edu.vn",10000000));
    }
    ArrayList<NhanVien> getListNhanVien(){
       
        return listNhanVien;
    }
    Boolean them(NhanVien nhanVien){
       listNhanVien.add(nhanVien);
       return true;
    }
    Boolean delete(String id){
       
        for (int i = 0; i < listNhanVien.size() ; i++) {
            if(listNhanVien.get(i).getMaNhanVien().equals(id)){
                listNhanVien.remove(i);
            }
        }
    return true;
}
    ArrayList<NhanVien> timKiem(String ma){
        ArrayList<NhanVien> ketQuaTim = new ArrayList<>();
        for (NhanVien nhanVien : listNhanVien) {
            if(nhanVien.getMaNhanVien().equals(ma)){
               ketQuaTim.add(nhanVien);
            }
        }
        return ketQuaTim;
    }
}
