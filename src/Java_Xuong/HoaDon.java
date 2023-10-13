/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Xuong;

/**
 *
 * @author ADMIN
 */
public class HoaDon {
    private String maHD;
    private long  ngayTao;
    private String tenNV;
    private double tongTien;
    private double tienThua;
    private double tienKhachDua;

    public HoaDon() {
    }

    public HoaDon(String maHD, long ngayTao, String tenNV, double tongTien, double tienThua, double tienKhachDua) {
        this.maHD = maHD;
        this.ngayTao = ngayTao;
        this.tenNV = tenNV;
        this.tongTien = tongTien;
        this.tienThua = tienThua;
        this.tienKhachDua = tienKhachDua;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public long getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(long ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public double getTienThua() {
        return tienThua;
    }

    public void setTienThua(double tienThua) {
        this.tienThua = tienThua;
    }

    public double getTienKhachDua() {
        return tienKhachDua;
    }

    public void setTienKhachDua(double tienKhachDua) {
        this.tienKhachDua = tienKhachDua;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "maHD=" + maHD + ", ngayTao=" + ngayTao + ", tenNV=" + tenNV + ", tongTien=" + tongTien + ", tienThua=" + tienThua + ", tienKhachDua=" + tienKhachDua + '}';
    }
    
    
    
    
}
