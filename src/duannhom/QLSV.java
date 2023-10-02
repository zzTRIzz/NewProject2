/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duannhom;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class QLSV {
    ArrayList<SinhVien> listSV = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void nhapDS(){
        SinhVien sv = new SinhVien();
        System.out.println("Xin moi nhap ma: ");
        sv.setMaSV(sc.nextLine());
        System.out.println("Xin mo nhap ten: ");
        sv.setTenSV(sc.nextLine());
        System.out.println("Xin moi nhap tuoi: ");
        sv.setTuoi(Integer.parseInt(sc.nextLine()));
        listSV.add(sv);
        
        
    }
}
