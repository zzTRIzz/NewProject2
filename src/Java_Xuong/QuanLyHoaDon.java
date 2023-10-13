/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Xuong;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class QuanLyHoaDon {
    ArrayList<HoaDon> listHoaDon = new ArrayList<>();

    public QuanLyHoaDon() {
        listHoaDon.add(new HoaDon("HD001", 10-14-2022, "TRI", 0, 0, 0));
       
    }

    ArrayList<HoaDon> getListHoaDon() {
   
        return listHoaDon;
    }
}
