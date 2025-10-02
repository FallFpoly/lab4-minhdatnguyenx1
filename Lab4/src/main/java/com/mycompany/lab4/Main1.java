/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author Admin
 */
public class Main1 {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham("Laptop", 15000000, 2000000);
        sp1.xuat();

        System.out.println("--------------------");

        SanPham sp2 = new SanPham("Điện thoại", 10000000, 1500000);
        sp2.xuat();
        
        
    }
}
