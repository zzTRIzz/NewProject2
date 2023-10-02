/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duannhom;

/**
 *
 * @author Ngo Nhan
 */
public class SinhVien {
    private String maSV;
    private String tenSV;
    private int tuoi;

    public SinhVien() {
    }

    public SinhVien(String maSV, String tenSV, int tuoi) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.tuoi = tuoi;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", tenSV=" + tenSV + ", tuoi=" + tuoi + '}';
    }
    
    public void inThongTin(){
        System.out.println("SinhVien{" + "maSV=" + maSV + ", tenSV=" + tenSV + ", tuoi=" + tuoi + '}');
    }
    
    
}
