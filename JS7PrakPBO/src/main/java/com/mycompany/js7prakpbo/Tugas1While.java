/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js7prakpbo;

/**
 * created by 21343065_PUTI ZAFANIA
 * @author cocaa
 */
import java.util.Scanner;

public class Tugas1While {
      public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        String nama = in.nextLine();
        int i=0;
        
        while (i<10){
            System.out.println(nama);
            i++;
        }
}}
