/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package duannhom;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class main {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int chon;
        Scanner sc = new Scanner(System.in);
        QLSV so1 = new QLSV();
        do {
            System.out.println("------------Menu-------------");
            System.out.println("1. Nhap thong tin sinh vien ");
            System.out.println("2. Xuat thong tin sinh vien");
            System.out.println("3. Tim kiem theo lop");
            System.out.println("3. Tim kiem theo lop");
            System.out.println("4. Xoa sinh vien bang id");
            System.out.println("0. Thoat");
            System.out.println("----------------------------------");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    so1.nhapDS();
                    break;
                case 2:
                    so1.xuatDS();
                    break;
                case 3:
                    so1.timKiem();
                    break;
                case 0:
                    System.exit(0);
                    break;

            }
        } while (chon != 0);
    }
}
